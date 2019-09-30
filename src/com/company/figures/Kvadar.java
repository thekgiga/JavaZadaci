package com.company.figures;

import com.company.Figure;
import com.company.IFigure;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class Kvadar extends Figure {
    double a;
    double b;
    double c;

    @Override
    public double getVolume(IFigure figure) {
        return a * b * c;
    }

    @Override
    public double getArea(IFigure figure) {
        return 2 * a * b + 2 * a * c + 2 * b * c;
    }

    public Kvadar(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
