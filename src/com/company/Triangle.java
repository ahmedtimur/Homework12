package com.company;

public class Triangle {
    double a, b, c;

    double area() {
        double s, info;
        s = (a+b+c)/2;
        info = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return info;
    }

}
