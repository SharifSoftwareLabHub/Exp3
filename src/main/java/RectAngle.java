public class RectAngle implements Shape{
    private double width;
    private double height;

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double ComputeArea() {
        return this.width * this.height;
    }
}
