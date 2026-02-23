public class Socio {
    private final int numSocio;
    private String nombre;


    public Socio() {
         numSocio = 10;
    }


    public int getNumeroSocio(){
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




