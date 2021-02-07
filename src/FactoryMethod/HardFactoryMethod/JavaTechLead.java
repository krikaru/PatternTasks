package FactoryMethod.HardFactoryMethod;

public class JavaTechLead extends JavaDeveloper implements TechLead {

    @Override
    public void writeCode() {
        System.out.println("Java tech lead is writing a code...");
    }

    @Override
    public void doTechLeadsWork() {
        System.out.println("Java tech lead is working");
    }
}
