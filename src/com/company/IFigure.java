package com.company;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public interface IFigure extends Cloneable {
    double getVolume(IFigure figure);

    double getArea(IFigure figure);

    IFigure combine(IFigure figure);
}
