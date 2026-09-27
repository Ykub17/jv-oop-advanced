package core.basesyntax;

public abstract class Figure implements Area, Drawable, Colorable {
    protected String color;

    public Figure() {
    }

    public abstract double getArea();

    public abstract void draw();

    public String getColor() {
        return color;
    }
}
