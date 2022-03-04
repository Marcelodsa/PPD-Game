package com.example.tsoroyematatu;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Piece extends Circle {

    private Circle circle;

    public void drawPiece (Double numberX, Double numberY, Double radius, String color) {

        circle = new Circle(numberX, numberY, radius);
        circle.setStroke(Paint.valueOf(color));
        circle.setFill(Paint.valueOf(color));
        circle.toFront();

    }

    public Circle getCircle() {
        return circle;
    }

}
