package regulatExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String text = "Hello Guys! I send you my email sasha@gmail.com so we can\n" +
                "keep in touch. Thanks Joe, thats cool! I'm sending you my adress:\n" +
                "ti@yandex.ru. Let;s stay in touch.";

        //It's a factory method. Pattern is a private constructor. Impossible to create instance.
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println("Found email: " + matcher.group());
            System.out.println("Found name_email: " + matcher.group(1));
            System.out.println("Found site_email: " + matcher.group(2));
        }
    }
}
