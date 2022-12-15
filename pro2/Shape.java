package pro2;

public abstract class Shape {

    String color;

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }

}
