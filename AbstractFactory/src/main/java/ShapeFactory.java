import colors.Color;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class ShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }

        return null;
    }

    Color getColor(String color) {
        return null;
    }
}
