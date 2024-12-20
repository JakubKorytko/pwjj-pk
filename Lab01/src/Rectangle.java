public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return width*2 + height*2;
    }
}
