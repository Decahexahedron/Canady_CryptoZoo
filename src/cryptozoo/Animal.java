package cryptozoo;

public abstract class Animal implements ZooAnimal {

    String name, origin;
    int danger;
    boolean tour;

    public Animal(String nam, String orig, int danger) {
        this.tour = false;
        this.name = nam;
        this.origin = orig;
        this.danger = danger;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nOrigin: " + this.origin + "\nDanger Rating: " + this.danger;
    }

    @Override
    public abstract int foodPerWeek();
}
