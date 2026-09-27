package core.basesyntax;

public class Rectangle implements Figure {
    private int width;
    private int heightR;
    private String color;

    public Rectangle(int width, int heightR, String color) {
        this.width = width;
        this.heightR = heightR;
        this.color = color;

    }

    @Override
    public double getArea() {
        return heightR * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width + " units, height: "
                + heightR + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
