package DSA.Strings;

public class Substr {
    public static void substr(String str, int si, int ei){
        //si = starting index ei = ending inex
        String subStr= "";
        for (int i = si; i<= ei ; i++){
            subStr += str.charAt(i);
        }
        System.out.println(subStr);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(5,str.length()));//Hell
        substr(str, 0, 4);
    }
}
