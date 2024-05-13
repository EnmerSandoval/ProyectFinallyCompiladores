package classes;

import java.util.ArrayList;
import java.util.List;

import classes.type.Category;
import classes.type.charts.Chart;

public class GraphBar {
    private Dashboard dashboard;
    private List<Category> categories;
    private Chart chart;

    public GraphBar() {
    }

    public GraphBar(Dashboard dashboard, List<Category> categories, Chart chart) {
        this.dashboard = dashboard;
        this.categories = new ArrayList<>();
        this.chart = chart;
    }

    public GraphBar(Dashboard dashboard, List<Category> categories) {
        this.dashboard = dashboard;
        this.categories = categories;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }
}