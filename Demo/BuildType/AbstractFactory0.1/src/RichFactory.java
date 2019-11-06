public class RichFactory implements IAbstractFactory {
    @Override
    public IFOOD createFood() {
        return new Beer();
    }

    @Override
    public ICar createCar() {
        return new Audi();
    }
}
