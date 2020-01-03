package regulatExpressions;

public class RegularExpressions {

    public static void main(String[] args) {

        /*
            \\d -> one integer
            \\w -> one english letter
            + -> one or more
            * -> zero or more
            ? -> one or more symbols behind

            ( | | ) -> one string from the collection

            [abc] == (a|b|c)
            [a-zA-z] - all English letters
            [0-9] == \\d
            [^abc] -> all symbols except the...

            . - any symbol

            {2} -> 2 symbols behind (\\d{2})
            {2, } -> at least 2 symbols behind (\\d{2, })
            {2, 4} -> 2-4 symbols behind (\\d{2, 4})
         */

        String a = "-52423423";
        String b = "52423423";
        String c = "+52423423";
        System.out.println(a.matches("-?\\d*"));
        System.out.println(b.matches("-?\\d*"));
        System.out.println(c.matches("(\\+|-)?\\d*"));

        String d = "d1231233";
        System.out.println(d.matches("[a-zA-z]\\d*"));


        String e = "dasdasd1231233";
        System.out.println(e.matches("[a-zA-z]*\\d*"));


        String f = "dasdsadasda12312122357645RRREREdasd1231233";
        System.out.println(f.matches("[a-zA-z0-9]*\\d*"));

        String g = "hello";
        System.out.println(g.matches("[^a-c]*"));

        String url = "https://www.google.com";
        String url2 = "http://www.google.ru";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("(http|https)://www\\..+\\.(com|ru)"));

        String h = "12345";
        System.out.println(h.matches("\\d{2,}"));



    }

}
