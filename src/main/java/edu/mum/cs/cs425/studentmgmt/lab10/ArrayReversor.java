package edu.mum.cs.cs425.studentmgmt.lab10;

public class ArrayReversor {

    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public Integer[] reverseArray(Integer[][] a_in) {
        if (a_in == null) {
            return null;
        }
        Integer[] flattenedArray = arrayFlattenerService.flattenArray(a_in);
        if (flattenedArray == null) {
            return null;
        }
        Integer[] reversedArray = new Integer[flattenedArray.length];
        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }
        return reversedArray;
    }
}
