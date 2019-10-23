package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

class HistogramDisplay extends ApplicationFrame {
    private final Histogram histogram;

    public HistogramDisplay(Histogram histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
     
    }

    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel panel = new ChartPanel(createChart(createDataSet()));
        setPreferredSize(new Dimension(500,400));
        return panel;
        
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart3D("Histograma JFreeChart", "Dominios emails", "Nº de emails", 
                dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        for (Object key : this.histogram.keySet()) {
            dataSet.addValue(this.histogram.get(key), "", key.toString());
        }
        /*        
        dataSet.addValue(300, "", "ulpgc.es");
        dataSet.addValue(100, "", "dis.ulpgc.es");
        dataSet.addValue(500, "", "gmail.com");
        */
        return dataSet;
    }

}
