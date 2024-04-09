package DSA.Recursion;

public class RemoveDuplicate {

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currCh = str.charAt(idx);
        if (Character.isUpperCase(currCh)) {
            // Map uppercase letters to indices 0-25
            currCh = Character.toLowerCase(currCh);
        }

        if (map[currCh - 'a']) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currCh - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currCh), map);
        }
    }

    public static void main(String[] args) {
        String str = "Ammmeyytthore";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
