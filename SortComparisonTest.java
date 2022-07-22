import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Manasvi Ghanta
 *  @version HT 2020
 */
/*
+---------------------+--------+-----------+-------+-------+
|                     | Insert | Selection | Quick | Merge |
+---------------------+--------+-----------+-------+-------+
| 100 random          |   0.17 |   0.09    |   0.06|   0.09|
+---------------------+--------+-----------+-------+-------+
| 1000 Random         |7.57    |  5.41     | 1.9   |0.22   |
+---------------------+--------+-----------+-------+-------+
| 1000 few unique     | 0.65   | 0.73      | 0.08  |0.6    |
+---------------------+--------+-----------+-------+-------+
| 1000 nearly ordered |    0.25| 0.36      |   0.23|  0.22 |
+---------------------+--------+-----------+-------+-------+
| 1000 reverse order  |  0.49  |  0.34     |   0.25|   0.19|
+---------------------+--------+-----------+-------+-------+
| 1000 sorted         | 0.4    | 0.34      |   0.2 |  0.07 |
+---------------------+--------+-----------+-------+-------+
| 10000 random        | 38.53  |   32.37   |  12.25| 1.38  |
+---------------------+--------+-----------+-------+-------+

*/

@RunWith(JUnit4.class)
public class SortComparisonTest
{
	private static final double DELTA = 1e-15;
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
        	double [] a = null;
        	assertTrue(SortComparison.isEmpty(a));
        
    }
    
    @Test
    public void testInsertionSortEmpty() {
    	double [] a = null;
    	assertNull(SortComparison.insertionSort(a));
    }
    
    @Test
    public void testSingleInsertionSort() {
    	double [] aSingle = {8.6};
    	double [] aSingleSorted = {8.6};
    	double [] singleCheckInsertionSort = SortComparison.insertionSort(aSingle);
    	assertArrayEquals(singleCheckInsertionSort, aSingleSorted, DELTA);
    }
    
    	
    @Test
    public void testInsertionSort() {
    	double [] a = {7.9, 47.7, 1.8, 0.4, 4.8, 8.54};
    	double [] aSorted = { 0.4, 1.8, 4.8, 7.9, 8.54, 47.7};
    	double [] checkInsertionSort = SortComparison.insertionSort(a);
    	assertArrayEquals(checkInsertionSort, aSorted, DELTA);
    	
    }
    
    @Test
    public void testNegativeInsertionSort() {
    	double [] aNegativeElementCheck = {-7.9, -47.7, -1.8, -0.4, -4.8, -8.54};
    	double [] aNegativeElementCheckSorted = {-47.7, -8.54, -7.9, -4.8, -1.8, -0.4};
    	double [] negativeInsertionSortCheck = SortComparison.insertionSort(aNegativeElementCheck);
    	assertArrayEquals(negativeInsertionSortCheck, aNegativeElementCheckSorted, DELTA);
    }
    
    @Test
    public void testSelectionSortEmpty() {
    	double [] a = null;
    	assertNull(SortComparison.selectionSort(a));
    }
    
    @Test
    public void testSingleSelectionSort() {
    	double [] aSingle = {8.6};
    	double [] aSingleSorted = {8.6};
    	double [] singleCheckSelectionSort = SortComparison.selectionSort(aSingle);
    	assertArrayEquals(singleCheckSelectionSort, aSingleSorted, DELTA);
    }
    
    	
    @Test
    public void testSelectionSort() {
    	double [] a = {7.9, 47.7, 1.8, 0.4, 4.8, 8.54};
    	double [] aSorted = { 0.4, 1.8, 4.8, 7.9, 8.54, 47.7};
    	double [] checkSelectionSort = SortComparison.selectionSort(a);
    	assertArrayEquals(checkSelectionSort, aSorted, DELTA);
    	
    }
    
    @Test
    public void testNegativeSelectionSort() {
    	double [] aNegativeElementCheck = {-7.9, -47.7, -1.8, -0.4, -4.8, -8.54};
    	double [] aNegativeElementCheckSorted = {-47.7, -8.54, -7.9, -4.8, -1.8, -0.4};
    	double [] negativeSelectionSortCheck = SortComparison.selectionSort(aNegativeElementCheck);
    	assertArrayEquals(negativeSelectionSortCheck, aNegativeElementCheckSorted, DELTA);
    }
    
    @Test
    public void testQuickSortEmpty() {
    	double [] a = null;
    	assertNull(SortComparison.quickSort(a));
    }
    
    @Test
    public void testSingleQuickSort() {
    	double [] aSingle = {8.6};
    	double [] aSingleSorted = {8.6};
    	double [] singleCheckQuickSort = SortComparison.quickSort(aSingle);
    	assertArrayEquals(singleCheckQuickSort, aSingleSorted, DELTA);
    }
    
    	
    @Test
    public void testQuickSort() {
    	double [] a = {7.9, 47.7, 1.8, 0.4, 4.8, 8.54};
    	double [] aSorted = { 0.4, 1.8, 4.8, 7.9, 8.54, 47.7};
    	double [] checkQuickSort = SortComparison.quickSort(a);
    	assertArrayEquals(checkQuickSort, aSorted, DELTA);
    	
    }
    
    @Test
    public void testNegativeQuickSort() {
    	double [] aNegativeElementCheck = {-7.9, -47.7, -1.8, -0.4, -4.8, -8.54};
    	double [] aNegativeElementCheckSorted = {-47.7, -8.54, -7.9, -4.8, -1.8, -0.4};
    	double [] negativeQuickSortCheck = SortComparison.quickSort(aNegativeElementCheck);
    	assertArrayEquals(negativeQuickSortCheck, aNegativeElementCheckSorted, DELTA);
    }
    
    @Test
    public void testMergeSortEmpty() {
    	double [] a = null;
    	assertNull(SortComparison.mergeSort(a));
    }
    
    @Test
    public void testSingleMergeSort() {
    	double [] aSingle = {8.6};
    	double [] aSingleSorted = {8.6};
    	double [] singleCheckMergeSort = SortComparison.mergeSort(aSingle);
    	assertArrayEquals(singleCheckMergeSort, aSingleSorted, DELTA);
    }
    
    	
    @Test
    public void testMergeSort() {
    	double [] a = {7.9, 47.7, 1.8, 0.4, 4.8, 8.54};
    	double [] aSorted = { 0.4, 1.8, 4.8, 7.9, 8.54, 47.7};
    	double [] checkMergeSort = SortComparison.mergeSort(a);
    	assertArrayEquals(checkMergeSort, aSorted, DELTA);
    	
    }
    
    @Test
    public void testNegativeMergeSort() {
    	double [] aNegativeElementCheck = {-7.9, -47.7, -1.8, -0.4, -4.8, -8.54};
    	double [] aNegativeElementCheckSorted = {-47.7, -8.54, -7.9, -4.8, -1.8, -0.4};
    	double [] negativemergeSortCheck = SortComparison.mergeSort(aNegativeElementCheck);
    	assertArrayEquals(negativemergeSortCheck, aNegativeElementCheckSorted, DELTA);
    }
    


    // TODO: add more tests here. Each line of code and each decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    /*public static void main(String[] args)
    {
        //TODO: implement this method
         * 
         * /* //--------------------------1000 RANDOM -----------------------------------------
    	String fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbers1000.txt";
    	BufferedReader br = new BufferedReader(new FileReader(fileName));
    	String[] line= new String[1000];
    	int index = 0;
    	double[] arr = new double[1000];
    	while((line[index++] = br.readLine()) != null && index<line.length){ 						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}


    	long start = System.nanoTime();
    	insertionSort(arr);
    	long end = System.nanoTime();
    	double milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	double milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	double milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers1000random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers1000random);
    	//---------------------INSERTION SORT---------------------------
    	
    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers1000random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers1000random);

    	//--------------------------SELECTION SORT-------------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers1000random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers1000random);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers1000random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000random);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------1000 FEW UNIQUE---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbers1000Duplicates.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[1000];
    	index = 0;
    	arr = new double[1000];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers1000fewunique = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers1000fewunique);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers1000fewunique = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers1000fewunique);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers1000fewunique = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers1000fewunique);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers1000fewunique = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000fewunique);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------1000 NEARLY ORDERED---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbersNearlyOrdered1000.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[1000];
    	index = 0;
    	arr = new double[1000];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers1000nearlyordered = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers1000nearlyordered);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers1000nearlyordered = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers1000nearlyordered);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers1000nearlyordered = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers1000nearlyordered);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers1000nearlyordered = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000nearlyordered);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------100 RANDOM---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbers1000Duplicates.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[100];
    	index = 0;
    	arr = new double[100];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers100random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers100random);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers100random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers100random);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers100random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers100random);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers100random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers100random);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------1000 REVERSE ORDER---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbersReverse1000.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[1000];
    	index = 0;
    	arr = new double[1000];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers1000ReverseOrder = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers1000ReverseOrder);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers1000ReverseOrder = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers1000ReverseOrder);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers1000ReverseOrder = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers1000ReverseOrder);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers1000ReverseOrder = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000ReverseOrder);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------1000 SORTED---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbersSorted1000.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[1000];
    	index = 0;
    	arr = new double[1000];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers1000Sorted = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers1000Sorted);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers1000Sorted = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers1000Sorted);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers1000Sorted = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers1000Sorted);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers1000Sorted = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000Sorted);
    	//------------------------------MERGE SORT---------------------------------------
//--------------------------------------------------------------------------------------------------------------------
    	// ------------------------------10000 RANDOM---------------------------------------------

    	fileName = "/Users/manasvi/Desktop/ADS II/Assignment1Java/src/numbers10000.txt";
    	br = new BufferedReader(new FileReader(fileName));
    	line= new String[10000];
    	index = 0;
    	arr = new double[10000];
    	while((line[index++] = br.readLine()) != null && index<line.length){
    		//index++;  						
    	}
    	for (int i = 0; i < arr.length; i++){
    		arr[i] = Double.parseDouble(line[i]);
    	}
    	
    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	insertionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//----------------------INSERTION SORT--------------------------------
    	double millisecondsInsertionSortNumbers10000Random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsInsertionSortNumbers10000Random);
    	//---------------------INSERTION SORT---------------------------

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	selectionSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//---------------------------------SELECTION SORT--------------------------------
    	double millisecondsSelectionSortNumbers10000Random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsSelectionSortNumbers10000Random);
    	
    	//--------------------------------SELECTION SORT-----------------------------------
    	
    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	quickSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);
    	
    	//------------------------------QUICK SORT-------------------------------------

    	double millisecondsQuickSortNumbers10000Random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsQuickSortNumbers10000Random);
    	//------------------------------QUICK SORT----------------------------------------

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds1 = (end - start) / 1000000;
    	//System.out.println(milliseconds1);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds2 = (end - start) / 1000000;
    	//System.out.println(milliseconds2);

    	start = System.nanoTime();
    	mergeSort(arr);
    	end = System.nanoTime();
    	milliseconds3 = (end - start) / 1000000;
    	//System.out.println(milliseconds3);

    	//-------------------------------MERGE SORT-----------------------------------
    	double millisecondsMergeSortNumbers10000Random = (milliseconds1 + milliseconds2 +milliseconds3)/3;

    	System.out.println(millisecondsMergeSortNumbers1000Sorted);
    	//------------------------------MERGE SORT---------------------------------------
//-------------------------------------------------------------------------------------------------------------------- */
    

}

