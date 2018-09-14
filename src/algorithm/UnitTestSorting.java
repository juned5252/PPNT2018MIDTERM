package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        Numbers.randomize(unSortedArray,unSortedArray.length);
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not Sorted");
        } catch (Exception e) {
            e.getMessage();
        }

        Numbers.randomize(unSortedArray,unSortedArray.length);
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not Sorted");
        } catch (Exception e) {
            e.getMessage();
        }

        Numbers.randomize(unSortedArray,unSortedArray.length);
        sort.mergesort(unSortedArray,0,6);
        try {
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not Sorted");
        } catch (Exception e) {
            e.getMessage();
        }

        Numbers.randomize(unSortedArray,unSortedArray.length);
        int[] storArray = sort.bucketsort(unSortedArray,9);
        try {

            Assert.assertEquals(sortedArray,storArray,"Array is not Sorted");
        } catch (Exception e) {
            e.getMessage();
        }

        Numbers.randomize(unSortedArray,unSortedArray.length);
        sort.Quicksort(unSortedArray,0,6);
        try {
            Assert.assertEquals(sortedArray,unSortedArray,"Array is not Sorted");
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
