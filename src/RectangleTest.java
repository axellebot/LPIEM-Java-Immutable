import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by axell on 30/03/2017.
 */
public class RectangleTest {

    private final Rectangle rectangle = new Rectangle(new Point(0, 0), 2, 3);

    @Test
    public void contains() throws Exception {
        System.out.println(this.rectangle);

        Point p = new Point(1, -2);
        System.out.print(p);
        assertTrue(this.rectangle.contains(p));
        p = new Point(-1, 0);
        System.out.print(p);
        assertFalse(this.rectangle.contains(p));
    }

    @Test
    public void area() throws Exception {
        assertTrue(this.rectangle.area() == 6);
        assertFalse(this.rectangle.area() != 6);
    }
}
