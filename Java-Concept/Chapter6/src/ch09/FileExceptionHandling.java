package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally { // try가 호출되면 finally도 같이 호출된다.
            if(fis!=null)
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
