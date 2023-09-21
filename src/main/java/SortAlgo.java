import java.util.Arrays;

public class SortAlgo {

    //Пузырьковая сортировка

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void secondBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int b = arr[j];
                    arr[j] = arr[i];
                    arr[i] = b;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
