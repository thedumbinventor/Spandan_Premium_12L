package com.example.spandan_premium_12l;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class HelloController {

    @FXML
    private Label loggingStatus;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    private MenuItem menuItemClose;

    @FXML
    private MenuItem menuItemDelete;

    @FXML
    private MenuItem menuStartLogging;

    @FXML
    private MenuItem menuStopLogging;

    @FXML
    private MenuBar startLogging;

    @FXML
    void menuItemCloseButton(ActionEvent event) {
        System.out.println("menuItemCloseButtonClicked");
        System.exit(0);

    }

    @FXML
    public LineChart<String, Integer> v1, v2, v3, v4, v5, v6, l1, l2, l3, avr, avl, avf;


    @FXML
    void menuItemDeleteButton(ActionEvent event) {
        System.out.println("menuItemDeleteButtonClicked");
    }

    private static int x = 0;

    @FXML
    void menuStartLoggingButton(ActionEvent event) {
        XYChart.Series<String, Integer> series = new XYChart.Series();
        System.out.println("menuStartLoggingButtonClicked");
       /*Start Graph Thread for V1*/
        v1.getData().add(series);
        drawV1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    series.getNode().setStyle("-fx-stroke:"+"black"+";");
                    series.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (series.getData().size() > 100) {
                        series.getData().remove(0);
                    }
                });
            }
        });

//   End of Graph V1
        /*Start Graph Thread for V2*/
        XYChart.Series<String, Integer> seriesV2 = new XYChart.Series<>();
        v2.getData().add(seriesV2);
        drawV2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesV2.getNode().setStyle("-fx-stroke:"+"#0000b3"+";");
                    seriesV2.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesV2.getData().size() > 100) {
                        seriesV2.getData().remove(0);
                    }
                });
            }
        });

        //   End of Graph V2
        /*Start Graph Thread for V3*/
        XYChart.Series<String, Integer> seriesV3 = new XYChart.Series<>();
        v3.getData().add(seriesV3);
        drawV3 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesV3.getNode().setStyle("-fx-stroke:"+"#e600e6"+";");
                    seriesV3.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesV3.getData().size() > 100) {
                        seriesV3.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesV4 = new XYChart.Series<>();
        v4.getData().add(seriesV4);
        drawV4 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesV4.getNode().setStyle("-fx-stroke:"+"#ff3300"+";");
                    seriesV4.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesV4.getData().size() > 100) {
                        seriesV4.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesV5 = new XYChart.Series<>();
        v5.getData().add(seriesV5);
        drawV5 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesV5.getNode().setStyle("-fx-stroke:"+"#00b33c"+";");
                    seriesV5.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesV5.getData().size() > 100) {
                        seriesV5.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesV6 = new XYChart.Series<>();
        v6.getData().add(seriesV6);
        drawV6 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesV6.getNode().setStyle("-fx-stroke:"+"#cc0000"+";");
                    seriesV6.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesV6.getData().size() > 100) {
                        seriesV6.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesl1 = new XYChart.Series<>();
        l1.getData().add(seriesl1);
        drawL1 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesl1.getNode().setStyle("-fx-stroke:"+"#9900cc"+";");
                    seriesl1.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesl1.getData().size() > 100) {
                        seriesl1.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesL2 = new XYChart.Series<>();
        l2.getData().add(seriesL2);
        drawL2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesL2.getNode().setStyle("-fx-stroke:"+"#0033cc"+";");
                    seriesL2.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesL2.getData().size() > 100) {
                        seriesL2.getData().remove(0);
                    }
                });
            }
        });
        //   End of Graph V3
        /*Start Graph Thread for V4*/
        XYChart.Series<String, Integer> seriesL3 = new XYChart.Series<>();
        l3.getData().add(seriesL3);
        drawL3 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Platform.runLater(() -> {
                    seriesL3.getNode().setStyle("-fx-stroke:"+"#ff8000"+";");

                    seriesL3.getData().add(new XYChart.Data<>(x+"", (int) (Math.random() * 100)));
                    x++;
                    if (seriesL3.getData().size() > 100) {
                        seriesL3.getData().remove(0);
                    }
                });
            }
        });
        drawV3.start();drawV2.start();drawV1.start();drawV4.start();drawV5.start();drawV6.start();drawL1.start();
        drawL2.start();  drawL3.start();  }

    @FXML
    void menuStopLoggingButton(ActionEvent event) {
        System.out.println("menuStopLoggingButtonClicked");
        System.exit(0);

    }

    @FXML
    void menuHelpAboutButton(ActionEvent e) {
        System.out.println("menuHelpAboutButtonClicked");
    }


    Thread drawV1, drawV2, drawV3, drawV4, drawV5, drawV6, drawaVR, drawaVL, drawaVF, drawL1, drawL2, drawL3;


}

