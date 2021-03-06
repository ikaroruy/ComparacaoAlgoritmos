/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaoalgoritmos;

import static comparacaoalgoritmos.SortUtils.exchange;
import static comparacaoalgoritmos.SortUtils.less;

/**
 *
 * @author Ykaro
 */


public class QuickSortBasic {

	public void sort (int[] input){
		
		//KnuthShuffle.shuffle(input);
		sort (input, 0, input.length-1);
	}

	private void sort(int[] input, int lowIndex, int highIndex) {

		if (highIndex<=lowIndex){
			return;
		}
		
		int partIndex=partition (input, lowIndex, highIndex);

		sort (input, lowIndex, partIndex-1);
		sort (input, partIndex+1, highIndex);
	}

	private int partition(int[] input, int lowIndex, int highIndex) {
		
		int i=lowIndex;
		int pivotIndex=lowIndex;
		int j=highIndex+1;
		
		
		while (true){
			
			while (less(input[++i], input[pivotIndex])){
				if (i==highIndex) break;
			}
			
			while (less (input[pivotIndex], input[--j])){
				if (j==lowIndex) break;
			}
				
			if (i>=j) break;
			
			exchange(input, i, j);
			
		}
		
		exchange(input, pivotIndex, j);
		
		return j;
	}
	
}
