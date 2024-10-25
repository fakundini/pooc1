package poo1;

public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("andrea", "alvarez", true, 2005, 52645341);
        Persona persona2 = new Persona("Bruno", "Barro", true, 2005, 52645341);
        System.out.println("soy un objeto " + persona1.getNombre()+" "+persona1.getApellido());
        System.out.println("soy un objeto " + persona2.getNombre()+" "+persona2.getApellido());
        System.out.println("hola mundo");
    }

}
