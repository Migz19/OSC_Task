public class Cuboid extends Shape {
    private int volume, remainingAmount;

    public Cuboid(int length, int width, int height) {
        this.volume = length * width * height;
    }


    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setRemainingAmount(int filledAmount) {
        this.remainingAmount = volume - filledAmount;
    }

    @Override
    public int getRemainingAmount() {
        return remainingAmount;
    }
}
