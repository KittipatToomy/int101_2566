package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }

    static void work01Utilitor() {

        System.out.println(Utilitor.testString("Hello World"));
        System.out.println(Utilitor.testPositive(50));
        System.out.println(Utilitor.computeIsbn10(234567659));
    }

    static void work02Person() {

        Person f = new Person("Tom", "Kittipat");
        System.out.println(f);
        Person s = new Person("Kittipat", "Tom");
        System.out.println(s);

    }

    static void work03Account() {

        Person f = new Person("Tom", "Kittipat");
        Account bankF = new Account(f);
        Person s = new Person("Kittipat", "Tom");
        Account bangS = new Account(s);
        bankF.deposit(10000);
        bangS.deposit(5000);
        bangS.withdraw(2500);
        bankF.transfer(5000, bangS);
        System.out.println(bankF);
        System.out.println(bangS);
    }
}
