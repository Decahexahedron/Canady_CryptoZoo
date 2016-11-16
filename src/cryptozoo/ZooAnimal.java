package cryptozoo;

public interface ZooAnimal {

    public void setFoodType(String food);

    public String getFoodType();

    public void setFoodAmt(int amt);

    public int getFoodAmt();

    public int foodPerWeek();

}
