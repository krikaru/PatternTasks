package FactoryMethod.SimpleFactoryMethod;

public class PrinterFactory {
    public static Printer setPrinterByName(String printerName){
        if (printerName.equals("matrix")){
            return new MatrixPrinter();
        }else if (printerName.equals("jet")){
            return new JetPrinter();
        } else {
            throw new RuntimeException(printerName + " isn't exist");
        }
    }
}
