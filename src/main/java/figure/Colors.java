package figure;

public enum Colors {
    RED("red"),
    ORANGE("orange"),
    GREEN("green"),
    BLACK("black"),
    BLUE("blue"),
    WHITE("white"),
    YELLOW("yellow"),
    NAVY("navy"),
    LIME("lime"),
    VIOLET("violet");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public static String getRandomColors() {
        switch ((int) (Math.random() * 10)) {
            case (1): {
                return Colors.RED.name();
            }
            case (2): {
                return Colors.YELLOW.name();
            }
            case (3): {
                return Colors.ORANGE.name();
            }
            case (4): {
                return Colors.GREEN.name();
            }
            case (5): {
                return Colors.BLUE.name();
            }
            case (6): {
                return Colors.WHITE.name();
            }
            case (7): {
                return Colors.NAVY.name();
            }
            case (8): {
                return Colors.LIME.name();
            }
            case (9): {
                return Colors.VIOLET.name();
            }
            default: {
                return Colors.BLACK.name();
            }
        }
    }
}
