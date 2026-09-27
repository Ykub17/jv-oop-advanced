package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(int baseA, int baseB,int height, String color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, height: " + height + " units, color: "
                + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
