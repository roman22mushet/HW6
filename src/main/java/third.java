public class third {
    private static int diffWords(String st) {
        StringBuffer u = new StringBuffer();
        String c;
        for (int i = 0; i < st.length(); i++) {
            c = String.valueOf(st.charAt(i));
            if (u.indexOf(c) == -1)
                u.append(c);
        }

        return u.length();
    }

    public static void main(String[] args) {
        String[] a = {"fffff", "ab", "f", "1324", "jkjk"};
        String goal = a[0];
        System.out.println("Массив: ");
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + ", ");
            if (diffWords(a[i]) < diffWords(goal))
                goal = a[i];
        }
        System.out.println("");
        System.out.println("Искомое слово: " + goal + ", число разных символов: " + diffWords(goal));
    }
}
