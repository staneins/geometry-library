package com.kaminsky;

public class GeometryUtils {

    public boolean compareFigures(AbstractFigure figure1, AbstractFigure figure2) {
        if (figure1 == null || figure2 == null) {
            return false;
        }

        if (figure1 == figure2) {
            return true;
        }

        if (figure1.getClass() != figure2.getClass()) {
            return false;
        }

        double area1 = figure1.calculateArea();
        double area2 = figure2.calculateArea();

        double perimeter1 = figure1.calculatePerimeter();
        double perimeter2 = figure2.calculatePerimeter();

        if (Double.compare(area1, area2) != 0 || Double.compare(perimeter1, perimeter2) != 0) {
            return false;
        }

        if (figure1 instanceof Circle && figure2 instanceof Circle) {
            return Double.compare(((Circle) figure1).getRadius(), ((Circle) figure2).getRadius()) == 0;
        }

        if (figure1 instanceof Rectangle && figure2 instanceof Rectangle) {
            Rectangle rect1 = (Rectangle) figure1;
            Rectangle rect2 = (Rectangle) figure2;
            return Double.compare(rect1.getWidth(), rect2.getWidth()) == 0 &&
                    Double.compare(rect1.getHeight(), rect2.getHeight()) == 0;
        }

        if (figure1 instanceof Triangle && figure2 instanceof Triangle) {
            Triangle tri1 = (Triangle) figure1;
            Triangle tri2 = (Triangle) figure2;
            return Double.compare(tri1.getSideA(), tri2.getSideA()) == 0 &&
                    Double.compare(tri1.getSideB(), tri2.getSideB()) == 0 &&
                    Double.compare(tri1.getSideC(), tri2.getSideC()) == 0;
        }

        return false;
    }

}
