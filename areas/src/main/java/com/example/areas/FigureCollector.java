package com.example.areas;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")

public class FigureCollector {
    @RequestMapping("/{figure_type}/{dim1}/{dim2}")
    public float print( @PathVariable("figure_type") String name, @PathVariable("dim1") String dim1,@PathVariable("dim2") String dim2){
        Figure fig=new Figure(name);
        if(fig.name.equals("quadrilateral")) {
            return fig.calculate_area_quadrilateral(Float.valueOf(dim1), Float.valueOf(dim2));
        }
        else
        if(fig.name.equals("circle")) {
            return fig.calculate_area_circle(Float.valueOf(dim1), Float.valueOf(dim2));
        }
        else
        if(fig.name.equals("triangle")) {
            return fig.calculate_area_triangle(Float.valueOf(dim1), Float.valueOf(dim2));
        }
        else
            return 0;
    }
}
