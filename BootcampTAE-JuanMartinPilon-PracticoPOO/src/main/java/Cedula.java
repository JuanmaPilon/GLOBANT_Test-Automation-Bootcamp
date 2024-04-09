public class Cedula {

    private int numero;
    private int digitoVerificador;

    public Cedula(int numero, int digitoVerificador){
        this.setNumero(String.valueOf(numero));
        this.setDigitoVerificador(digitoVerificador);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = Integer.parseInt(numero);
    }
    public int getDigitoVerificador() {
        return digitoVerificador;
    }
    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

}
