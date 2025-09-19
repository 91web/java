package calculatorMode;

public class Calc extends AdvCalc{
    public int add( int num1, int num2){
        return num1 + num2;
    }

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    public  double multi(double num1, double num2){
        return num1 * num2;
    }

    public double div(double num1, double num2) {
        if (num1 < 0) { // Corrected the condition to num1 < 0 as per the error message
            System.out.println("Error: Value cannot be less than 0.");
            return Double.NaN; // Return Not-a-Number for invalid input
        }
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number for division by zero
        }
        return num1 / num2;
    }
}

class AdvCalc{
    public double sqr(double num1){
        return Math.sqrt(num1);
    }
    public double pow(double num1){
        return Math.pow(num1, 2);
    }
}