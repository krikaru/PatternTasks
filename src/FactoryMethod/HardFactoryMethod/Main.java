package FactoryMethod.HardFactoryMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = getDeveloperFactoryByName("cpp");
        Developer developer = factory.getDeveloper("QA");

        doSpecificWork(developer);
    }

    public static void doSpecificWork(Developer developer){
        if (developer.getClass() == JavaDeveloper.class){
            developer.writeCode();
        }else if (developer instanceof TechLead){
            developer.writeCode();
            TechLead TL = (TechLead) developer;
            TL.doTechLeadsWork();
        }else if (developer instanceof QAEngineer){
            developer.writeCode();
            QAEngineer QA = (QAEngineer) developer;
            QA.doQAsWork();
        }
    }

    public static DeveloperFactory getDeveloperFactoryByName(String factoryName){
        if (factoryName.equals("cpp")){
            return new CppDeveloperFactory();
        } else if (factoryName.equals("java")){
            return new JavaDeveloperFactory();
        } else {
            throw new RuntimeException(factoryName + " isn't exist");
        }
    }
}
