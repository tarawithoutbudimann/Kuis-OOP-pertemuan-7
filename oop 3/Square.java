public class Square extends Rectangle{
    // constructor
    public Square(){
        super();
    }
    public Square(Double side){
        // memanggil dan mengisi width dan length dari (rectangle)
        super(side,side);
    }
    public Square(Double side,String color,Boolean filled){
        // memanggil parentnya (rectangle), kemudian otomatis sudah memanggil parent dari (rectangle), jadi parameternya butuh 4.
        super(side,side,color,filled);
    }
    public Double getSide(){
        // karena persegi, maka terserah mau pakai getWidth maupun getHeight
        return getWidth();
    }
    public void setSide(Double side){
        side = getWidth();
    }
    public void setWidth(Double side){
        side = getWidth();
    }
    public void setLength(Double side){
        side = getLength();
    }
    public String toString(){
        return "Square dengan side = " + getWidth() + ",merupakan subclass dari " + super.toString();
    }
}