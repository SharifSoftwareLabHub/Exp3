import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
    @Test
    public void testRectangleArea() {
        Shape rectAngle = new RectAngle(2, 3);
        double result = rectAngle.ComputeArea();
        assertEquals(6, result, 0.05);

        RectAngle zeroRect = new RectAngle(0, 3);
        result = zeroRect.ComputeArea();
        assertEquals(0, result, 0.05);
    }

    @Test
    public void testSetRectangleWidth() {
        RectAngle rectAngle = new RectAngle(2, 3);
        double result = rectAngle.ComputeArea();
        assertEquals(6, result, 0.05);

        rectAngle.setWidth(5);
        assertEquals(15, rectAngle.ComputeArea(), 0.05);
    }

    @Test
    public  void testGetRectangleWidth(){
        RectAngle rectAngle = new RectAngle(2,3);
        double width = rectAngle.getWidth();
        assertEquals(2, width, 0.05);

        rectAngle.setWidth(6);
        width = rectAngle.getWidth();
        assertEquals(6, width, 0.05);
    }

    @Test
    public void testSetRectangleHeight() {
        RectAngle rectAngle = new RectAngle(3, 2);
        double result = rectAngle.ComputeArea();
        assertEquals(6, result, 0.05);

        rectAngle.setHeight(5);
        assertEquals(15, rectAngle.ComputeArea(), 0.05);
    }

    @Test
    public  void testGetRectangleHeight(){
        RectAngle rectAngle = new RectAngle(3,2);
        double height = rectAngle.getHeight();
        assertEquals(2, height, 0.05);

        rectAngle.setHeight(6);
        height = rectAngle.getHeight();
        assertEquals(6, height, 0.05);
    }
}
