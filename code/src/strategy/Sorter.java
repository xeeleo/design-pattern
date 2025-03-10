package strategy;

public class Sorter<T> {

  public void sort(T[] arr, IComparable<T> comparator) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        minPos = comparator.compareTo(arr[j], arr[minPos]) == -1 ? j : minPos;
      }
      this.swap(arr, i, minPos);
    }
  }

  private void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
