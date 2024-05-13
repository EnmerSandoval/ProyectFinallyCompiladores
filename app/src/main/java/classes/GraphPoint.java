package classes;

import java.util.ArrayList;
import java.util.List;

import classes.type.CoordinatesPoint;
import classes.type.charts.Chart;

public class GraphPoint {
    private Dashboard dashboard;
    private List<CoordinatesPoint> coordinatesPoints;
    private Chart chart;

    public GraphPoint() {
    }

    public GraphPoint(Dashboard dashboard, List<CoordinatesPoint> coordinatesPoints) {
        this.dashboard = dashboard;
        this.coordinatesPoints = new ArrayList<>();
    }

    public GraphPoint(Dashboard dashboard, List<CoordinatesPoint> coordinatesPoints, Chart chart) {
        this.dashboard = dashboard;
        this.coordinatesPoints = coordinatesPoints;
        this.chart = chart;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public List<CoordinatesPoint> getCoordinatesPoints() {
        return coordinatesPoints;
    }

    public void setCoordinatesPoints(List<CoordinatesPoint> coordinatesPoints) {
        this.coordinatesPoints = coordinatesPoints;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}
