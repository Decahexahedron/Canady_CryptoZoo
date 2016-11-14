package cryptozoo;

import java.util.Scanner;

public class CryptoZoo {

    static boolean play;

    public static void main(String[] args) {
        Zoo menagerie = new Zoo();
        menagerie.init();
        play = true;
        while (play) {
            choice(menagerie);
        }
    }

    public static void choice(Zoo menagerie) {
        System.out.println("What would you like to do?");
        System.out.println("1. List Animals");
        System.out.println("2. List Touring Animals");
        System.out.println("3. List Onsite Animals");
        System.out.println("4. Put Animal on Tour / Recall Animal");
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        if (input > 0 && input < 5) {
            if (input == 1) {
                menagerie.showall();
            } else if (input == 2) {
                tourList(menagerie);
            } else if (input == 3) {
                siteList(menagerie);
            } else if (input == 4) {
                toggleTour(menagerie);
            }
        } else {
            System.out.println("Wrong choice, try again (type a number).");
            choice(menagerie);
        }
    }

    public static void tourList(Zoo menagerie) {
        for (Animal i : menagerie.list) {
            if (i.tour) {
                i.toString();
                System.out.println(i.toString());
                System.out.println("Food Type: " + i.getFoodType());
                System.out.println("Amount of Food: " + i.getFoodAmt());
                System.out.println("Food per Week: " + i.foodPerWeek());
                System.out.println("______________________________________\n");
            }
        }
    }

    public static void siteList(Zoo menagerie) {
        for (Animal i : menagerie.list) {
            if (!i.tour) {
                i.toString();
                System.out.println(i.toString());
                System.out.println("Food Type: " + i.getFoodType());
                System.out.println("Amount of Food: " + i.getFoodAmt());
                System.out.println("Food per Week: " + i.foodPerWeek());
                System.out.println("______________________________________\n");
            }
        }
    }

    public static void toggleTour(Zoo menagerie) {
        for (Animal i : menagerie.list) {
            if (i.tour) {
                i.tour = false;
            } else if (!i.tour) {
                i.tour = true;
            }
        }
    }
}
