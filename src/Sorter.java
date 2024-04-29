public class Sorter {

  public static void quicksort(int array[]) {
    final int N = array.length;
    quickSort(array, 0, N - 1);
  }

  public static void quickSort(int array[], int start, int end) {
    if (start >= end) {
        return;
    }
    
    int pivot = array[start];
    int left = start + 1;
    int right = end;
    while (left <= right) {
      while (left <= end && array[left] < pivot) {
        left++;
      }
      while (right > start && array[right] >= pivot) {
        right--;
      }
      if (left < right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
      }
    }

    if (right > start) {
      int temp = array[start];
      array[start] = array[right];
      array[right] = temp;
    }
    quickSort(array, start, right - 1);
    quickSort(array, right + 1, end);
  }

  public static void printArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("");
  }

  static void bubbleSort(int arr[], int n) {
    int i, j, temp;
    boolean swapped;
    for (i = 0; i < n - 1; i++) {
      swapped = false;
      for (j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }

      if (swapped == false)
        break;
    }
  }

}
