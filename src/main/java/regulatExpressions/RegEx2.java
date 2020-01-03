package regulatExpressions;

import java.util.Arrays;

public class RegEx2 {
    public static void main(String[] args) {

        String a = "Hello.World.Of.Java";
        String[] words = a.split("\\.");
        System.out.println(Arrays.toString(words));


        String b = "1231123123Hello123123World1312312312Of576576Java";
        String[] wordss = b.split("\\d+");
        System.out.println(Arrays.toString(wordss));

        String c = "Hello123123There1313123Mister";
        System.out.println(c.replaceAll("\\d+", "-"));
        System.out.println(c.replaceFirst("\\d+", "-"));



    }
}
