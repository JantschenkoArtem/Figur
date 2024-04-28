package org.example.figur._2024_04_17.taski;

import javax.xml.transform.Result;
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
     *
     * @return
     */
    public static void printEquilateralTriangles(List<Figure> figures) {
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                if (isEquilateral(triangle)) {
                    System.out.println("Равносторонний треугольник" + triangle);
                } else {
                    System.out.println("HE Равносторонний треугольник" + triangle);
                }
            }
        }
    }

    public static boolean isEquilateral(Triangle triangle) {
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

        for (Figure figure1 : figures) {
            if (figure1 instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure1;
                for (Figure figure2 : figures) {
                    if (figure2 instanceof Triangle) {
                        Triangle triangle = (Triangle) figure2;
                        if (((Rectangle) figure1).getColor().equals(((Triangle) figure2).getColor())) {
                            System.out.println("B списке фигур прямоугольник и треугольник одинакового цвета: " +
                                    rectangle + " " + triangle);
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }
    // ****************** Intermediate Tasks ******************

    /**
     * 6. Напишите метод для нахождения круга с минимальным радиусом среди кругов заданного цвета.
     */
    public static Circle findCircleWithMinRadiusOfColor(List<Figure> figures, Color color) {
        Circle minRadius = null;
        for (Figure figure : figures) {
            if (figure instanceof Circle && ((Circle) figure).getColor().equals(color)) {
                Circle circle = (Circle) figure;
                if (minRadius == null || circle.getRadius() < minRadius.getRadius()) {
                    minRadius = circle;
                }
            }
        }
        return minRadius;
    }

    /**
     * 7. Напишите метод для подсчета треугольников, у которых хотя бы одна сторона больше заданного значения.
     */
    public static int countTrianglesWithSideGreaterThan(List<Figure> figures, int value) {
        int count = 0;
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                if (hasSideGreaterThen(triangle, value)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean hasSideGreaterThen(Triangle triangle, int value) {
        return triangle.getA() > value || triangle.getB() > value || triangle.getC() > value;
    }

    /**
     * 9. Напишите метод для нахождения всех кругов, у которых радиус равен любой из сторон любого треугольника.
     */
    public static List<Circle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        List<Circle> results = new ArrayList<>();
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                for (Figure figure1 : figures) {
                    if (figure1 instanceof Triangle) {
                        Triangle triangle = (Triangle) figure1;
                        if (circle.getRadius() == triangle.getA() ||
                                circle.getRadius() == triangle.getB() ||
                                circle.getRadius() == triangle.getC()) {
                            results.add(circle);
                            break;
                        }
                    }
                }
            }
        }
        return results;
    }

    // ****************** Upper Intermediate Tasks ******************

    /**
     * 11. Напишите метод для нахождения треугольника, у которого разница между
     * максимальной и минимальной сторонами минимальна среди всех треугольников.
     */
    public static Triangle findTriangleWithSmallestSideDifference(List<Figure> figures) {
        Triangle minDiffTriangle = null;
        int minDiff = Integer.MAX_VALUE;
        for (Figure figure : figures) {
            if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                int diff = sideDifference(triangle);
                if (diff < minDiff) {
                    minDiff = diff;
                    minDiffTriangle = triangle;
                }
            }
        }
        return minDiffTriangle;
    }

    public static int sideDifference(Triangle triangle) {
        return triangle.maxSide() - triangle.minSide();
    }

    /**
     * 12. Напишите метод для вывода всех фигур, у которых хотя бы один параметр
     * (цвет, радиус, сторона) совпадает с аналогичным параметром другой фигуры.
     */
    public static void printFiguresWithAtLeastOneMatchingParameter(List<Figure> figures) {
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                for (Figure figure1 : figures) {
                    if (figure1 instanceof Triangle) {
                        Triangle triangle = (Triangle) figure1;
                        for (Figure figure2 : figures) {
                            if (figure2 instanceof Rectangle) {
                                Rectangle rectangle = (Rectangle) figure2;
                                if (circle.getColor().equals(rectangle.getColor()) || circle.getColor().equals(triangle.getColor())) {
                                    System.out.println(circle + " AND " + rectangle);
                                } else if (rectangle.getColor().equals(triangle.getColor()) || rectangle.getA() == triangle.getA()
                                        || rectangle.getA() == triangle.getB() || rectangle.getA() == triangle.getC()) {
                                    System.out.println(rectangle + "AND " + triangle);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println( "Всего совподений : " + figures.size());

    }

    // Helper method to determine if two figures have at least one matching parameter
    private static boolean figuresMatch(Figure a, Figure b) {
        return false;
    }

    /**
     * 13. Напишите метод для нахождения кругов, у которых радиус больше суммы сторон любого треугольника в списке.
     */
    public static void findCirclesWithRadiusGreaterThanSumOfAnyTriangleSides(List<Figure> figures) {
        for (Figure circleFigure:figures){
            if(circleFigure instanceof Circle){
             Circle circle=(Circle) circleFigure;
                for (Figure triangleFigure : figures){
                    if (triangleFigure instanceof Triangle){
                        Triangle triangle=(Triangle) triangleFigure;
                        if (((Circle) circleFigure).getRadius()>sumOfSide(triangle)){
                      }
                    }
                }
            }
            System.out.println("круг, у которых радиус больше суммы сторон любого треугольника в списке: " + circleFigure);
        }
    }

    public static int sumOfSide(Triangle triangle) {
        int sumSides = triangle.getA() + triangle.getB() + triangle.getC();
        return sumSides;
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