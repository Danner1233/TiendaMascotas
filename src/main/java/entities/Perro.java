package entities;

public class Perro extends Pet implements IEats {

    @Override
    public void eats() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }

    public Perro(String type) {
        super(type);
        // TODO Auto-generated constructor stub
    }
}
