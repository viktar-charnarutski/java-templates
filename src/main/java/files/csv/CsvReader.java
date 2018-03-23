package files.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    private final static String SPLITTER = ",";
    private final static String FILE_PATH = "/Users/viktar_charnarutski/Projects/Education/java-templates/src/main/resources/files/countries.csv";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] country = line.split(SPLITTER);
                System.out.println(String.format("Country[Code=%s, Name=%s]", country[4], country[5]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}