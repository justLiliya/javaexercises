public class Main {

    public static void main(String[] args) {
        String someString = "a-beautiful-rose";
        String word = "1Абракадабра2";
        int[] arr = {2, 20, 1, 40, 3, 100};
        SortAlgo.bubbleSort(arr);
        SortAlgo.secondBubbleSort(arr);
        System.out.println(StringConverse.toCamelCase(someString));
        System.out.println(StringConverse.secondToCamelCase("A-beautiful-rose"));
        System.out.println(StringConverse.thirdToCamelCase("A-beautiful-rose"));
        System.out.println(StringReverse.reverseWord(word));
        System.out.println(Factorial.getFactorial(5));
        System.out.println(Factorial.getFactorialfromCycle(5));
        RandomNums.universalValues(RandomNums.getArray());
        System.out.println(NumberOfVowelsInLine.countVowels("A-beautiful-rose"));
    }

}
