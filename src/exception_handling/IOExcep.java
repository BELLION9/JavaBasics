//Write a program that reads the first line of a file using throws IOException. Handle the missing file scenario.

package exception_handling;

import java.io.*;

public class IOExcep {
    public static String readFirstLine(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
 }}
    public static void main(String[] args) {
        try {
            String line = readFirstLine("data.txt");
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
}}}
