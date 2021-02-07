package FactoryMethod.HardFactoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public JavaDeveloper getDeveloper(String concreteDeveloper) {
        switch (concreteDeveloper) {
            case "dev":
                return new JavaDeveloper();
            case "QA":
                return new JavaQAEngineer();
            case "TL":
                return new JavaTechLead();
            default:
                throw new RuntimeException(concreteDeveloper + " isn't exist");
        }
    }
}
