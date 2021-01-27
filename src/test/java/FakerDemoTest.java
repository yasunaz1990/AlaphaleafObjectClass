import com.github.javafaker.Faker;

public class FakerDemoTest {

    // Main method
    public static void main(String[] args) {

        // 1. Create an faker object from Faker class
        Faker faker = new Faker();

        // 2. Create a String variable, then generate the fake data
        //    and store to the string.
        String generated = faker.code().isbn10();


        // Proving you that this is random
        for(int i = 0; i < 10; i++) {
            // ---- Fake data generation-------
            // String data = faker.name().fullName();
            // String data = faker.address().fullAddress();
            // String data = faker.internet().password();
            // String data = faker.name().username();
            // String data = faker.phoneNumber().phoneNumber();
            // String data = faker.phoneNumber().cellPhone();
            // String data = faker.idNumber().ssnValid();
            // String data = faker.idNumber().invalid();
            // String data = faker.company().name();
            // String data = faker.company().industry();
            // String data = faker.code().isbn10();
            int data = faker.number().randomDigit();

            pause(1);
            System.out.println(data);
        }

    }

    // Pause for given second
    public static void pause(int second) {
        try {
            Thread.sleep(second * 1000);
        }
        catch (InterruptedException ignore) {
            // DO NOTHING
        }
    }


}


