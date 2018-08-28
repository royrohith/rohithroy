package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BufferedReader22 {

    public static void main(String[] args) throws IOException {

        System.out.println("Input a line");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String line=br.readLine();
        System.out.println(line);



    }
}
