import figure.*;

public class Main {
    public static void main(String[] args) {
        final int FIGURES_COUNT = 4 + (int) (Math.random() * 10);
        final String[] COLORS = {"red", "orange", "green", "black", "blue", "white", "yellow", "aqua", "purple", "navy", "lime", "violet"};
        AbstractFigure[] figures = new AbstractFigure[FIGURES_COUNT];
        createFiguresArray(figures, COLORS, FIGURES_COUNT);

        System.out.println("Total figures created: " + FIGURES_COUNT);
        for (AbstractFigure figure : figures) {
            System.out.println();
            figure.paint();
            System.out.println(figure.toString());
        }
    }

    private static void createFiguresArray(AbstractFigure[] figures, String[] colors, int figuresCount) {
        for (int i = 0; i < figuresCount; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0: {
                    figures[i] = new Square(getRandomDoubleValueTillRange(20),
                            getRandomColors(colors));
                    break;
                }
                case 1: {
                    figures[i] = new Triangle(getRandomDoubleValueTillRange(10),
                            getRandomDoubleValueTillRange(10), getRandomColors(colors));
                    break;
                }
                case 2: {
                    figures[i] = new Circle(getRandomDoubleValueTillRange(5),
                            getRandomColors(colors));
                    break;
                }
                default: {
                    figures[i] = new Trapezoid(getRandomDoubleValueTillRange(20),
                            getRandomDoubleValueTillRange(20),
                            getRandomDoubleValueTillRange(10), getRandomColors(colors));
                    break;
                }
            }
        }
    }

    private static double getRandomDoubleValueTillRange(int range) {
        return (Math.random() * range);
    }

    private static String getRandomColors(String[] colors) {
        return colors[(int) (Math.random() * 10)];
    }
}
