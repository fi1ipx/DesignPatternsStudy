package shapes;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public String getShape() {
        return "RECTANGLE";
    }
}
