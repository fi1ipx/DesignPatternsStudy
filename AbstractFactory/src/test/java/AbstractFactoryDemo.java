import colors.Color;
import org.junit.Assert;
import shapes.Shape;
import org.junit.Test;

public class AbstractFactoryDemo {

    @Test
    public void abstractFactoryTest() {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Assert.assertEquals("CIRCLE", shape1.getShape());
        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Assert.assertEquals("RECTANGLE", shape2.getShape());
        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        Assert.assertEquals("SQUARE", shape3.getShape());
        //call draw method of Shape Square
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        Assert.assertEquals("RED", color1.getColor());
        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("GREEN");
        Assert.assertEquals("GREEN", color2.getColor());
        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");
        Assert.assertEquals("BLUE", color3.getColor());
        //call fill method of Color Blue
        color3.fill();
    }
}
