package collection;

import java.util.regex.Pattern;

public class RegexEx1 {

    public static void main(String[] args) {

        String s="AAaa7";


        //System.out.println(Pattern.matches("[a-z]+[@][a-z]{5}[.][c][o][m]","aaaa@gmail.com"));

        //System.out.println(Pattern.matches("[[a-z]+[A-Z]{1}[0-9]]{1}","aaaAB9"));

        //System.out.println(Pattern.matches("[+][9][1][0-9]{10}","+91234567876"));
        if (Pattern.matches("[a-zA-Z0-9]{5}",s))
        {
            System.out.println(Pattern.matches("[A-Z0-9]{1,}",s));
        }
    }


}
