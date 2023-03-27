public class circle extends Shape{
    // berarti circle mengambil attribute,constructor, dan method dari shape (import). Setelah itu kita dapat mengakses hal-hal tersebut dengan "super."" diikuti dengan method yang diinginkan. Kita juga dapat assign paramater dari method di class ini dengan parameter yang ada di superclass (mengikuti jumlah parameter)
    // mengakses constructor parent dengan parameter constructor child.
    // attribute
    private Double radius;
    // constructor
    public circle(){
        this.radius = 1.0;
    }
    public circle(Double radius){
        this.radius = radius;
    }
    public circle(Double radius,String color,Boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    // method
    public Double getRadius(){
        return this.radius;
    }
    public void setRadius(Double radius){
        this.radius = radius;
    }
    public Double getArea(){
        if(this.radius%7==0){
            return 22/7*this.radius*this.radius;
        }
        else{
            return 3.14*this.radius*this.radius;
        }
    }
    public Double getPerimeter(){
        if(this.radius%7==0){
            return 22/7*this.radius*2;
        }
        else{
            return 3.14*this.radius*2;
        }
    }
    public String toString(){
        return "Circle dengan radius = " + this.radius + " merupakan subclass dari " + super.toString();
    }
}