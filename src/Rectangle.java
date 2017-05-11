/**
 * Created by axell on 30/03/2017.
 */
public class Rectangle implements Shape {

    private final Point topLeftCorner;
    private final int width;
    private final int height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(Point p) {
        return (p.getX() >= topLeftCorner.getX()
                && p.getX() <= topLeftCorner.getX() + width
                && p.getY() <= topLeftCorner.getY()
                && p.getY() >= topLeftCorner.getY() - height
        );
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeftCorner=" + topLeftCorner +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
