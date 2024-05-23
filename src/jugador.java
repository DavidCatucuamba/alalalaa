
//Ariel Catucuamba
public class jugador {
    //Atributos
    String nombre;
    int numero;
    //metodo constructor
    public jugador(String nombre,int numero){
        this.nombre=nombre;
        this.numero=numero;
    }
    //metodo imprimir
    public void imprimir(){
        System.out.println("El nombre del jugador es: "+nombre);
        System.out.println("Su dorsal es: "+numero);
        System.out.println("esTO AGREGAREEEEEE");
    }

}

//creo la primera clase hija
class delantero extends jugador {
    String posicion;
    String apellido;

    //metodoconstructor
    public delantero(String nombre, int numero, String posicion, String apellido) {
        super(nombre, numero);
        this.posicion = posicion;
        this.apellido = apellido;

    }

    public void Anotar() {
        System.out.println(nombre + " " + apellido + "que juega en la posicion de: " + posicion +
                "anoto un golazo estratosferico!!!!!!!");
    }
}
//creo la segunda clase hija
class defensa extends jugador{ //Atributos
    String posicion;
    String apellido;
    String equipo;
    String nacionalidad;

    //metodo constructor
    public defensa(String nombre,int numero,String posicion,String apellido,String equipo,String nacionalidad){
        super(nombre, numero);
        this.posicion=posicion;
        this.apellido=apellido;
        this.equipo=equipo;
        this.nacionalidad=nacionalidad;

    }
    public void defender(){
        System.out.println(nombre+" "+apellido+"el numero "+numero+
                " del "+equipo+" es un crack el "+nacionalidad);
    }

}



