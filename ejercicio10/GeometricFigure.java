/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author DELL
 */
public abstract class GeometricFigure {
    private Integer height;
    private Integer width;
    private String figure;
    private Double area;

    public GeometricFigure(Integer height, Integer width, String figure) {
        this.height = height;
        this.width = width;
        this.figure = figure;
        this.area= setArea();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public Double getArea() {
        return area;
    }

    public abstract Double setArea();
    
    public void display(){
        System.out.println("La figura "+getFigure()+" con area "+getArea());
    }
}
