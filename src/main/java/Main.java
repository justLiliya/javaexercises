public class Main {

    public static void main(String[] args) {
        String someString = "a-beautiful-rose";
        int[] arr = {2, 20, 1, 40, 3, 100};
        //SortAlgo.bubbleSort(arr);
        SortAlgo.secondBubbleSort(arr);
        System.out.println(StringConverse.toCamelCase(someString));
        System.out.println(StringConverse.secondToCamelCase("A-beautiful-rose"));
        System.out.println(StringConverse.thirdToCamelCase("A-beautiful-rose"));
    }

}
