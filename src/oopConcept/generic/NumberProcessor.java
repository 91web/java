package oopConcept.generic;

public class NumberProcessor<T extends Number> {
    private T userValue;

    //Value getter
    public T getUserValue() {

        return userValue;
    }
    //Setter
    public void setUserValue(T userValue) {
        this.userValue = userValue;
    }

        // Method to process a Number object and print its double value
        public void process(T userValue) {
        //set values
            this.userValue = userValue;
            System.out.println("User Input is "+ getUserValue());
        }

        public static void main(String[] args) {

            NumberProcessor <Integer> userInput1 = new NumberProcessor<>();
            userInput1.process(43);


            NumberProcessor<Double> userInput2 = new NumberProcessor<>();
            userInput2.process(22.5);

            NumberProcessor <Float> userInput3 = new NumberProcessor<>();
            userInput3.process(4.3f);

        }
    }
