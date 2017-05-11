/**
 * Created by axell on 30/03/2017.
 */

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PointTest {
    Point p = new Point(10, 10);

    @Test
    public void distance() throws Exception {
        assertTrue("Distance = 0", this.p.distance(p) == 0);
        assertFalse("Distance != 0", this.p.distance(p) != 0);
    }

    @Test
    public void move() throws Exception {
        assertTrue(this.p.distance(p.move(2, 0)) == 2);
        assertFalse(this.p.distance(p.move(2, 0)) != 2);
    }

    @Test
    public void equals() {
        assertTrue(p.equals(p));
    }
}