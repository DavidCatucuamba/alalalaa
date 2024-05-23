
public class Main {
    public static void main(String[] args) {
        //creo una instancia
        jugador n1=new jugador("Ariel",10);
        n1.imprimir();
        //creo un objeto para la clase hija
        delantero d1=new delantero("Leonel",10,"delantero","Messi");
        System.out.println("********Clase hija delantero********");
        d1.imprimir();
        d1.Anotar();
        //creo un objeto para la otra clase hija
        defensa juga=new defensa("Isaxx",10,"defensa","Naute","Vadrid","Ecuatoriano");
        juga.imprimir();
        juga.defender();

    }
}