/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaoalgoritmos;

/**
 *
 * @author Ykaro
 */
import static comparacaoalgoritmos.SortUtils.generateDuplicateData;
import static comparacaoalgoritmos.SortUtils.generateRandomData;
import static comparacaoalgoritmos.SortUtils.isSorted;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {

    public static int[] input;

    @BeforeClass
    public static void setup() {
        input = generateRandomData(100);

//        input = generateDuplicateData(10000);
    }

    @Test
    public void testQuickSortBasic() {
        QuickSortBasic sort = new QuickSortBasic();
        int[] copiedArray = Arrays.copyOf(input, input.length);
        System.out.println(Arrays.toString(copiedArray));
        long startTime = System.nanoTime();
        sort.sort(copiedArray);
        System.out.println(Arrays.toString(copiedArray));
        long timeTaken = System.nanoTime() - startTime;

        System.out.println("Quick Sort Basic : " + timeTaken / 1000000 + " millis");
        assertTrue(isSorted(copiedArray));
    }

    @Test
    public void testQuickSortDualPivot() {
        QuickSortDualPivot sort = new QuickSortDualPivot();

        int[] copiedArray = Arrays.copyOf(input, input.length);
        System.out.println(Arrays.toString(copiedArray));
        long startTime = System.nanoTime();
        sort.sort(copiedArray);
        long timeTaken = System.nanoTime() - startTime;
        System.out.println(Arrays.toString(copiedArray));

        System.out.println("Quick Sort Dual Pivot : " + timeTaken / 1000000 + " millis");
        assertTrue(isSorted(copiedArray));

    }

    @Test
    public void testShellSortTriangular() {
        ShellSortTriangular sort = new ShellSortTriangular();
        int[] copiedArray = Arrays.copyOf(input, input.length);

        System.out.println(Arrays.toString(copiedArray));
        long startTime = System.nanoTime();
        sort.sort(copiedArray);
        long timeTaken = System.nanoTime() - startTime;
        System.out.println(Arrays.toString(copiedArray));

        System.out.println("Shell Sort Triangular : " + timeTaken / 1000000 + " millis");
        assertTrue(isSorted(copiedArray));
    }


}
