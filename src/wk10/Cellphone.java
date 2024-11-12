package wk10;

public class Cellphone extends Rectangle implements Button, Screen{

    public Cellphone(double length, double width, int sides) {
        super(length, width, sides);
    }

    @Override
    public void click() {

    }

    @Override
    public void click(int keyCode) {

    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public double getResolution(String mode) {
        return 0;
    }
}
