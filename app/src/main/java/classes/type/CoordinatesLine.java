package classes.type;

public class CoordinatesLine {
    private String x;
    private String y;
    private String label;

    public CoordinatesLine() {
    }

    public CoordinatesLine(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public CoordinatesLine(String x, String y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
