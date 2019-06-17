import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void rotateToTheRightTest() {
        Integer [] arrayToTheRight = {1,2,3};
        int rotationTimes = 2;
        Main.rotateToTheRight(arrayToTheRight,rotationTimes);
        Integer [] expectedArray = {2,3,1};
        System.out.println(Arrays.deepToString(arrayToTheRight));
        System.out.println(Arrays.deepToString(expectedArray));
        assertArrayEquals(expectedArray,arrayToTheRight);


    }

    @Test
    public void rotateToTheLeftTest() {
        Integer [] arrayToTheLeft = {1,2,3};
        int rotationTimes = 2;
        Main.rotateToTheLeft(arrayToTheLeft,rotationTimes);
        Integer[] expectedArray = {3,1,2};
        assertArrayEquals(expectedArray,arrayToTheLeft);

    }
}