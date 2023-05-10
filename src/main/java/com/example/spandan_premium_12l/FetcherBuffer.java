package com.example.spandan_premium_12l;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.input.ScrollEvent;
import javafx.stage.Stage;

import java.util.Random;

public class FetcherBuffer extends Application {

    private static final int MAX_DATA_POINTS = 50;
    private int xSeriesData = 0;
    private final XYChart.Series<Number, Number> series1 = new XYChart.Series<>();

    public static void main(String[] args) {
        launch(args);
    }

    private double zoomFactor = 1.0;

    @Override
    public void start(Stage primaryStage) {

        // setup the x and y axis
        final NumberAxis xAxis = new NumberAxis(0, MAX_DATA_POINTS, MAX_DATA_POINTS / 10);
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X Axis");
        yAxis.setLabel("Y Axis");

        // create the line chart and add the series to it
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setCreateSymbols(false);
        lineChart.setTitle("Live Line Graph");
        lineChart.setAnimated(false);


        // add series to the line chart
        lineChart.getData().add(series1);

        // setup the scene and show the stage
        Scene scene = new Scene(lineChart, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
// Set up zooming
        lineChart.setOnScroll((ScrollEvent event) -> {
            double deltaY = event.getDeltaY();
            if (deltaY < 0) {
                zoomFactor /= 1.2;
            } else {
                zoomFactor *= 1.2;
            }
            lineChart.setScaleX(zoomFactor);
            lineChart.setScaleY(zoomFactor);
        });
        // setup the animation timer
        AnimationTimer animationTimer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Random random = new Random();
                int randomNumber;

//

               if (xSeriesData > 300) {
                    randomNumber = random.nextInt(8293998 - 8249445 + 1) + 8249445;
                }


               else{
                   System.out.println("Hello");
                   randomNumber = (int)(Math.random()*100);}

                yAxis.setAutoRanging(true);
                yAxis.forceZeroInRangeProperty().set(false);

                series1.getData().add(new XYChart.Data<>(xSeriesData++, randomNumber));
                System.out.println(randomNumber);
                // remove data points from the series that exceed the MAX_DATA_POINTS
                if (series1.getData().size() > MAX_DATA_POINTS) {
                    series1.getData().remove(0, series1.getData().size() - MAX_DATA_POINTS);
                }
                // set the x axis range to display the last MAX_DATA_POINTS
                xAxis.setLowerBound(xSeriesData - MAX_DATA_POINTS);
                xAxis.setUpperBound(xSeriesData - 1);
            }
        };

        // start the animation timer
        animationTimer.start();
    }
}
