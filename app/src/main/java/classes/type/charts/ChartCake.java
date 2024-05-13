package classes.type.charts;

public class ChartCake {
    private String title;
    private String legendPosition;

    public ChartCake() {
    }

    public ChartCake(String title, String legendPosition) {
        this.title = title;
        this.legendPosition = legendPosition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLegendPosition() {
        return legendPosition;
    }

    public void setLegendPosition(String legendPosition) {
        this.legendPosition = legendPosition;
    }
}
