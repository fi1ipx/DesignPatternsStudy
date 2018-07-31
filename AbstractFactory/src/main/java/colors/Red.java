package colors;

public class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }

    public String getColor() {
        return "RED";
    }
}
