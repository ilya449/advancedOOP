package figure;

public class Triangle extends AbstractFigure {
    private double catet1;
    private double catet2;
    private String color;

    public Triangle(double catet1, double catet2, String color) {
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.color = color;
    }

    public Triangle(int catet1, int catet2, String color) {
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure is triangle{" +
                " catet 1=" + catet1 +
                ", catet 2=" + catet2 +
                ", area =" + getArea() +
                ", color='" + color + '\'' +
                ", unique method is getHypotenuse = " + getHypotenuse() +
                '}';
    }

    @Override
    public void paint() {
        System.out.printf("Painting %S triangle...\n", this.color);
    }

    @Override
    public double getArea() {
        return (this.catet1 * this.catet2) / 2;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(catet1, 2) + Math.pow(catet2, 2));
    }

    public double getCatet1() {
        return catet1;
    }

    public double getCatet2() {
        return catet2;
    }

    public void setCatet1(double catet1) {
        this.catet1 = catet1;
    }

    public void setCatet2(double catet2) {
        this.catet2 = catet2;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
