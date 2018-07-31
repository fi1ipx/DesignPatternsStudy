package colors;

public class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }

    public String getColor() {
        return "BLUE";
    }
}
