package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
