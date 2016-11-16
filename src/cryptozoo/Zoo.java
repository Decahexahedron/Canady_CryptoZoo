package cryptozoo;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> list = new ArrayList<>();

    void init() {
        Mythical myth1 = new Mythical("Unicorn", "The Sky", 6, "Rainbows", 1);
        list.add(myth1);
        Mythical myth2 = new Mythical("Pepe", "The Memeoverse", 2, "Memes", 10);
        list.add(myth2);
        Mythical myth3 = new Mythical("Griffin", "Narnia", 8, "People", 2);
        list.add(myth3);
        Mythical myth4 = new Mythical("Manticore", "Persia", 10, "Poison", 5);
        list.add(myth4);
        Paranormal par1 = new Paranormal("Kindred", "Underworld", 6);
        list.add(par1);
        Paranormal par2 = new Paranormal("Spooky Fake Ghost", "Party City", 0);
        list.add(par2);
        LingerLing ling1 = new LingerLing("Kog'Maw", "Daddy in the Void", 9);
        list.add(ling1);
        LingerLing ling2 = new LingerLing("Kha'Zix", "The Void", 25);
        list.add(ling2);
        FossilRelative fos1 = new FossilRelative("Coelacanth", "Ancient Oceans", 1);
        list.add(fos1);
        FossilRelative fos2 = new FossilRelative("Argentinosaurus", "Ancient Argentina", 3);
        list.add(fos2);
    }

    void showall() {
        for (Animal i : list) {
            if (i.tour) {
                System.out.println("Animal is On Tour");
            }
            System.out.println(i.toString());
            System.out.println("Food Type: " + i.getFoodType());
            System.out.println("Amount of Food: " + i.getFoodAmt());
            System.out.println("Food per Week: " + i.foodPerWeek());
            System.out.println("______________________________________\n");
        }
    }
}
