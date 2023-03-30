public abstract class Animal{

    //Atributos
    private int patas;
    private boolean tieneCola;
    private String tipoDePiel;

    //Constructor por defecto
    public Animal() {
        this.patas = 2;
        this.tieneCola = true;
        this.tipoDePiel = "Oscura";
    }

    // Constructor común
    public Animal(int patas, boolean tieneCola, String tipoDePiel) {
        this.patas = patas;
        this.tieneCola = tieneCola;
        this.tipoDePiel = tipoDePiel;
    }

    //Getters y Setters

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    //Comportamientos o métodos

    public void amputarUnaPata() {
        this.patas--;
    }


    public void amputarCola() {
        if(this.tieneCola) {
            this.tieneCola = false;
        }
    }

    public void imprimirEstadoDelAnimal() {
        System.out.println("ESTADO DEL ANIMAL: ");
        if(this.tieneCola) {
            System.out.println("- Tiene cola");
        } else {
            System.out.println("- No tiene cola");
        }
        System.out.println("- Cantidad de patas: " + this.patas);
        System.out.println("- Tipo de piel: " + this.tipoDePiel);
    }

    public abstract void dormir();

}
