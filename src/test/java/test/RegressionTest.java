package test;// Test Class:  java class that contains test cases
//  SmokeTest
//  test.RegressionTest
//  FunctionalTest

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class RegressionTest {

    // Test Case 1
    @Test
    public void testCaseOne() {
        Faker faker = new Faker();
        String data = faker.ancient().hero();
        System.out.println(data);
    }

    // Test Case 2
    @Test
    public void testCaseTwo() {
        Faker faker = new Faker();
        String data = faker.internet().domainName();
        System.out.println("Domain: " + data);
    }


    // Test Case 3
    @Test
    public void testCaseThree() {
        Faker faker = new Faker();
        String data = faker.aviation().aircraft();
        System.out.println("Aircraft: " + data);
    }

    // Test Case 4


    // Test Case 5


    // Test Case 6
}
