package figure;

public class Trapezoid extends AbstractFigure {
    private double bottomSide;
    private double topSide;
    private double height;


    public Trapezoid(double bottomSide, double topSide, double height, String color) {
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
        this.color = color;
    }

    public Trapezoid(int bottomSide, int topSide, double height, String color) {
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                " bottomSide=" + bottomSide +
                ", topSide=" + topSide +
                ", height=" + height +
                ", area =" + getArea() +
                ", color='" + color + '\'' +
                ", unique method is getMiddleLine = " + getMiddleLine() +
                '}';
    }

    @Override
    public void paint() {
        System.out.printf("Painting %s trapezoid...\n", color);
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) * height / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getMiddleLine() {
        return (bottomSide + topSide) / 2;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
