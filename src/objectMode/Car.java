package objectMode;

public class Car   {
   private String color;
   private final String model;
   private  int year;

   //contructor
     public Car(String color, String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    //getter
    public String getColor() {
        return color;
    }

    public String getModel() {
         return model;
    }
    public int getYear() {
         return year;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
         if (year < 1000){
             System.out.println("Invalid year");
         }else
            this.year = year;
    }
}
