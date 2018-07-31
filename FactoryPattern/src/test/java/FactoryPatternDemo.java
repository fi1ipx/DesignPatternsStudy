import org.junit.Assert;
import org.junit.Test;

public class FactoryPatternDemo {
    @Test
    public void factoryPatternTest() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Assert.assertEquals("CIRCLE", shape1.getShape());
        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Assert.assertEquals("RECTANGLE", shape2.getShape());
        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        Assert.assertEquals("SQUARE", shape3.getShape());
        //call draw method of square
        shape3.draw();
    }
}
