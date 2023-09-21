public class StringConverse {

    /**
     * Создайте метод, который преобразует словосочетания, разделенные нижним
     * подчеркиванием или дефисом в camelCase. Первое слово в получившемся сочетании
     * должно начинать с большой буквы, только если первое слово в оригинальной фразе
     * было с большой буквы, во всех остальных случаях следуем правилам camelCase -
     * первое слово маленькой буквы.
     * Примеры:
     * “a-beautiful-rose” дожно стать “aBeautifulRose”
     * “A-beautiful-rose” должно стать “ABeautifulRose”
     * “a_beautiful_rose” должно стать “aBeautifulRose”
     * “a_beautiful-rose” должно стать “aBeautifulRose”
     * “A_Beautiful-rose” должно стать “ABeautifulRose”
     **/

    public static String toCamelCase(String s) {
        String newString = "";
        char[] mychar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (mychar[i] == '_' || mychar[i] == '-' && i != s.length() - 1) {
                newString += Character.toUpperCase(mychar[i + 1]);
                i++;
            } else {
                newString += mychar[i];
            }
        }
        return newString;
    }

    public static String secondToCamelCase(String s) {
        String secondNew = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-' && i != s.length() - 1) {
                secondNew += Character.toUpperCase(s.charAt(i + 1));
                i++;
            } else {
                secondNew += s.charAt(i);
            }
        }
        return secondNew;
    }

    public static String thirdToCamelCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-' && i != s.length() - 1) {
                str.append(s.charAt(i + 1));
                i++;
            } else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
