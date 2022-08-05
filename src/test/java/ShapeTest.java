import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
    @Test
    public void testRectangleArea() {
        Shape rectAngle = new RectAngle(2,3);
        double result = rectAngle.ComputeArea();

        assertEquals(6, result, 0.05);

        RectAngle zeroRect = new RectAngle(0, 3);
        result = zeroRect.ComputeArea();

        assertEquals(0, result, 0.05);

    }

    
}
