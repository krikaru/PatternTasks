package FactoryMethod.HardFactoryMethod;

public class CppTechLead extends CppDeveloper implements TechLead {

    @Override
    public void writeCode() {
        System.out.println("Cpp tech lead is writing a code...");
    }

    @Override
    public void doTechLeadsWork() {
        System.out.println("Cpp tech lead is working");
    }
}
