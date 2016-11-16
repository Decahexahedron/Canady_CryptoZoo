package cryptozoo;

public class Mythical extends Animal {

    String foodType;
    int foodAmt;

    public Mythical(String nam, String orig, int danger, String foodt, int fooda) {
        super(nam, orig, danger);
        this.foodType = foodt;
        this.foodAmt = fooda;
    }

    @Override
    public void setFoodType(String food) {
        this.foodType = food;
    }

    @Override
    public String getFoodType() {
        return this.foodType;
    }

    @Override
    public void setFoodAmt(int amt) {
        this.foodAmt = amt;
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
