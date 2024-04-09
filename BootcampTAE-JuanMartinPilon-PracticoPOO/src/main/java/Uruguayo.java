import java.util.Scanner;

public class Uruguayo extends Persona{

    private String ci;
    private String departamento;
    private String barrio;


    public Uruguayo(){
    }

    public void setCi(String ci){
        this.ci = ci;
    }
    public String getCi(){
        return ci;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setBarrio(String barrio){
        this.barrio = barrio;
    }
    public String getBarrio(){
        return barrio;
    }

    public void imprimirInfo(){
        System.out.println("- CI: " + this.ci);
        System.out.println("- Departamento: " + this.departamento);
        System.out.println("- Barrio: " + this.barrio);
    }

    public void mudarse(String departamento,String barrio){
        String nuevoDep,nuevoBarrio;
        Scanner sc = new Scanner(System.in);
        nuevoDep = sc.nextLine();
        nuevoBarrio = sc.nextLine();
        this.departamento = nuevoDep;
        this.barrio = nuevoBarrio;
    }

}
