package edu.mum.cs.cs425.studentmgmt.lab10;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public Integer[] flattenArray(Integer[][] a_in) {
        if (a_in == null) {
            return null;
        }
        List<Integer> flattenedList = new ArrayList<>();
        for (Integer[] array : a_in) {
            for (Integer num : array) {
                flattenedList.add(num);
            }
        }
        return flattenedList.toArray(new Integer[0]);
    }
}