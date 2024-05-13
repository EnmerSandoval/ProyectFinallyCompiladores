package classes.type;

public class CoordinatesPoint {
    private String x;
    private String y;

    private String size;
    private String color;

    public CoordinatesPoint() {
    }

    public CoordinatesPoint(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public CoordinatesPoint(String x, String y, String size, String color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
