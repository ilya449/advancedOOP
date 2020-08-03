package figure;

public class Triangle extends AbstractFigure {
    private double firstCathetus;
    private double secondCathetus;
    private double hypotenuse;

    public Triangle(double firstCathetus, double secondCathetus, String color) {
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
        this.color = color;
        this.hypotenuse = getHypotenuse();
    }

    public Triangle(double firstCathetus, double secondCathetus, double hypotenuse, String color) {
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
        this.hypotenuse = hypotenuse;
        this.color = color;
    }

    public Triangle(int firstCathetus, int secondCathetus, String color) {
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
        this.color = color;
        this.hypotenuse = getHypotenuse();
    }

    @Override
    public String toString() {
        return "Figure is triangle{" +
                " catet 1=" + firstCathetus +
                ", catet 2=" + secondCathetus +
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
        return (this.firstCathetus * this.secondCathetus) / 2;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
    }

    public double getFirstCathetus() {
        return firstCathetus;
    }

    public double getSecondCathetus() {
        return secondCathetus;
    }

    public void setFirstCathetus(double firstCathetus) {
        this.firstCathetus = firstCathetus;
    }

    public void setSecondCathetus(double secondCathetus) {
        this.secondCathetus = secondCathetus;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
