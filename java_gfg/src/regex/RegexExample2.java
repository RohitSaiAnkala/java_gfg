package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
//         characterClasses();
//         preDefinedCharacterClasses();
//         quantifiers();
//        patternClassSplitExample();
//        stringClassSplitExample();
//        stringTokenizerExample();
//        phoneNumberApplication();
          emailValidationApplication();
    }

    public static void characterClasses() {
        List<String> regexes = new ArrayList<>(Arrays.asList("[abc]", "[^abc]", "[a-z]", "[0-9]", "[a-zA-Z0-9]", "[^a-zA-Z0-9]"));
        /* [abc]->either a or b or c , [^abc] -> except a,b and c  , [a-z]->small letters , [A-Z]->capital letters,
        [0-9] ->digits ,[a-zA-Z0-9] -> alphanumeric, [^a-zA-Z0-9] ->except alphanumeric */
        helper(regexes, "a7b@z#9");
    }

    public static void preDefinedCharacterClasses() {
        List<String> regexes = new ArrayList<>(Arrays.asList("\\s", "\\S", "\\d", "\\D", "\\w", "\\W", "."));
        /* s->space, S->except space , d->digit , D->Except Digit , w->word(alpha-numeric), W->except word , .->everything
         we use \\d (2 slashes because if we use \d then compiler treats it as escape character so we give \\d i.e 2 slashes) */
        helper(regexes, "a7b k@9");
    }

    public static void quantifiers() {
        List<String> regexes = new ArrayList<>(Arrays.asList("a", "a+", "a*", "a?"));
        /* a ->exactly one a , a+ ->Atleast one a , a* ->zero or more a , a? ->Atmost one a . In regex cursor can move to n+1 index
         if we take a*(zero or more a) as an example 0 a, 1 ,2 aa , 4 ,5 aaa, 8 ,9
         1 index corresponds to b which indicates zero number of a's so zero no of a's is printed(m.group())
          i.e ntg is printed for m.group() in (1,4,5,8,9(n+1 index) indexes). 9th index is empty so it also indicates zero no of a's thats why it is printed*/
        helper(regexes, "abaabaaab");
    }

    public static void helper(List<String> regexes, String target) {
        for (String regex : regexes) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(target);
            System.out.println("regex:" + regex);
            while (m.find()) {
                System.out.println(m.start() + " " + m.group());
            }
        }
    }

    public static void patternClassSplitExample() {
        /* .splitting the target string according to a particular pattern
        . in below 2nd example if we give directly "." instead of "[.]" we will not get any output bcoz split means except that character remaining all are tokens
         but here in regex . means every character so except everycharacter means ntg will obtained as output. */
        Pattern p = Pattern.compile("\\s");
        String[] splittedStrings = p.split("Durga Software Solutions");
        Arrays.stream(splittedStrings).forEach(System.out::println);
        System.out.println("------------------");
        p = Pattern.compile("[.]"); // [.] can be replaced by "\\." also
        splittedStrings = p.split("www.durgasoft.com");
        Arrays.stream(splittedStrings).forEach(System.out::println);
    }

    public static void stringClassSplitExample() {
        /*  pattern class split method takes target string as argument --> pattern already available
        string class split method takes regex/pattern as argument -->   target string already available */
        String s = "Durga Software Solutions";
        String[] splittedStrings = s.split("\\s");
        Arrays.stream(splittedStrings).forEach(System.out::println);
    }

    public static void stringTokenizerExample() {
        // default regex is " "(space) for stringtokenizer
        StringTokenizer st = new StringTokenizer("Durga Software Solutions");
        helper2(st);
        st = new StringTokenizer("04-08-2021", "-");
        helper2(st);
    }

    public static void helper2(StringTokenizer st) {
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
    public static void phoneNumberApplication(){
        System.out.println(Pattern.matches("[7-9][0-9]{9}","9848022338")); // 10 digit numbers with first digit 7/8/9
        System.out.println(Pattern.matches("0?[789][0-9]{9}","09848022338")); // 10 or 11 digit numbers if 11 digit 1st digit should be zero
        System.out.println(Pattern.matches("0?[789][0-9]{9}","9848022338"));
        System.out.println(Pattern.matches("(0|91)?[7-9][0-9]{9}","919848022338")); /* 10 or 11 or 12 digit numbers if
        11 digit->first number should be zero ,if 12 digit then first 2 digits should be 91 */
    }
    public static void emailValidationApplication(){
        String emailRegex = "[a-zA-Z0-9][a-zA-z0-9._]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";
        System.out.println(Pattern.matches(emailRegex,"durga_ocjp.123@gmail.com"));
        System.out.println(Pattern.matches(emailRegex,"durga_ocjp.123@gmail.co.in"));
        String gmailRegex = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";
        System.out.println(Pattern.matches(gmailRegex,"nagasai.velpuri@gmail.com"));
    }
}
