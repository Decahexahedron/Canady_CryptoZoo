package cryptozoo;

import java.util.Scanner;

public class CryptoZoo {

    static boolean play;

    public static void main(String[] args) {
        Zoo menagerie = new Zoo();
        menagerie.init();
        while (play) {
            choice();
        }
    }

    public static void choice() {
        System.out.println("What would you like to do?");
        System.out.println("1. List Animals");
        System.out.println("2. List Touring Animals");
        System.out.println("3. List Onsite Animals");
        System.out.println("4. Add Animal");
        System.out.println("5. Remove Animal");
        System.out.println("6. Put Animal on Tour / Recall Animal");
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        if (input > 0 && input < 7) {

        }
    }

    public static void addAnimal() {

    }

    public static void tourList() {

    }

    public static void onsiteList() {

    }
}
