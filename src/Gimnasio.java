public class Gimnasio {
    private String codigo;
    private String nombre;
    private Socio listaSocios[];
    private Sala listaSalas[];
    private int responsableId;

    private final int cantidad_Socios;
    private final int cantidad_Salas;

    public Gimnasio(String codigo, String nombre,int CantidadSocios, int cantidadSalas, int responsableId) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.cantidad_Socios = CantidadSocios;
        this.cantidad_Salas = cantidadSalas;

        this.responsableId = responsableId;

    }

    /**
     * Metodo para devolver una posicion libre
     * @return numero de la posicion libre si hay. Si no hay devuelve -1
     */
    private int devolverPosicionLibre(){
        int posicionLibre = -1;

        for (int i = 0; i < cantidad_Socios; i++) {
            if(listaSocios[i] == null){
                posicionLibre = i;
            }
        }
        return posicionLibre;
    }

    /**
     * Recorre el array de los socios y busca el que tenga numSocio igual al que se recibe.
     * @param numero
     * @return la posicion del socio si lo encuentra / - 1 en caso contrario.
     */
    private int buscarMiembroPorNumero(int numero){
        boolean seguirBuscando = true;
        int posicionSocio = -1;

        for (int i = 0; i < cantidad_Socios && seguirBuscando; i++) {
            if(listaSocios[i].getNumSocio() == numero){
                seguirBuscando = false;
                posicionSocio = i;
            }

        }
        return posicionSocio;
    }

    /**
     * Registramos a un socio en la primera posicion libre si hay y si no se repite el numero de socio.
     * @param s
     * @return true si se ha registrado el miembro / false en caso contrario.
     */
    private boolean resigtrarSocio(Socio s){
        boolean socioRegistrado = false;
        int posicionLibre = devolverPosicionLibre();
        int socioDuplicado = buscarMiembroPorNumero(s.getNumSocio());

        if(posicionLibre >= 0 && socioDuplicado >= 0){
                listaSocios[posicionLibre] = s;
                socioRegistrado = true;

        }

        return socioRegistrado;
    }

    /**
     *  Busca al miembro por su numero y se la asgina al socio para eliminarlo del array
     * @param numero
     * @return devuelve al socio eliminado / null si no lo ha encontrado
     */
    private Socio expulsarSocio(int numero){
        Socio socio = null;
        int posicionSocio;

        posicionSocio = buscarMiembroPorNumero(numero);

        if(posicionSocio >= 0){
            socio = listaSocios[posicionSocio];
        }

        return socio;
    }


}
