package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class File2List {

    public static void main(String[] args) throws IOException {

        FileWriter fout=new FileWriter("list.txt");
        fout.write("hello world");
        fout.close();

        BufferedReader reader=new BufferedReader(new FileReader("list.txt"));
        String line=reader.readLine();
        String[] newline=line.split(" ");
        ArrayList<String> al=new ArrayList<>();
        for (String obj:newline)
        {
            al.add(obj);
            System.out.println(obj);
        }


    }


}