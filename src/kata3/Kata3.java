package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("google.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");

         
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram,"Histograma", "Histograma JFreeChart", "Dominios emails", "Nº de emails");
        histogramDisplay.execute();
    }
    
}
