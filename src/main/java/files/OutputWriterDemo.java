package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class OutputWriterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ALA", "OLA", "ADAM");
        //PrintWriter dekorator
        //FileWriter - konkretna klasa strumienia wyjsciowego skojarzonego z plikiem
        try(PrintWriter printer = new PrintWriter(new FileWriter("c:\\data\\names.txt"))) {
            for (String name:names){
                printer.println(names);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
