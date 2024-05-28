
public class Merge_Two_Sorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays until one of the arrays is exhausted
        for (k = 0; k < mergedArray.length; k++) {
            // If all elements from arr1 are already in mergedArray
            if (i == n1) {
                mergedArray[k] = arr2[j++];
            }
            // If all elements from arr2 are already in mergedArray
            else if (j == n2) {
                mergedArray[k] = arr1[i++];
            }
            // Compare elements from arr1 and arr2 and add the smaller one to mergedArray
            else if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i++];
            } else {
                mergedArray[k] = arr2[j++];
            }
        }

        return mergedArray;
    }
}
