public class Socio {
    private final int numSocio;     // Numero de socios
    private String nombre;  // Nombre del Socio


    public Socio() {
         numSocio = 10; // declaro el numero de socios a 10

    }

    public Socio(int numSocio, String nombre) {
        this.numSocio = numSocio;
        this.nombre = nombre;
    }


    public int getNumSocio(){
        return numSocio;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "[ " + numSocio + " ] "+nombre;
    }
}




