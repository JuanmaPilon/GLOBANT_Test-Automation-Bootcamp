public class Perro implements SerVivo{

    public Perro(){
    }

    private String nombre;
    private String raza;
    private int edad;
    private char sexo;

    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public void cumpleaños() {
    this.edad++;
    }

    @Override
    public boolean esAdulto(int edad) {
        return this.getEdad() >= edad;
    }
}
