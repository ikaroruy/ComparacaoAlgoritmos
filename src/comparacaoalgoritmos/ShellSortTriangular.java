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
public class ShellSortTriangular {
    
    
    public void sort(int input[]) {
        int i, j, value, gap = 1, auxGap = 1;
        do {
            gap = (auxGap * (auxGap + 1)) / 2;
            auxGap += 1;
        } while (gap < input.length);
        do {
            gap = (gap - 1) / 2;
            for (i = gap; i < input.length; i++) {
                value = input[i];
                j = i - gap;
                while (j >= 0 && value < input[j]) {
                    input[j + gap] = input[j];
                    j -= gap;
                }
                input[j + gap] = value;
            }
        } while (gap > 1);
       
    }
    
    public void shellSort(int[] array) {
    int gap = array.length / 2;
    while (gap > 0) {
        for (int i = 0; i < array.length - gap; i++) { //modified insertion sort
            int j = i + gap;
            int tmp = array[j];
            while (j >= gap && tmp > array[j - gap]) {
                array[j] = array[j - gap];
                j -= gap;
            }
            array[j] = tmp;
        }
        if (gap == 2) { //change the gap size
            gap = 1;
        } else {
            gap /= 2.2;
        }
    }

}


}

