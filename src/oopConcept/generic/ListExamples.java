package oopConcept.generic;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExamples {

    // arraylist, linkedlist, vector
    // hashSet, treeSet, LinkedHashSet
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add(1, "blue");
        colors.add("blue");
        System.out.println(colors);
//    colors.remove(0);
//    colors.remove("blue");

        System.out.println(colors.get(0));
        System.out.println(colors);
        System.out.println("Size of the list is : " + colors.size());
        System.out.println("Index of red is: " + colors.indexOf("red"));

        for (String color: colors){
            System.out.println("Color is " + color);
        }

        Set<String> colorSet = new HashSet<>();
        colorSet.add("blue");
        colorSet.add("red");
        System.out.println(colorSet);

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("fodio", 50);
        studentGrades.put("yusuf", 60);
//    studentGrades.remove("fodio");
        System.out.println("Yusuf grade is " + studentGrades.get("yusuf"));
        System.out.println("Does fodio exist on the list: " + studentGrades.containsKey("fodio"));
    }

}

