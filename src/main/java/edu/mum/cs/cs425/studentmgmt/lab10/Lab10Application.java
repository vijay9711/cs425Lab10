package edu.mum.cs.cs425.studentmgmt.lab10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab10Application {

    public static void main(String[] args) {

        SpringApplication.run(Lab10Application.class, args);
        Integer[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        Integer[] flattenedArray = arrayFlattener.flattenArray(inputArray);
        System.out.println("Flattened Array:");
        for (Integer num : flattenedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        ArrayReversor arrayReversor = new ArrayReversor(new ArrayFlattenerService() {
            @Override
            public Integer[] flattenArray(Integer[][] a_in) {
                return arrayFlattener.flattenArray(a_in);
            }
        });
        Integer[] reversedArray = arrayReversor.reverseArray(inputArray);
        System.out.println("Reversed Array:");
        for (Integer num : reversedArray) {
            System.out.print(num + " ");
        }
    }

}
