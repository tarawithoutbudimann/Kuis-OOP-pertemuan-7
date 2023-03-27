public class Main {
    public static void main(String[] args) {
        //Membuat 3 objek baru dengan parameter yang berbeda
        Cylinder cylinder1 = new Cylinder(9); //objek baru dengan 1 parameter
        Cylinder cylinder2 = new Cylinder(9,10); //objek baru dengan 2 parameter
        Cylinder cylinder3 = new Cylinder(9,10,"red"); //objek baru dengan 3 parameter


        System.out.println("-----------------------------------------------------");
        System.out.println("Cylinder 1");
        System.out.println("-----------------------------------------------------");
        System.out.println("Radius awal : " + cylinder1.getRadius());
        cylinder1.setRadius(5);
        System.out.println("Radius setelah set: " + cylinder1.getRadius());
        System.out.println("Volume Cylinder 1: " +cylinder1.getVolume());
        System.out.println(cylinder1.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();


        System.out.println("-----------------------------------------------------");
        System.out.println("Cylinder 2");
        System.out.println("-----------------------------------------------------");
        System.out.println("Radius awal : " + cylinder2.getRadius());
        cylinder2.setRadius(5);
        System.out.println("Radius setelah set: " + cylinder2.getRadius());
        System.out.println("Height awal: " + cylinder2.getHeight());
        cylinder2.setHeight(15);
        System.out.println("Height setelah set: " + cylinder2.getHeight());
        System.out.println("Volume Cylinder 2: " +cylinder2.getVolume());
        System.out.println(cylinder2.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();


        System.out.println("-----------------------------------------------------");
        System.out.println("Cylinder 3");
        System.out.println("-----------------------------------------------------");
        System.out.println("Radius awal : " + cylinder3.getRadius());
        cylinder3.setRadius(5);
        System.out.println("Radius saat ini: " + cylinder3.getRadius());
        System.out.println("Height awal: " + cylinder3.getHeight());
        cylinder3.setHeight(15);
        System.out.println("Height setelah set: " + cylinder3.getHeight());
        System.out.println("Warna awal: " + cylinder3.getColor());
        cylinder3.setColor("green");
        System.out.println("Warna setelah set: " + cylinder3.getColor());
        System.out.println("Volume Cylinder 3: " +cylinder3.getVolume());
        System.out.println(cylinder3.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();


    }

}