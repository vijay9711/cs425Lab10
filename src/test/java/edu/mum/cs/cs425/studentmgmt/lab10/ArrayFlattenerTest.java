package edu.mum.cs.cs425.studentmgmt.lab10;


import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertNull;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArrayFlattenerTest {

    private final ArrayFlattener arrayFlattener = new ArrayFlattener();

    @Test
    public void testFlattenArray() {
        Integer[][] input = { {1, 3}, {0}, {4, 5, 9} };
        Integer[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, arrayFlattener.flattenArray(input));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        Integer[][] input = null;
        assertNull(arrayFlattener.flattenArray(input));
    }
}