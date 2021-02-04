package AbstractFactory;

public class ModernFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Chair getChair() {
        return new ModernChair();
    }
}
