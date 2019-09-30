package com.company;

import com.company.figures.Kocka;

public class Main {

    public static void main(String[] args) {
        IFigure figure = new Figure();

        IFigure kocka1 = new Kocka(2);

        System.out.println("Povrsina kocke1: " + figure.getArea(kocka1));
        System.out.println("Zapremina kocke1: " + figure.getVolume(kocka1));

        IFigure kocka2 = new Kocka(3);
        System.out.println("Povrsina kocke2: " + figure.getArea(kocka2));
        System.out.println("Zapremina kocke2: " + figure.getVolume(kocka2));

        IFigure combinedFigure = kocka1.combine(kocka2);

        System.out.println("Povrsina combinedFigure: " + figure.getArea(combinedFigure));
        System.out.println("Zapremina combinedFigure: " + figure.getVolume(combinedFigure));

        IFigure kocka3 = new Kocka(3);
        System.out.println("Povrsina kocka3: " + figure.getArea(kocka3));
        System.out.println("Zapremina kocka3: " + figure.getVolume(kocka3));

        IFigure combinedFigure2 = combinedFigure.combine(kocka3);

        System.out.println("Povrsina combinedFigure2: " + figure.getArea(combinedFigure2));
        System.out.println("Zapremina combinedFigure2: " + figure.getVolume(combinedFigure2));

        IFigure combinedFigure3 = combinedFigure.combine(combinedFigure2);

        System.out.println("Povrsina combinedFigure3: " + figure.getArea(combinedFigure3));
        System.out.println("Zapremina combinedFigure3: " + figure.getVolume(combinedFigure3));
    }
}
