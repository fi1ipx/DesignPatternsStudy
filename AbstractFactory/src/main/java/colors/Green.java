package colors;

public class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

    public String getColor() {
        return "GREEN";
    }
}
