package cryptozoo;

public class Mythical extends Animal {

    public Mythical(String nam, String orig, int danger) {
        super(nam, orig, danger);
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
        return this.foodWeek;
    }

    @Override
    public void setFoodWeek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFoodWeek() {
        return this.foodWeek;
    }

}
