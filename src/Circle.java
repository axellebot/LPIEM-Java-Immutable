/**
 * Created by axell on 30/03/2017.
 */
public final class Circle implements Shape {

    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean contains(Point p) {
        return this.center.distance(p) <= radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
