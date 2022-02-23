import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String str = "I like Java!!!";
        System.out.println("I like Java!!!".charAt(13));
        boolean endOfWord;
        endOfWord = str.endsWith("!!!");
        System.out.println("The string ends with a character '!!!' " + endOfWord);
        boolean begin = str.startsWith("I like");
        System.out.println("The string starts with a character 'I like' " + begin);
        boolean got = str.contains("Java");
        System.out.println("String contains 'Java' : " + got);
        // Найти позицию подстроки “Java” в строке “I like Java!!!”. -- Не могу понять, что требуется в этом задании.
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 11));

        print("Ivanov", 5, "Математикe");
        print("Петрова", 4, "Физике");
        print("Сидорова", 3, "Программированию");
    }
    private  static void print(String lastName, int mark, String subject){
        System.out.printf("Студент %-15s получил %-3s по %-10s\n",lastName, mark, subject);
        // но не совсем понял зачем мы выделяли кол-во символов под слова
    }

}
