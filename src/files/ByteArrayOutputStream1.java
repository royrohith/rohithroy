package files;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream1 {    //to write common data to multiple files

    public static void main(String[] args) throws IOException {

        String s = "hello world";
        byte[] b=s.getBytes();

        FileOutputStream f1=new FileOutputStream("myfile.txt");
        FileOutputStream f2=new FileOutputStream("myfile2.txt");

        ByteArrayOutputStream ba=new ByteArrayOutputStream();
        ba.write(b);
        ba.writeTo(f1);
        ba.writeTo(f2);

    }
}
