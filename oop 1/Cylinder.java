public class Cylinder extends Circle{
    private double height = 1.0;

    Cylinder(double radius) {
        super(radius);
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius()+
                ", color=" + getColor() +
                ", area= " + getArea()+
                ", volume= " + getVolume()+
                '}';
    }
}