package test;

public class Charcount
{
    static void count (String str)
    {
        int i=0;
        String s="";

        char[] ch=str.toCharArray();
        for(i=0;i<ch.length;i++);
        {
            while (i< ch.length && ch[i] != ' ') {
                s = s + ch[i];
                i++;
            }
            if (s.length() > 0)
                System.out.println(s + "->" + s.length());
        }
    }

    public static void main(String[] args) {
        String str="HELLO WORLD";
        count (str);
    }



}