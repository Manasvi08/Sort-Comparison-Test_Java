import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Manasvi Ghanta
 *  @version HT 2020
 */

 class SortComparison {
	 
	 static boolean isEmpty(double[] a) {
			// TODO Auto-generated method stub
			{
				if(a == null){
					return true;
				}
				else {
					return false;
				}
			}
	 }

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){

        //todo: implement the sort
    	if (isEmpty(a)) {
    		return null;
    	}
    	else {
    	double storeArray;
    	for(int i = 1; i < a.length; i++) {
    		for(int j = i ; j > 0 ; j--){
    			if(a[j] < a[j-1]){
    				storeArray = a[j];
    				a[j] = a[j-1];
    				a[j-1] = storeArray;
    			}
    		}
    	}
    	
    	
    	return a;
    	}
    }//end insertionsort
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){

         //todo: implement the sort
    	if (isEmpty(a)) {
    		return null;
    	}
    	else {
    	for (int i = 0; i < a.length - 1; i++) {
    		int findMin = i;
    		for (int j = i+1; j < a.length; j++) {
    			if (a[j] < a[findMin]) {
    				findMin = j;
    			}
    		}
    		double tempArray = a[findMin];
    		a[findMin] = a[i];
    		a[i] = tempArray;
    	}
    	return a;
    	}
    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
	
		 //todo: implement the sort
    	if (isEmpty(a)) {
    		return null;
    	}
    	else {
    	recursiveQuickSort(a, 0, a.length-1 );
		return a;

    }
    }//end quicksort
    
    public static void recursiveQuickSort(double[] recursiveArray, int leftIndex, int rightIndex) {
    	int index = partition(recursiveArray, leftIndex, rightIndex);
    	if (leftIndex < index - 1) {
    		 recursiveQuickSort(recursiveArray, leftIndex, index - 1);
        }
    	if (rightIndex > index) { 
    		recursiveQuickSort(recursiveArray, index, rightIndex); 
    		}

    }

    public static int partition(double[] partitionArray, int leftIndex, int rightIndex) { 
    	double pivotElement = partitionArray[leftIndex]; 
    	while (leftIndex <= rightIndex) { 
    		while (partitionArray[leftIndex] < pivotElement) { leftIndex++; }  
    		while (partitionArray[rightIndex] > pivotElement) { rightIndex--; }  
    		if (leftIndex <= rightIndex) { double tmp = partitionArray[leftIndex];
    		partitionArray[leftIndex] = partitionArray[rightIndex];
    		partitionArray[rightIndex] = tmp; 
    		leftIndex++; 
    		rightIndex--; 
    		} 
    	} return leftIndex; 
    }

   

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    

    static double[] mergeSort (double a[]) {if (isEmpty(a)) {
		return null;
	}
	else {
    	
    	double[] aux = new double[a.length];
		sort(a, aux, 0, a.length-1);
		return a;
	}
		 //todo: implement the sort
    	
    }//end mergesort
    private static void merge(double[] a, double[] aux, int low, int middle, int high ) {
    	for(int copyIndex = low; copyIndex <= high; copyIndex++) {
			 aux[copyIndex]= a[copyIndex];
    	}
		 
		 int i = low;
		 int j = middle + 1;
		 for(int mergeIndex = low; mergeIndex <= high; mergeIndex++)
		 {
			 if(i > middle) {
				 a[mergeIndex] = aux[j++];
			 }
			 else if(j > high) {
				 a[mergeIndex] = aux[i++];
			 }
			 else if(aux[j] < aux[i]) {
				 a[mergeIndex] = aux[j++];
			 }
			 else {
				 a[mergeIndex] = aux[i++];
			 }
		 }
    }
    
    private static void sort(double[]a, double[]aux, int low, int high) {
    	if(high <= low) return;
    	int middle = low + (high -low)/2;
    	sort(a, aux, low, middle);
    	sort(a, aux, middle + 1, high);
    	merge(a, aux, low, middle, high);
    }
    
 



    



   


    //public static void main(String[] args) throws IOException {
    	
    	
    }
 //}    

 
 
	
 

 //end class

