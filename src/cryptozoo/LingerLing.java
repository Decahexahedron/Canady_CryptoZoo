package cryptozoo;

public class LingerLing extends Animal {

    public LingerLing(String nam, String orig, int danger) {
        super(nam, orig, danger);
    }

    @Override
    public int foodPerWeek() {
        return 0;
    }

    @Override
    public void setFoodType(String food) {
        
    }

    @Override
    public String getFoodType() {
        return "none";
    }

    @Override
    public void setFoodAmt(int amt) {

    }

    @Override
    public int getFoodAmt() {
        return 0;
    }

}
