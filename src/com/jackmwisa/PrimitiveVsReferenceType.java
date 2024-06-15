package com.jackmwisa;

import java.awt.*;

public class PrimitiveVsReferenceType {
    public static void main(String[] args) {

//        primitive type example
        byte x = 1;
        byte y = x;

        x = 2;

        System.out.println(y);

//        Reference type example

        Point point1 = new Point(1,2);
        Point point2 = point1;



    }
}
