package org.example.figur._2024_04_17.taski;

import java.util.ArrayList;
import java.util.List;


public class FigureTasks {

    // ****************** Basic Tasks ******************

    /**
     * 1. Напишите метод для подсчета всех кругов заданного цвета в списке фигур.
     */
    public static int countCirclesOfColor(List<Figure> figures, Color color) {
        int count = 0;
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                if (circle.getColor() == color) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 2. Напишите метод для нахождения прямоугольника с максимальной площадью.
     */
    public static Rectangle findRectangleWithMaxArea(List<Figure> figures) {
        Rectangle rectangle = null;
        int maxS = 0;
        for (Figure figure : figures) {
            if (figure instanceof Rectangle) {
                Rectangle r = (Rectangle) figure;
                int square = r.getA() * r.getB();
                if (square > maxS) {
                    maxS = square;
                    rectangle = r;
                }
            }
        }
        return rectangle;
    }

    /**
     * 3. Напишите метод для вывода всех треугольников, у которых все стороны равны.
     */
    public static void printEquilateralTriangles(List<Figure> figures) {
        int res = 0;
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                if (checkTriangel(triangle)) {
                    System.out.println("TRU" + triangle);
                }
            }
        }
    }

    public static boolean checkTriangel(Triangle triangle) {
        return triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC();
    }

    /**
     * 4. Напишите метод для нахождения суммы радиусов всех кругов определенного цвета.
     */
    public static int sumOfRadiiForColor(List<Figure> figures, Color color) {
        int sumRadius = 0;
        for (Figure figure : figures) {
            if (figure instanceof Circle && ((Circle) figure).getColor() == color) {
                Circle circle = (Circle) figure;
                sumRadius += circle.getRadius();
            }
        }
        return sumRadius;
    }

    /**
     * 5. Напишите метод для определения, есть ли в списке фигур прямоугольник и треугольник одинакового цвета.
     */
    public static boolean hasRectangleAndTriangleOfSameColor(List<Figure> figures) {

        Triangle t = null;
        Rectangle r = null;
        for (Figure figure : figures) {

            if (figure instanceof Rectangle) {
                r = (Rectangle) figure;
                for (Figure figure1 : figures) {
                    if (figure1 instanceof Triangle) {
                        if (((Triangle) figure1).getColor() == r.getColor()) {
                        } else {
                            System.out.println("Not Element");
                        }
                    }
                    System.out.println(r);
                }
                continue;
            }
            if (figure instanceof Triangle) {
                t = (Triangle) figure;
                for (Figure figure2 : figures) {
                    if (figure2 instanceof Rectangle && (((Rectangle) figure2).getColor() == t.getColor())) {
                    } else {
                        System.out.println("Not Element");
                    }
                }
                System.out.println(t);
            }
            if (r.getColor()==t.getColor()){
                System.out.println(r + " " + t );
            }

        }
        return true;
    }
    // ****************** Intermediate Tasks ******************

    /**
     * 6. Напишите метод для нахождения круга с минимальным радиусом среди кругов заданного цвета.
     */
    public static Circle findCircleWithMinRadiusOfColor(List<Figure> figures, Color color) {

        return null;
    }


    /**
     * 7. Напишите метод для подсчета треугольников, у которых хотя бы одна сторона больше заданного значения.
     */
    public static int countTrianglesWithSideGreaterThan(List<Figure> figures, int length) {
        return 0;
    }

    /**
     * 9. Напишите метод для нахождения всех кругов, у которых радиус равен любой из сторон любого треугольника.
     */
    public static List<Circle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {

        return null;
    }

    // ****************** Upper Intermediate Tasks ******************

    /**
     * 11. Напишите метод для нахождения треугольника, у которого разница между
     * максимальной и минимальной сторонами минимальна среди всех треугольников.
     */
    public static Triangle findTriangleWithSmallestSideDifference(List<Figure> figures) {
        return null;
    }

    /**
     * 12. Напишите метод для вывода всех фигур, у которых хотя бы один параметр
     * (цвет, радиус, сторона) совпадает с аналогичным параметром другой фигуры.
     */
    public static void printFiguresWithAtLeastOneMatchingParameter(List<Figure> figures) {
    }

    // Helper method to determine if two figures have at least one matching parameter
    private static boolean figuresMatch(Figure a, Figure b) {
        return false;
    }

    /**
     * 13. Напишите метод для нахождения кругов, у которых радиус больше суммы сторон любого треугольника в списке.
     */
    public static List<Circle> findCirclesWithRadiusGreaterThanSumOfAnyTriangleSides(List<Figure> figures) {

        return null;
    }

    // ****************** Advanced Tasks ******************

    /**
     * 16. Напишите метод для нахождения круга, который можно вписать в
     * наибольшее количество треугольников, учитывая их углы и стороны.
     */
    public static Circle findCircleThatFitsMostTriangles(List<Figure> figures) {
        return null;
    }


    /**
     * 19. Напишите метод для определения треугольника с наименьшим углом, вписывающимся в заданный круг.
     */
    public static Triangle findSmallestAngleTriangleInCircle(Circle circle, List<Figure> figures) {
        return null;
    }

    // ****************** Expert Tasks ******************

    /**
     * 21. Напишите метод для определения круга,
     * у которого соотношение площади к радиусу является наименьшим среди всех кругов.
     */
    public static Circle findCircleWithSmallestAreaToRadiusRatio(List<Figure> figures) {
        return null;
    }

    /**
     * 23. Напишите метод для определения, можно ли составить
     * из треугольников полигон без промежутков и наружных выступов.
     */
    public static boolean canFormClosedPolygonFromTriangles(List<Figure> figures) {
        return true;
    }

    /**
     * 24. Напишите метод для определения прямоугольника с наибольшим отношением диагонали к периметру.
     */
    public static Rectangle findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
        return null;
    }

    /**
     * 25. Напишите метод для нахождения всех комбинаций фигур,
     * которые могут быть соединены таким образом, чтобы их общая площадь была равна заданному значению.
     */
    public static List<List<Figure>> findFigureCombinationsMatchingArea(List<Figure> figures, int targetArea) {
        return null;
    }
}