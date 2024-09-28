public class Task_02 {
    public static void modifyStrings(String S, String S1, String S2) {
        String modifiedString = "";
        int n = S.length();
        int m = S1.length();
        int i = 0;
        while (i <= n - m) {
            boolean match = true;
            for (int j = 0; j < m; j++) {
                if (S.charAt(i + j) != S1.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                modifiedString += S2;
                i += m;
            } else {
                modifiedString += S.charAt(i);
                i++;
            }
        }
        while (i < n) {
            modifiedString += S.charAt(i);
            i++;
        }
        System.out.println(modifiedString);
    }
    public static void main(String[] args) {
        String S1 = "aba";
        String S = "abababa";
        String S2 = "a";
        modifyStrings(S, S1, S2); // aba
        String S3 = "baddadda";
        String S4 = "dd";
        String S5 = "n";
        modifyStrings(S3, S4, S5); //banana
    }
}
