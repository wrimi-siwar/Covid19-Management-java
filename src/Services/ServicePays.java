package Services;

import connection.Connexion;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ServicePays {

    public final ChartPanel total_cas_d_p() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_cas,DATE_UPDATE,nompays from PAYS");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de cas", "Date",
                    "Cas totaux de coronavirus",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvels_cas_d_p() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_cas,DATE_UPDATE,nompays from PAYS");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de cas", "Date",
                    "Cas totaux de coronavirus",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }
    
    public final ChartPanel total_deces_d_p() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_deces,DATE_UPDATE,nompays from PAYS");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de Décès par Date", "Date",
                    "total Décès",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvel_deces_d_p() {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_deces,DATE_UPDATE,nompays from PAYS");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre de noveaux Décès par Date", "Date",
                    "noveaux Décès",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public ChartPanel total_cas_d() {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_cas),DATE_UPDATE from PAYS group by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de nouvels cas par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "nouvels cas affectées",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel nouvels_cas_d() {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_cas),DATE_UPDATE from PAYS group by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de nouvels cas par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "nouvels cas affectées",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel total_deces_d() {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_deces),DATE_UPDATE from PAYS group by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "décès par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre total de cas Décedes",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }
    
    public ChartPanel nouvel_deces_d() {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_deces),DATE_UPDATE from PAYS group by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "décès par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre de nouveaux cas Décedes",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }
  
    public ChartPanel total_cas_p() {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_cas,nompays from PAYS where date_update = (select max(date_update) from PAYS )");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel nouvels_cas_p() {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_cas,nompays from PAYS where date_update = (select max(date_update) from PAYS )");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }
    
    public ChartPanel total_deces_p() {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_deces,nompays from PAYS where date_update = (select max(date_update) from PAYS )");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Total Déces Répartition par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel nouvel_deces_p() {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_deces,nompays from PAYS where date_update = (select max(date_update) from PAYS )");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Nouveaux Déces Répartities par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(600, 300);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }


}
