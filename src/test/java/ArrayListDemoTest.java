import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayListDemoTest {

    @Test
    public void problem() {

        int[] numbers = {10, 11, 27, 89};  //[10][11][27][89]
        System.out.println(Arrays.toString(numbers));

        // 110
        // 1. make a new bigger int array
        int[] newNumbers = new int[5];
        newNumbers[0] = 10;
        newNumbers[1] = 11;
        newNumbers[2] = 27;
        newNumbers[3] = 89;

        //[10][11][27][89][0]
        newNumbers[4] = 110;

        System.out.println(Arrays.toString(newNumbers));

        int[] yetAnotherArray = new int[4];
        yetAnotherArray[0] = 10;
        yetAnotherArray[1] = 27;
        yetAnotherArray[2] = 89;
        yetAnotherArray[3] = 110;

        System.out.println(Arrays.toString(yetAnotherArray));
    }


    @Test
    public void solution() {

        // Created an object from ArrayList class
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //[10][11][27][89]
        numbers.add(10);
        numbers.add(11);
        numbers.add(27);
        numbers.add(89);
        System.out.println(numbers);
        // add 110
        numbers.add(110);
        System.out.println(numbers);

        // remove 11,
        numbers.remove(1);
        System.out.println(numbers);

    }

    @Test
    public void arrayListOfNames() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("guli");    // 0
        names.add("alishir"); // 1
        names.add("Luis");    // 2
        names.add("Ebony");   // 3
        names.add("Ebony");   // 4
        names.add("Yadira");  // 5
        names.add("Buket");   // 6
        System.out.println("Size: " + names.size());
        boolean addingStatus = names.add("Nijat");
        System.out.println("Were you able to add him?: " + addingStatus);
        System.out.println(names);
        names.remove(2);   // it removes "Luis" from the collection
        System.out.println(names);
        names.remove("Ebony");
        System.out.println(names);
        boolean result =names.isEmpty();
        System.out.println(result);
        boolean isThere = names.contains("Yadira");
        System.out.println("Yes that item is in the list: " + isThere);
        String targetName = names.get(0);
        System.out.println("Item at index 0: " + targetName);
        ArrayList<Character> grade = new ArrayList<>();
        boolean ret2 = grade.isEmpty();
        System.out.println(ret2);
        System.out.println(grade.size());
        // Methods:
        // boolean add(object);
        // object remove(index);
        // boolean isEmpty();
        // boolean contains(object);
        // object get(index);
        // int size();
    }

    @Test
    public void traversingArrayList() {
        // 1. ArrayList<String> variable, calling it cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");   // 0
        cities.add("Tokyo");      // 1
        cities.add("Paris");      // 2
        cities.add("London");     // 3
        cities.add("Beijing");    // 4
        cities.add("Urumqi");     // 5
        cities.add("New York");   // 6
        cities.add("Izmir");      // 7  <--  cities.size()-1

        System.out.println("This collection cotains number: " + cities.size());
        int lastIdx = cities.size() -1;
        System.out.println("Last index number is : " + lastIdx);

        System.out.println("Before: " + cities);

        // Manipulation of collection
        for (int i = 0; i <= cities.size() - 1; i++) {
            String city = cities.get(i);
            String upper = city.toUpperCase();
            cities.set(i, upper);             // replace
        }

        System.out.println("After:  " + cities);
    }


    @Test
    public void replacingValueInArrayList() {
        ArrayList<Double> creditScores = new ArrayList<>();
        creditScores.add(667.90);  // 0

        System.out.println(creditScores);
        creditScores.set(1, 698.90);

    }

    @Test
    public void creatingRandomValueCollection() {
        ArrayList<String> rands = new ArrayList<>();
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
            rands.add(faker.name().fullName());
        }

        System.out.println(rands);
    }

    @Test
    public void sizeOfArrayListPractice() {
        ArrayList<Character> grades = new ArrayList<>();
        grades.add('A');  // i=0
        grades.add('B');  // i=1
        grades.add('C');  // i=2
        grades.add('D');  // i=3

        System.out.println("We have total grade of: " + grades.size() );

        for(int i = 0; i <= grades.size()-1; i++ ) {
            System.out.println("Grade: " + grades.get(i));
        }
    }


}
