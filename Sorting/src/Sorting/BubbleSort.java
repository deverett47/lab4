package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		double i = array.length;
    	boolean sorted = false;
    	
    	while ((i > 1)&&(!sorted)) {
    		sorted = true;
    		for (int j = 1; j < i; j++) {
    			if (array[j-1] > array[j]) {
    				int temp = array[j-1];
    				array[j-1] = array[j];
    			    array[j] = temp;
    			    sorted = false;
    			}
    		}
    		i--;
    	}
    	
    	

        return array;
	}
}
