public class StringConverse {

    public static String toCamelCase(String s) {
        String newString = "";
        char [] mychar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (mychar[i] == '_' || mychar[i] == '-' && i != s.length() - 1) {
                newString += Character.toUpperCase(mychar[i+1]);
                i++;
            }else {
                newString+= mychar[i];
            }
        }
        return  newString;
    }

    public static String secondToCamelCase(String s) {
        String secondNew = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '_' || s.charAt(i) == '-' && i != s.length()-1){
                secondNew+=Character.toUpperCase(s.charAt(i+1));
                i++;
            }else{
                secondNew+=s.charAt(i);
            }
        }
        return secondNew;
    }

    public static String thirdToCamelCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) =='_' || s.charAt(i) == '-' && i != s.length()-1){
                str.append(s.charAt(i+1));
                i++;
            }else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
