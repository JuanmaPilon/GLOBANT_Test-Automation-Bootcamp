public class Main {

    public static void main(String[] args) {

        Uruguayo personaUru = new Uruguayo();
        Chileno personaChi = new Chileno();
        Chileno personaChi2 = new Chileno();
        Perro perrito = new Perro();

        personaUru.setCi("4692663-6");
        personaUru.setSexo('M');
        personaUru.setEdad(27);
        personaUru.setNombre("Juanma");
        personaUru.setApellido("Pilon");
        personaUru.setDepartamento("Maldonado");
        personaUru.setBarrio("Centro");

        personaChi.setDni("6326889-5");
        personaChi.setSexo('F');
        personaChi.setEdad(29);
        personaChi.setNombre("Caro");
        personaChi.setApellido("Vejar");
        personaChi.setComuna("Concepcion");
        personaChi.setRegion("BioBio");

        perrito.setNombre("Pocho");
        perrito.setSexo('M');
        perrito.setRaza("Delacalle");
        perrito.setEdad(12);

        personaChi2.setDni("3478729-2");
        personaChi2.setSexo('M');
        personaChi2.setEdad(12);
        personaChi2.setNombre("Mengano");
        personaChi2.setApellido("Dequien");
        personaChi2.setComuna("SantiagoDeChile");
        personaChi2.setRegion("Centro");

        System.out.println(perrito.esAdulto(5));
        System.out.println(personaChi2.esAdulto(80));
    }
    public static boolean soyUruguayoOChileno(Persona persona) {
        return (persona instanceof Uruguayo) || (persona instanceof Chileno);
    }

}
