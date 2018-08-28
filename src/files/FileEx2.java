package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx2 {

    public static void main(String[] args) throws IOException {


        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();

        FileReader fin=new FileReader("second.txt");
        //System.out.println((char)fin.read());
        int ch=0;
        while ((ch=fin.read())!=-1)
        {
            System.out.print((char)ch);
        }
    }

}
