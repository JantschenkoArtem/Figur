package org.example.figur._2024_04_17.taski;

import lombok.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(FigureGenerator.generateFigures());
        List<Figure>list= FigureGenerator.generateFigures();
        System.out.println(" ");
        System.out.println(FigureTasks.hasRectangleAndTriangleOfSameColor(list));
        System.out.println(" ");
    }


}

@ToString
class Figure {


}

@ToString
@Getter

class Rectangle extends Figure {

    private Color color;
    private int a;
    private int b;

    public Rectangle(Color color, int a, int b) {
        this.color = color;
        this.a = a;
        this.b = b;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

@ToString

@Getter
class Triangle extends Figure {
    private Color color;
    private int a;
    private int b;
    private int c;

    public Triangle(Color color, int a, int b, int c) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}


@ToString
@Getter

class Circle extends Figure {

    private Color color;
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

@ToString
enum Color {
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR
}
