package sets;

import org.testng.annotations.Test;

import java.util.*;

public class SetDemo {

    @Test
    public void setCollectionDemo() {

        HashSet<String> nameSets = new HashSet<>();
        nameSets.add("Guli");
        nameSets.add("Guli");
        nameSets.add("Guli");
        nameSets.add("Buket");
        nameSets.add("Ebony");
        nameSets.add("Nathan");

        System.out.println(   nameSets    );

        nameSets.remove("Ebony");

        System.out.println(   nameSets    );

        System.out.println(   nameSets.contains("Nijat")   );

        System.out.println(   nameSets.size()  );

    }


    @Test
    public void countUniqueWords() {

        // 1. You have long string
        String phrase = "Guli Guli Guli Nathan Nathan Nathan Buket Buket Buket Buket Yadira Yadira Yadira";

        // 2. Split the long string with " "
        String[] wordsArray =  phrase.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        // 3. Prepare a set collection
        HashSet<String> uniqueWords = new HashSet<>();

        // 4. Iterate each words, add each of the word into the Set collection
        for(int i = 0; i <= wordsArray.length-1; i++) {
            uniqueWords.add(wordsArray[i]);
        }

        // 5. Print the size of the Set collection
        System.out.println("Uniqaue are: " + uniqueWords.size());
    }



}

