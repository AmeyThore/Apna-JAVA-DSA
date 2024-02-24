package DSA.Strings;

public class Compress {
    public static String  compressString(String str) {
        StringBuffer sb = new StringBuffer();
        int count=1;
        
        for (int i=0;i<str.length()-1;i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                sb.append(str.charAt(i)+"");
                sb.append(count);
                count=1;
            }
        }
        //Adding the last character and its frequency
        sb.append(str.charAt(str.length() -1)+ "");
        sb.append(count);
        return sb.toString();
    }

    public static String compressor(String str1) {
        String nwStr = "";
        for (int i = 0; i < str1.length() - 1; i++) {
            Integer count = 0;
            while (i < str1.length() - 1 && str1.charAt(i) == str1.charAt(i + 1)  ) {
                count++;
                i++;
            }
            nwStr += str1.charAt(i);
            if (count > 1) {
                nwStr += count.toString();
            }
        }
        return nwStr;
    }
        
    public static void main(String args[]){
        System.out.println("Compressed string is : "+compressString("aabcc"));
        System.out.println("Compressed string using another method is : "+compressor("aaabbccccddddd"));
    }
    }
//     public static void main(String[] args) {
//         String str = "aaabbccccddddd";
//     }
// }
