package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // throws : 메소드를 사용하는 곳에서 예외를 처리함
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "abc");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Default Exception");
            // 어떤 예외든 처리한다.(예외의 최상위 클래스이기 떄문)
        }
    }
}
