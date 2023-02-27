package CoreJavaConcepts.packages_static_builtin_singleton.utils;

public class StringUtils {

    public static void reverse(String str) {
        String nstr="";
        char ch;


        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }

}
