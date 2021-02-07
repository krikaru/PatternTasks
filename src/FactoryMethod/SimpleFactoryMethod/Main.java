package FactoryMethod.SimpleFactoryMethod;

public class Main {
    public static void main(String[] args) {
        Printer printer = PrinterFactory.setPrinterByName("jet");
        printer.print();
    }
}
