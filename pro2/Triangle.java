
package pro2;

public class Triangle extends Shape{
    int base;
    int height;

    @Override
    public double getArea() {
        return .5*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }
    
}
