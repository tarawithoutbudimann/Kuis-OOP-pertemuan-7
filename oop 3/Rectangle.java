import java.awt.*;

public class Rectangle extends Shape{
    // attribute
    private Double width;
    private Double length;
    // constructor
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(Double width,Double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(Double width,Double length,String color,Boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    // method
    public Double getWidth(){
        return this.width;
    }
    public void setWidth(Double width){
        this.width = width;
    }
    public Double getLength(){
        return this.length;
    }
    public void setLength(Double length){
        this.length = length;
    }
    public Double getArea(){
        return this.width * this.length;
    }
    public Double getPerimeter(){
        return this.width*2 + this.length*2;
    }
    public String toString(){
        return "Rectangle dengan width = " + this.width + " dan length = " + this.length + " merupakan subclass dari " + super.toString();
    }
}