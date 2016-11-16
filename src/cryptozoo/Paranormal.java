package cryptozoo;

public class Paranormal extends Animal {

    String foodType = "meat";
    int foodAmt = 5;

    public Paranormal(String nam, String orig, int danger) {
        super(nam, orig, danger);
    }

    @Override
    public void setFoodType(String food) {
        this.foodType = "meat";
    }

    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public void setFoodAmt(int amt) {
        this.foodAmt = 5;
    }

    @Override
    public int getFoodAmt() {
        return this.foodAmt;
    }

    @Override
    public int foodPerWeek() {
        return 7;
    }

}
