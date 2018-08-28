package collection;

import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {


        System.out.println(Pattern.matches("..b","abc"));
        System.out.println(Pattern.matches("[^abc]","z"));
        System.out.println(Pattern.matches("[a-zA-Z]","z"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d[m-p]]","b"));

    }

}
