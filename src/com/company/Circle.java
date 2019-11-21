package com.company;

public class Circle {
    private int radius;

    //region getter and setter

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //endregion
    public  void calculatePerimeter(){
        double perimeter   = 2 * Math.PI* this.radius;
        System.out.println(perimeter);
    }
    public void calculateArea(){
        double area = Math.PI * this.radius * this.radius;
        System.out.println(area);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}

