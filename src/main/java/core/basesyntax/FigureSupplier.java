package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_NUMBER = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);

        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                int side = random.nextInt(10) + 1;
                return new Square(color, side);

            case 1:
                int width = random.nextInt(10) + 1;
                int heightR = random.nextInt(10) + 1;
                return new Rectangle(color, width, heightR);
            case 2:
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int radius = random.nextInt(10) + 1;
                return new Circle(color, radius);
            case 4:
                int baseA = random.nextInt(10) + 1;
                int baseB = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(color, baseA, baseB, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final int radius = 10;
        String color = Colors.WHITE.name();
        return new Circle(color, radius);
    }
}
