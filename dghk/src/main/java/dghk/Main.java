package dghk;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main extends ApplicationFrame {

   public Main( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      
      JFreeChart scatterPlot = ChartFactory.createScatterPlot("JFreeChart Scatter Plot","pH", "Hardness", 
    		  createDataset(), PlotOrientation.VERTICAL,true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( scatterPlot );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private XYDataset createDataset( ) {
	   XYSeriesCollection dataset = new XYSeriesCollection();
	   XYSeries series1 = new XYSeries("Locations");  
       series1.add(7.3, .3);
       series1.add(7.5, .3);
       series1.add(6.9, 24.4);
       series1.add(7.3, 25.0);
       series1.add(8.2, 25.0);
       series1.add(8.4, 25.0);
       series1.add(7.2, 72.5);
       series1.add(7.8, 74.7);
       series1.add(7.2, 95.0);
       series1.add(7.0, 136.5);
       series1.add(8.0, 141.6);
       series1.add(7.3, 182.0);
       series1.add(7.4, 192.7);
       series1.add(8.2, 198.8);
       series1.add(8.4, 212.5);
       series1.add(7.9, 225.0);
       series1.add(7.8, 275.0);
       series1.add(6.8, 315.0);
       series1.add(7.3, 345.0);
       series1.add(8.4, 360.6);
       dataset.addSeries(series1);
       return dataset;
   }
   
   public static void main( String[ ] args ) {
      Main chart = new Main(
         "Hardness Vs pH" ,
         "Hardness vs pH");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}
         
        
      