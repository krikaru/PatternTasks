package AbstractFactory;

public class ClassicFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    public Table getTable() {
        return new ClassicTable();
    }

    @Override
    public Chair getChair() {
        return new ClassicChair();
    }
}
