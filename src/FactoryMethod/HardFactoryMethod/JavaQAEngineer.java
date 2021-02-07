package FactoryMethod.HardFactoryMethod;

public class JavaQAEngineer extends JavaDeveloper implements QAEngineer {

    @Override
    public void writeCode() {
        System.out.println("Java QA is writing a code...");
    }

    @Override
    public void doQAsWork() {
        System.out.println("Java QA engineer is working");
    }
}
