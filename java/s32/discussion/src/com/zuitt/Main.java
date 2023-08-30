package com.zuitt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        // [Section] Arrays
        /*
            - Arrays are objects that contain a fixed/limited number of values
            - Syntax:
                dataType[] identifier = new dataType[numberOfElements]
                dataType[] identifier = {elementA, elementB, ...}
        */

        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 25;
        intArray[2] = 50;
        // intArray[3] = 60;
        System.out.println("The result of array creation:");
        System.out.println(intArray[0]);

        String stringArray[] = new String[3];
        stringArray[0] = "John";
        stringArray[1] = "Jane";
        stringArray[2] = "Joe";
        System.out.println(stringArray[2]);

        int[] intArray2 = {10, 25, 50};
        System.out.println(intArray2[1]);

        System.out.println("Result of printing arrays without toString() method: ");
        System.out.println(intArray2); // [I@e9e54c2
        // The value to be printed out will be the reference to the memory of the application
        // The resulting series of characters is the memory allocated for the variable "intArray2"

        System.out.println("Result of printing arrays with toString() method: ");
        System.out.println(Arrays.toString(intArray2)); // [10, 25, 50]

        // sort Method

        Arrays.sort(stringArray);
        System.out.println("Result of Arrays.sort()");
        System.out.println(Arrays.toString(stringArray)); // [Jane, Joe, John]

        // binarySearchMethod
        // stringArray = [Jane, Joe, John]
        String searchTerm = "Joe";
        int result = Arrays.binarySearch(stringArray, searchTerm);
        System.out.println("Index of searched term is: " + result); // Index of searched term is: 1

        // [Section] Multidimensional Array
        /*
            - Can be used to represent complex data that may/may not represent real world objects
            - Syntax:
                dataType[][] identifier = new dataType[number of elements][number of elements]
        */

        String[][] classroom = new String[3][3];
        /*
            First Row =  [0][0] [0][1] [0][2]
            Second Row = [1][0] [1][1] [1][2]
            Third Row =  [2][0] [2][1] [2][2]
        */

        // First Row
        classroom[0][0] = "Athos";
        classroom[0][1] = "Porthos";
        classroom[0][2] = "Aramis";

        // Second Row
        classroom[1][0] = "Mickey";
        classroom[1][1] = "Donald";
        classroom[1][2] = "Goofy";

        // Third Row
        classroom[2][0] = "Harry";
        classroom[2][1] = "Snape";
        classroom[2][2] = "Umbridge";

        System.out.println("Result of Multidimensional arrays: ");
        // The "deepToString()" method is used in place of "toString" method when dealing with multidimensional arrays
        System.out.println(Arrays.deepToString(classroom)); // [[Athos, Porthos, Aramis], [Mickey, Donald, Goofy], [Harry, Snape, Umbridge]]

        // [Section] Array Lists
        /*
            - Array list are resizable arrays that function similarly to how arrays work in other languages like JavaScript
            - Syntax:
                ArrayList<dataType> identifier = new ArrayList<> ();
        */

        ArrayList<String> students = new ArrayList<>();

        // ArrayList Methods

        // Adding elements
        students.add("John");
        students.add("Paul");
        System.out.println(students); // [John, Paul]

        // Retrieve an element
        /* arrayName.get(indexNumber) */
        System.out.println(students.get(0)); // John

        // Update an element
        students.set(1, "George");
        System.out.println(students); // [John, George]

        // Remove an element
        students.remove(1);
        System.out.println(students); // [John]


        students.add("Sophia I");
        students.add("Bob");
        students.add("Thomas");

        // Clear an array
        students.clear();
        System.out.println(students); // []

        // Getting the length of an Array List
        System.out.println(students.size()); // 0

        // ArrayList with initialized values
        /*
            - Syntax:
                  ArrayList<dataType> arrayName = new ArrayList<>(Arrays.asList(value, value));
        */
        ArrayList<String> employees = new ArrayList<>(Arrays.asList("June", "Albert"));
        System.out.println(employees); // [June, Albert]

        // [Section] HashMap
        /*
            - Used if fields in an object are added dynamically
            - In Java, object "keys" are also referred as "fields"
            - Syntax:
                HashMap<fieldDataType, valueDataType> identifier = new HashMap<>();
        */

        HashMap<String, String> employeeRole = new HashMap<>();

        // Adding fields
        // Syntax: arrayName.put(key, value)
        employeeRole.put("Student", "Brandon");
        employeeRole.put("Teacher", "Ingram");
        System.out.println(employeeRole); // {Teacher=Ingram, Student=Brandon}

        // Retrieving Field Values
        System.out.println(employeeRole.get("Student")); // Brandon

        // Retrieve all keys/fields
        System.out.println(employeeRole.keySet()); // [Teacher, Student]
        System.out.println(employeeRole.values()); // [Ingram, Brandon]

        // HashMaps w/ Integers
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Joe", 89);
        grades.put("Jane", 93);
        System.out.println(grades); // {Joe=89, Jane=93}

        // HashMaps with Array Lists
        HashMap<String, ArrayList<Integer>> subjectGrades = new HashMap<>();

        ArrayList<Integer> gradeListA = new ArrayList<>(Arrays.asList(90, 90, 91));
        ArrayList<Integer> gradeListB = new ArrayList<>(Arrays.asList(87, 99, 100));

        subjectGrades.put("Joe", gradeListA);
        subjectGrades.put("Jane", gradeListB);

        // Access a field
        System.out.println(subjectGrades.get("Jane")); // [87, 99, 100]

        // Access a specific element of a key
        System.out.println(subjectGrades.get("Jane").get(2)); // 100

        ArrayList<Integer> searchResult = subjectGrades.get("Jane");
        System.out.println(searchResult.get(2)); // 100




    }
}
