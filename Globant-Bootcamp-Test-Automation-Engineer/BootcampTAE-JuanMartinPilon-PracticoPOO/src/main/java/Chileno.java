public class Chileno extends Persona{

    private String dni;
    private String region;
    private String comuna;

    public Chileno(){
    }

    public void setDni(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return dni;
    }
    public void setRegion(String Region){
        this.region = region;
    }
    public String getRegion(){
        return region;
    }
    public void setComuna(String comuna){
        this.comuna = comuna;
    }
    public String getComuna(){
        return comuna;
    }

}
