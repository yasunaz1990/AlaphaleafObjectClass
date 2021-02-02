import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {


    @Test
    public void introToLinkedList() {
        LinkedList<String> coins = new LinkedList<>();
        coins.add("ALGO");     //idx=0
        coins.add("Lite");     //idx=1
        coins.add("Neo");      //idx=2
        coins.add("Pxx");      //idx=3

        System.out.println( coins             );
        System.out.println( coins.get(1)      );
        System.out.println( coins.size()      );
        System.out.println( coins.size() - 1  );

        coins.remove("Pxx");
        coins.remove(2);

        System.out.println( coins             );
    }
}

