package figure;

public class Square extends AbstractFigure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure is square{" +
                " side =" + side +
                ", area =" + getArea() +
                ", color='" + color + '\'' +
                ", unique method is getDiagonal = " + getDiagonal() +
                '}';
    }

    @Override
    public void paint() {
        System.out.printf("Painting %s square...\n", color);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(side, 2) * 2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public void setColor(String color) {
        this.color = color;
    }
}
