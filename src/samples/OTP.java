package samples;

import java.util.Random;

public class OTP {
    public static void main(String[] args) {



            System.out.println("Generating random password...");
            System.out.println("New PAssword : ");

            String c="ABCDEFHIJKLMNOPQRSTUVWXYZ";
            String s="abcdefghijklmnopqrstuvwxyz";
            String n="012456789";

            String val=c+s+n;
            Random r=new Random();
            char[] password=new char[10];

            for(int i=0;i<10;i++){

                password[i]=val.charAt(r.nextInt(val.length()));
            }

            System.out.println(password);

        }
    }

