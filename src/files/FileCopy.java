package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        FileWriter fout=new FileWriter("copy.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("copy.txt");
        int ch=0;
        FileWriter fout1=new FileWriter("paste.txt");
        while ((ch=fin.read())!=-1)
        {
            fout1.write(ch);

        }
        fout1.close();
        FileReader fin1=new FileReader("paste.txt");
        int c=0;
        while ((c=fin1.read())!=-1)
        {
            System.out.print((char)c);
        }

    }


}
