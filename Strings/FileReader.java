/**
 * Program to read and print the contents of a file
 */
package Strings;

import java.io.*;
import java.util.*;

public class FileReader {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name with extension: ");
        File file = new File(sc.nextLine());
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
