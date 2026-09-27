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
            case 0: // Square
                int side = random.nextInt(10) + 1;
                return new Square(side, color);

            case 1: // Rectangle
                int width = random.nextInt(10) + 1;
                int heightR = random.nextInt(10) + 1;
                return new Rectangle(width, heightR, color);
            case 2: // RightTriangle
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3: //Circle
                int radius = random.nextInt(10) + 1;
                return new Circle(radius, color);
            case 4: //IsoscelesTrapezoid
                int baseA = random.nextInt(10) + 1;
                int baseB = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(baseA, baseB, height, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        String color = "white";
        return new Circle(radius, color);
    }
}
