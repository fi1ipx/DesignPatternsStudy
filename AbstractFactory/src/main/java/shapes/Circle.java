package shapes;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    public String getShape() {
        return "CIRCLE";
    }
}
