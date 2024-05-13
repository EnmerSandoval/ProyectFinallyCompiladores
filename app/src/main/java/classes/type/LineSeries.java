package classes.type;

import java.util.List;
import classes.type.charts.Chart;

public class LineSeries {
    private String name;
    private List<CoordinatesLine> coordinatesLines;
    private Chart chart;
    private String color;
    private String lineStyle;

    public LineSeries() {
    }

    public LineSeries(String name, List<CoordinatesLine> coordinatesLines, Chart chart, String color, String lineStyle) {
        this.name = name;
        this.coordinatesLines = coordinatesLines;
        this.chart = chart;
        this.color = color;
        this.lineStyle = lineStyle;
    }

    public LineSeries(String name, List<CoordinatesLine> coordinatesLines, Chart chart) {
        this.name = name;
        this.coordinatesLines = coordinatesLines;
        this.chart = chart;
    }



    public LineSeries(String name, List<CoordinatesLine> coordinatesLines) {
        this.name = name;
        this.coordinatesLines = coordinatesLines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CoordinatesLine> getCoordinatesLines() {
        return coordinatesLines;
    }

    public void setCoordinatesLines(List<CoordinatesLine> coordinatesLines) {
        this.coordinatesLines = coordinatesLines;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(String lineStyle) {
        this.lineStyle = lineStyle;
    }
}
