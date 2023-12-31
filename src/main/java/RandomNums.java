
public class RandomNums {

    //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

    public static double[] getArray() {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void universalValues(double[] array) {
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
            avg += array[i] / array.length;
        }
        System.out.println("max: " + max + ", min: " + min + ", avg: " + avg);
    }
}
