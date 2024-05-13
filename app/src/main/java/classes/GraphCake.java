package classes;

import java.util.ArrayList;
import java.util.List;

import classes.type.LabelCake;
import classes.type.charts.ChartCake;

public class GraphCake {
    private Dashboard dashboard;
    private List<LabelCake> labels;
    private ChartCake chartCake;

    public GraphCake() {
    }

    public GraphCake(Dashboard dashboard, List<LabelCake> labels, ChartCake chartCake) {
        this.dashboard = dashboard;
        this.labels = new ArrayList<>();
        this.chartCake = chartCake;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public List<LabelCake> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelCake> labels) {
        this.labels = labels;
    }

    public ChartCake getChartCake() {
        return chartCake;
    }

    public void setChartCake(ChartCake chartCake) {
        this.chartCake = chartCake;
    }
}
