import org.testng.annotations.Test;

public class PracticeLoop {


    @Test
    public void infiniteLoop() {
        for (int i = 1; i <= 10; ++i) {
            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
