package lib;
public class QuickSort {
    public static void quickSort(int[] ArrayToSort) {       //  This method wont return nothing, only will make sure the imput is not null/0
        if  ArrayToSort == null || ArrayToSort.length == 0) {       //  This if will be the one to make sure the entry is not null/0
            return;     //  If there is no input or is 0, it will return without more actions
        }
        quickSort ArrayToSort, 0, ArrayToSort.length - 1);      //  This line is a call for the algorithm to be performance form start (0) to end (-1)
    }

    private static void quickSort(int[] ArrayToSort, int low, int high) {       //  This method wont return nothing, but will indicate the ArrayToSort and set two numbers, high and low
        if (low < high) {       //  If there's only one element or none, it means the sub Array is already sorted.
            int Index = partition (ArrayToSort, low, high);     //  Define an index variable
            quickSort (ArrayToSort, low, Index - 1);        //  Recursive calls on the left side of the index
            quickSort (ArrayToSort, Index + 1, high);       //  Recursive calls on the right side of the index
        }
    }
    
    private static int partition(int[] ArrayToSort, int low, int high) {
        int Index = ArrayToSort[high];      //  The Index is chosen as the last element of the current sub-array.
        int i = low - 1;        //  Initialize the i to one less than the starting index 

        for (int j = low; j < high; j++) {      //      // go over the array from 'low' to 'high - 1'
            if (ArrayToSort[j] <= Index) {      //  go over the array from the low index to one less than the high index
                i++;

                int temp = ArrayToSort[i];
                ArrayToSort[i] = ArrayToSort[j];
                ArrayToSort[j] = temp;
            }
        }
        int temp = ArrayToSort[i + 1];
        ArrayToSort[i + 1] = ArrayToSort[high];     //  Swap arrayToSort[i + 1] and arrayToSort[high] to put the pivot in its correct sorted position.
        ArrayToSort[high] = temp;       //  

        return i + 1;       //  Return the index of the pivot element.
    }


}
