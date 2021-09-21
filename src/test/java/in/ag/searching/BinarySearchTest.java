package in.ag.searching;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    private BinarySearch binarySearchImpl;

    @Before
    public void setup() {
        binarySearchImpl = new BinarySearch();
    }

    @Test
    public void testBinarySearch() {
        assertEquals(1, binarySearchImpl.performBinarySearch(new int[]{1, 2, 3, 4, 5, 6}, 2));
    }

    @Test
    public void testRecursionBinarySearch() {
        assertEquals(1, binarySearchImpl.performRecursionBinarySearch(new int[]{1, 2, 3, 4, 5, 6}, 2, 0, 5));
    }
}