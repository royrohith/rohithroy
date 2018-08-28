package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class file_collection {
    int id;
    String name;
    int marks;

    public file_collection(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("filesample.txt"));
        String s;
        ArrayList<file_collection> list = new ArrayList<>();
        while ((s = br.readLine())!=null) {

            String a[]=s.split(",");
            list.add(new file_collection (Integer.parseInt(a[0]),a[1],Integer.parseInt(a[2])));

        }

        for (file_collection o:list) {

            System.out.println("id : "+o.id+" name : "+o.name+" marks : "+o.marks);

        }
    }

}
