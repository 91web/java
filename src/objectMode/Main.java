package objectMode;

public class Main {
    public static void main(String[] args) {
      /*  Car car1 = new Car( "blue", "Honder", 800);
        Car car2 = new Car( "orange", "Lexus", 2020);
        Car car3 = new Car( "red", "Mitsubish", 2000);
        Car car4 = new Car( "pink", "Toyoto", 2001);
        car1.setColor("red");
        car2.setYear(2018);
       // car.setYear(2021);
        System.out.println(car1.getColor() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getColor() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println(car3.getColor() + " " + car3.getModel() + " " + car3.getYear());
        System.out.println(car4.getColor() + " " + car4.getModel() + " " + car4.getYear());
        System.out.println(car1.getColor() + " " + car1.getModel() + " " + car1.getYear());*/



        Person person = new Person("Ademola", "ademola@gmail.com", "user", "no 21, olusae", "914456837", "Ikeja", "Lagos", 33);
        person.setAge(17);
        person.setAge(18);

        System.out.println(person.getName() + " address is " + person.getAddress() + " " + person.getCity() + " " + person.getState() + " " + person.getAge());
    }
}