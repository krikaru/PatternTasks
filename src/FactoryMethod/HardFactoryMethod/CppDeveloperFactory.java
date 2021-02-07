package FactoryMethod.HardFactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public CppDeveloper getDeveloper(String concreteDeveloper) {
        switch (concreteDeveloper) {
            case "dev":
                return new CppDeveloper();
            case "QA":
                return new CppQAEngineer();
            case "TL":
                return new CppTechLead();
            default:
                throw new RuntimeException(concreteDeveloper + " isn't exist");
        }
    }
}
