package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class Figure implements IFigure {

    public IFigure getClone() {
        try {
            return (IFigure) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Cloning not allowed. ");
            return this;
        }
    }

    @Override
    public double getVolume(IFigure figure) {
        return figure.getVolume(figure);
    }

    @Override
    public double getArea(IFigure figure) {
        return figure.getArea(figure);
    }

    @Override
    public IFigure combine(IFigure figure) {
        IFigure clone = ((Figure) figure).getClone();
        IFigure clone2 = this.getClone();

        double totalVolume = clone.getVolume(clone) + clone2.getVolume(clone2);
        double totalArea = clone.getArea(clone) + clone2.getArea(clone2);

        IFigure newFigure = new IFigure() {
            @Override
            public double getVolume(IFigure figure) {
                return totalVolume;
            }

            @Override
            public double getArea(IFigure figure) {
                return totalArea;
            }

            @Override
            public IFigure combine(IFigure figure) {
                return clone.combine(clone2);
            }
        };

        return newFigure;
    }

    public double getTotalVolume(List<IFigure> figures) {
        double totalVolume = 0;

        for (IFigure figure : figures) {
            totalVolume = totalVolume + getVolume(figure);
        }

        return totalVolume;
    }

    public double getTotalArea(List<IFigure> figures, double minArea) {
        double totalArea = 0;
        for (IFigure figure : figures) {
            double area = getArea(figure);
            if (area > minArea) {
                totalArea = totalArea + area;
            }
        }

        return totalArea;
    }

    public IFigure sumObjects(List<IFigure> figures, double maxArea) {
        List<IFigure> filtered = new ArrayList<>();
        for (IFigure figure : figures) {
            double area = getArea(figure);
            if (area < maxArea) {
                filtered.add(figure);
            }
        }
        IFigure combined = null;
        if (filtered.size() > 1) {

            int counter = 0;
            while (counter < filtered.size() - 1) {
                combined = filtered.get(counter).combine(filtered.get(counter + 1));
                counter++;
            }
        }

        if (filtered.size() == 1) {
            return filtered.get(0);
        }

        return combined;
    }
}
