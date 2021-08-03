package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
       // characterClasses();
        preDefinedCharacterClasses();
    }

    public static void characterClasses() {
        List<String> regexes = new ArrayList<>(Arrays.asList("[abc]", "[^abc]", "[a-z]", "[0-9]", "[a-zA-Z0-9]", "[^a-zA-Z0-9]"));
        for (String regex : regexes) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher("a7b@z#9");
            System.out.println("regex:" + regex);
            while (m.find()) {
                System.out.println(m.start() + " " + m.group());
            }
        }
    }

    public static void preDefinedCharacterClasses() {
        List<String> regexes = new ArrayList<>(Arrays.asList("\\s", "\\S", "\\d", "\\D", "\\w", "\\W", "."));
        for (String regex : regexes) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher("a7b k@9");
            System.out.println("regex:"+regex);
            while (m.find()) {
                System.out.println(m.start() + " " + m.group());
            }
        }
        /* s->space, S->except space , d->digit , D->Except Digit , w->word(alpha-numeric), W->except word , .->everything
         we use \\d (2 slashes because if we use \d then compiler treats it as escape character so we give \\d i.e 2 slashes) */
    }
}
