public class Perro extends Animal{

    public Perro(int patas, boolean tieneCola, String tipoDePiel) {
        super(patas, tieneCola, tipoDePiel);
    }

    @Override
    public void imprimirEstadoDelAnimal() {
        System.out.println("ESTO ES UN PERRO");
        super.imprimirEstadoDelAnimal();
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo, pero si queres jugar despertame");
    }
}
