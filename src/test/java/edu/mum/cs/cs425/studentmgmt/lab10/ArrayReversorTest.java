package edu.mum.cs.cs425.studentmgmt.lab10;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayReversorTest {

    private ArrayReversor arrayReversor;
    private ArrayFlattenerService mockArrayFlattenerService;

    @Before
    public void setUp() {
        mockArrayFlattenerService = Mockito.mock(ArrayFlattenerService.class);
        arrayReversor = new ArrayReversor(mockArrayFlattenerService);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        Integer[][] input = { {1, 3}, {0}, {4, 5, 9} };
        Integer[] flattenedArray = {1, 3, 0, 4, 5, 9};
        Integer[] expectedReversedArray = {9, 5, 4, 0, 3, 1};
        when(mockArrayFlattenerService.flattenArray(input)).thenReturn(flattenedArray);
        Integer[] result = arrayReversor.reverseArray(input);
        verify(mockArrayFlattenerService).flattenArray(input);
        assertArrayEquals(expectedReversedArray, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        Integer[][] input = null;
        when(mockArrayFlattenerService.flattenArray(input)).thenReturn(null);
        Integer[] result = arrayReversor.reverseArray(input);
        verify(mockArrayFlattenerService).flattenArray(input);
        assertNull(result);
    }
}
