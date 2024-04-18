package org.example.figur._2024_04_17.taski;

import lombok.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(FigureGenerator.generateFigures());
        List<Figure> list = FigureGenerator.generateFigures();
        System.out.println("всех кругов заданного цвета в списке фигур: " + FigureTasks.countCirclesOfColor(list, Color.RED));
        System.out.println(" ");
        System.out.println("прямоугольник с максимальной площадью: " +
                FigureTasks.findRectangleWithMaxArea(list));
        System.out.println(" ");
        FigureTasks.printEquilateralTriangles(list);
        System.out.println(" ");

        System.out.println("Сумма радиусов всех " + Color.BLACK + " кругов: " +
                FigureTasks.sumOfRadiiForColor(list, Color.BLACK));
        System.out.println(" ");
        System.out.println(FigureTasks.hasRectangleAndTriangleOfSameColor(list));
        FigureTasks.hasRectangleAndTriangleOfSameColor(list);
        System.out.println(" ");

        System.out.println("круг с минимальным радиусом среди кругов" + Color.BLACK + " цвета: " +
                FigureTasks.findCircleWithMinRadiusOfColor(list, Color.BLACK));
        System.out.println(" ");

        int value = 50;
        System.out.println("треугольников, у которых хотя бы одна сторона больше " + value + ">> " +
                FigureTasks.countTrianglesWithSideGreaterThan(list, 50));

        System.out.println(" ");
        System.out.println("круги, у которых радиус равен любой из сторон любого треугольника." +
                FigureTasks.findCirclesWithRadiusEqualToTriangleSide(list));

        System.out.println(" ");
        System.out.println("треугольник, у которого разница между максимальной и" +
                " минимальной сторонами минимальна среди всех треугольников: " +
                FigureTasks.findTriangleWithSmallestSideDifference(list));

        System.out.println(" ");
        FigureTasks.printFiguresWithAtLeastOneMatchingParameter(list);

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

    public int minSide() {
        int min = 0;
        if (getA() < getB() && getA() < getC()) {
            min = getA();
        } else if (getB() < getA() && getB() < getC()) {
            min = getB();
        } else {
            min = getC();
        }
        return min;
    }

    public int maxSide() {
        int max = 0;
        if (getA() > getB() && getA() > getC()) {
            max = getA();
        } else if (getB() > getA() && getB() > getC()) {
            max = getB();
        } else {
            max = getC();
        }
        return max;

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
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR;

}
