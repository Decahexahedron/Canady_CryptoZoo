package cryptozoo;

public class FossilRelative extends LingerLing {

    public FossilRelative(String nam, String orig, int danger) {
        super(nam, orig, danger);
    }

    @Override
    public int foodPerWeek() {
        return 1;
    }
}
