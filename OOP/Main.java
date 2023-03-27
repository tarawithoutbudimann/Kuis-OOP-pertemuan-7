public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person("Budi", "Gondokusuman");
        Student Student1 = new Student("Vira", "IPS", "Solo", 2018, 200000);
        Staff Staff1 = new Staff("Anne", "America", "HBS", 100000);


        System.out.println("Class Person");
        System.out.println("Nama : " + Person1.getName());
        System.out.println("Alamat : " + Person1.getAddress());
        Person1.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + Person1.getAddress());
        System.out.println(Person1.toString());
        System.out.println();

        System.out.println("Class Student");
        System.out.println("Nama : " + Student1.getName());
        System.out.println("Alamat : " + Student1.getAddress());
        Student1.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + Student1.getAddress());
        System.out.println("Program : " + Student1.getProgram());
        Student1.setProgram("TRI");
        System.out.println("Program saat ini : " + Student1.getProgram());
        System.out.println("Year : " + Student1.getYear());
        Student1.setYear(2021);
        System.out.println("Year saat ini : " + Student1.getYear());
        System.out.println("Fee: " + Student1.getFee());
        Student1.setFee(3000000);
        System.out.println("Fee saat ini: " + Student1.getFee());
        System.out.println(Student1.toString());
        System.out.println();

        System.out.println("Class Staff");
        System.out.println("Nama : " + Staff1.getName());
        System.out.println("Alamat : " + Staff1.getAddress());
        Staff1.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + Staff1.getAddress());
        System.out.println("School : " + Staff1.getSchool());
        Staff1.setSchool("TRI");
        System.out.println("Program saat ini : " + Staff1.getSchool());
        System.out.println("Pay: " + Staff1.getPay());
        Staff1.setPay(6000000);
        System.out.println("Fee saat ini: " + Staff1.getPay());
        System.out.println(Staff1.toString());
        System.out.println();
    }
}