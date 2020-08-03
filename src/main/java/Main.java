import figure.AbstractFigure;
import figure.Circle;
import figure.Square;
import figure.Trapezoid;
import figure.Triangle;

import static figure.Colors.getRandomColors;

public class Main {
    public static void main(String[] args) {
        final int FIGURES_COUNT = 4 + (int) (Math.random() * 10);

        AbstractFigure[] figures = new AbstractFigure[FIGURES_COUNT];
        createFiguresArray(figures, FIGURES_COUNT);

        System.out.println("Total figures created: " + FIGURES_COUNT);
        for (AbstractFigure figure : figures) {
            System.out.println();
            figure.paint();
            System.out.println(figure.toString());
        }
    }

    private static void createFiguresArray(AbstractFigure[] figures, int figuresCount) {
        for (int i = 0; i < figuresCount; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0: {
                    figures[i] = new Square(getRandomDoubleValueTillRange(20),
                            getRandomColors());
                    break;
                }
                case 1: {
                    figures[i] = new Triangle(getRandomDoubleValueTillRange(10),
                            getRandomDoubleValueTillRange(10), getRandomColors());
                    break;
                }
                case 2: {
                    figures[i] = new Circle(getRandomDoubleValueTillRange(5),
                            getRandomColors());
                    break;
                }
                default: {
                    figures[i] = new Trapezoid(getRandomDoubleValueTillRange(20),
                            getRandomDoubleValueTillRange(20),
                            getRandomDoubleValueTillRange(10), getRandomColors());
                    break;
                }
            }
        }
    }

    private static double getRandomDoubleValueTillRange(int range) {
        return (Math.random() * range);
    }
}
