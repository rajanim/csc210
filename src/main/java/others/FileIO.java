package others;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by rajanishivarajmaski1 on 4/16/17.
 */
public class FileIO {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));

        for (int i = 0; i < 5; i++) {
            pw.write(scanner.nextLine()+ "\n");
        }

        pw.close();


    }
}
