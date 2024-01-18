package kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Pablo", LocalDate.of(2002,6,17));
        System.out.println(person1);
        System.out.println(person1.toAge());
    }
}
