package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        System.out.println();
//        patternAndMatcher();
//        quantifiers();
//        metaCharacters();
//        findingRegex();
        emailValidation();
    }

    public static void patternAndMatcher() {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches the given Regex: " + matcher.matches());
        String regex = "[xyz]";
        System.out.println(Pattern.matches(regex, "wbcd"));
        System.out.println(Pattern.matches(regex, "x"));
        System.out.println(Pattern.matches(regex, "xxyyyyyyz"));
    }

    public static void quantifiers() {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
    }

    public static void metaCharacters() {
        System.out.println("metacharacters d....");

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("metacharacters D....");

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
    }

    public static void findingRegex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter regex pattern:");
        Pattern pattern = Pattern.compile(sc.nextLine());
        System.out.print("Enter text:");
        Matcher matcher = pattern.matcher(sc.nextLine());
        boolean found = false;
        while (matcher.find()) {
            System.out.println("I found the text " + matcher.group() + " starting at index " +
                    matcher.start() + " and ending at index " + matcher.end());
            found = true;
        }
        if (!found) {
            System.out.println("No match found.");
        }
    }

    public static void emailValidation() {
        String email1 = "rohitsai@gmail.com";
        String email2 = "rohit@gmailcom";
        String regex = "^[A-Za-z0-9_.-]+@[A-Za-z0-9]+[.][a-zA-Z0-9]{2,6}$";
        System.out.println(Pattern.matches(regex, email1));
        System.out.println(Pattern.matches(regex, email2));
    }
}
