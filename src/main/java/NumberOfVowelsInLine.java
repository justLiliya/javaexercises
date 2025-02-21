public class NumberOfVowelsInLine {

    /**
     * Напишите функцию, которая подсчитывает количество гласных букв (a, e, i, o, u) в строке
     */

    public static int countVowels(String s){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(char c: s.toCharArray()){
            if(vowels.indexOf(c) != -1)
                count++;
        }
        return count;
    }
}
