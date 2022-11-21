import java.util.*;

public class Cylinder extends Shape {
    private final double pi = 3.14159265359;
    private int volume,remainingAmount;
    public Cylinder(int height, int radius) {
       this.volume = (int)(radius*radius*height*pi);
    }


    @Override
    public int getRemainingAmount() {
        return remainingAmount;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setRemainingAmount(int filledAmount) {
        this.remainingAmount = volume-filledAmount;
    }
}
