import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingJsonFile {

    @Test
    public void readingTest() {
        String file = System.getProperty("user.dir") + "/data.json";
        String output = readFileAsString(file);
        System.out.println(output);
    }


    public static String readFileAsString(String file)  {
        String output = "";
        try {
            output =  new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

}
