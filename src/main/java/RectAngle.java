public class RectAngle implements Shape{
    private double width;
    private double height;

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double ComputeArea() {
        return this.width * this.height;
    }
}
