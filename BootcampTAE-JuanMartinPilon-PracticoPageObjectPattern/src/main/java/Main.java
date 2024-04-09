public class Main {
    
    public static final int[] ULTIMOS_5_EJERCICIOS = new int[5];

    public static void main(String[] args) {
        Perro sanBernardo = new Perro(4, true, "Peludo");
        sanBernardo.dormir();
    }

    public void ejercicio1() {
        guardarEjercicio(1);
    }

    public void ejercicio2() {
        guardarEjercicio(2);
    }


    public void guardarEjercicio(int numeroEjercicio) {
        //Aca debería haber una logica el cual guarde el numeroEjercicio en la primer posición vacía del arreglo
        ULTIMOS_5_EJERCICIOS[0] = 1;
    }


}
