package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

    public static void main(String[] args) throws IOException {

        FileOutputStream fout=new FileOutputStream("first.txt");

        //fout.write(100);

        String s="ABC";
        byte[] b=s.getBytes();
        fout.write(b);

        fout.close();

        FileInputStream fin=new FileInputStream("first.txt");


        int tmp=0;
        while ((tmp=fin.read())!=-1)
        {
            System.out.print((char)tmp);
        }



    }



}
