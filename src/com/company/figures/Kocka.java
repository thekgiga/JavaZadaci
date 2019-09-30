package com.company.figures;

import com.company.Figure;
import com.company.IFigure;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class Kocka extends Figure {
    double a;

    @Override
    public double getVolume(IFigure figure) {
        return a * a * a;
    }

    @Override
    public double getArea(IFigure figure) {
        return 6 * a * a;
    }


    public Kocka(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
