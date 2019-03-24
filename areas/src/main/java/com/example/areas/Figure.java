package com.example.areas;

public class Figure {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure() {
    }

    public float calculate_area_quadrilateral(float dim1, float dim2)
    {
        return dim1*dim2;
    }
    public float calculate_area_triangle(float lat , float h )
    {
        return lat*h/2;
    }

    public float calculate_area_circle(float radius, float pi)
    {
        return (float) (radius*radius*pi);
    }
}
