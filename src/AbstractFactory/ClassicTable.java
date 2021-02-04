package AbstractFactory;

public class ClassicTable extends Table {
    private final String describe = "Classic table";

    @Override
    public String getDescribe() {
        return describe;
    }
}
