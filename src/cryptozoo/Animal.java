package cryptozoo;

public abstract class Animal implements ZooAnimal {

    String name, origin, foodType;
    int danger, foodWeek, foodAmt;

    public Animal(String nam, String orig, int danger) {
        this.name = nam;
        this.origin = orig;
        this.danger = danger;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nOrigin: " + this.origin + "\nDanger Rating: " + this.danger;
    }

    public abstract int foodPerWeek();
}
