public class PoorFactory implements IAbstractFactory {
    @Override
    public IFOOD createFood() {
        return new Water();
    }

    @Override
    public ICar createCar() {
        return new Byd();
    }
}
