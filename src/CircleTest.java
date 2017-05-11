import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by axell on 30/03/2017.
 */
public class CircleTest {
    private final Circle circle = new Circle(new Point(5, 5), 1);

    @Test
    public void contains() throws Exception {
        Point p1 = new Point(5, 6);
        assertTrue(this.circle.contains(p1));
        Point p2 = new Point(-1, 0);
        assertFalse(this.circle.contains(p2));
    }

    @Test
    public void area() throws Exception {
        assertTrue(this.circle.area() == Math.PI);
        assertFalse(this.circle.area() != Math.PI);
    }
}
