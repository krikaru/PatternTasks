package FactoryMethod.HardFactoryMethod;

public class CppQAEngineer extends CppDeveloper implements QAEngineer {

    @Override
    public void writeCode() {
        System.out.println("Cpp QA is writing a code...");
    }

    @Override
    public void doQAsWork() {
        System.out.println("Cpp QA engineer is working");
    }
}
