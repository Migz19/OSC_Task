import java.util.ArrayList;

public abstract class Shape implements Comparable<Shape> {

    public abstract int getVolume();

    public  abstract void setRemainingAmount(int filledAmount);

    public abstract int getRemainingAmount() ;


    @Override
    public int compareTo(Shape shape) {
        int difference = (this.getRemainingAmount()-shape.getRemainingAmount());
        return difference;
    }


    @Override
    public String toString() {
        return "volume =" + getVolume() +
                ", remainingAmount =" + getRemainingAmount() +
                '}';
    }
}
