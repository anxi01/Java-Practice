package ch06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder)printer.getMaterial();
    }
}
