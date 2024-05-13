package classes;

import classes.type.LineSeries;
import classes.type.charts.Chart;

public class GraphLine {
    private Dashboard dashboard;
    private LineSeries lineSeries;
    private Chart chart;

    public GraphLine() {
    }

    public GraphLine(Dashboard dashboard, LineSeries lineSeries, Chart chart) {
        this.dashboard = dashboard;
        this.lineSeries = lineSeries;
        this.chart = chart;
    }

    public GraphLine(Dashboard dashboard, LineSeries lineSeries) {
        this.dashboard = dashboard;
        this.lineSeries = lineSeries;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public LineSeries getLineSeries() {
        return lineSeries;
    }

    public void setLineSeries(LineSeries lineSeries) {
        this.lineSeries = lineSeries;
    }


    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}