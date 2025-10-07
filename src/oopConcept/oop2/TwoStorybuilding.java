package oopConcept.oop2;

public class TwoStorybuilding implements Building{
    @Override
    public void house() {
        int height = 12;
        int width = 15;
        System.out.println("The house height is "+ height + " and the width is " + width);
    }
}
