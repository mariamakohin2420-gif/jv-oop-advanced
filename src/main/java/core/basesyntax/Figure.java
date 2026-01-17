package core.basesyntax;

abstract class Figure {
    protected String color;
    public Figure(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract void draw();


}
//Figure: square, area: 25.0 sq. units, side: 5 units, color: blue
// Figure: triangle, area: 12.5 sq. units, firstLeg: 7 units, secondLeg: 5 units, color: yellow