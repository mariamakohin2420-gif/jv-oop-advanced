package core.basesyntax;

public class Figure {
    private float area;
    private int side;
    private String color;
    private float radius;

    public Figure(){
    }
    Figure figure = new Figure();
    public void setValues(float area, int side, String color, float radius){
        this.area = area;
        this.side = side;
        this.color = color;
        this.radius = figure.radius;
    }
    public String getValues() {
        String info = "Figure: " + getRandomFigure() + ", area: " + area + " sq. units, side: " + " color: " + color;
    }



}
//Figure: square, area: 25.0 sq. units, side: 5 units, color: blue
// Figure: triangle, area: 12.5 sq. units, firstLeg: 7 units, secondLeg: 5 units, color: yellow