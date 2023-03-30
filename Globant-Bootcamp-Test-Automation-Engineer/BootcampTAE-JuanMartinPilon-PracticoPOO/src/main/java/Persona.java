public class Persona implements SerVivo{

    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    public Persona(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return edad;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return sexo;
    }


    public void cumpleaños(int edad){
        this.edad++;
        System.out.println("Feliz Cumpleaños!");
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
