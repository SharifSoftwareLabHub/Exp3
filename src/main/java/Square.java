public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double ComputeArea() {
        return side * side;
    }
}
