package com.alexstark;

import java.util.Comparator;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Comparator<Point> byX = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    };

    public static Comparator<Point> byY = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return p1.y - p2.y;
        }
    };

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}