public class StringReverse {

    /**Перевернуть строку на 90 градусов, не пользуясь встроенными методами**/

    public static String reverseWord(String word){
        char[]characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);

    }
}
