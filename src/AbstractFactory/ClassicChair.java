package AbstractFactory;

public class ClassicChair extends Chair {
    private final String describe = "Classic chair";
    @Override
    public String getDescribe() {
        return describe;
    }
}
