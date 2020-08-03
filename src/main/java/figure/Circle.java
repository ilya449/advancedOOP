package figure;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", area =" + getArea() +
                ", color='" + color + '\'' +
                ", unique method is getDiameter = " + getDiameter() +
                '}';
    }

    @Override
    public void paint() {
        System.out.printf("Painting %s circle...\n", color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
