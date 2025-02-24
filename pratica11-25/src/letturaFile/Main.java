package letturaFile;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}