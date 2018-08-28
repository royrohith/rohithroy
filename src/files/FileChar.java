package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileChar {

    public static void main(String[] args) throws IOException {

        FileWriter fout=new FileWriter("input.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("input.txt");
        int ch=0;
        String line = null;
        String[] a;
        char c;
        char[] array=new char[10];
        int i=0,k=0;
        ArrayList<Character> al=new ArrayList<Character>();
        while ((ch=fin.read())!=-1)
        {
            c=(char)ch;
            if (c!=' ')
            {
                array[i]=c;
                i++;
            }
            else
            {
                for (i=k;i<array.length;i++)
                {
                    al.add(array[i]);
                }
                k=i;
            }

        }
        for (Character obj:al)
        {
            System.out.println(obj);
        }



    }



}
