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
     * @return true si encuentra al miembro / false en caso contrario.
     */
    private boolean buscarMiembroPorNumero(int numero){
        boolean seguirBuscando = true;
        boolean miembroBuscado = false;

        for (int i = 0; i < cantidad_Socios && seguirBuscando; i++) {
            if(listaSocios[i].getNumSocio() == numero){
                seguirBuscando = false;
                miembroBuscado = true;
            }

        }
        return miembroBuscado;
    }

    /**
     * Registramos a un socio en la primera posicion libre si hay y si no se repite el numero de socio.
     * @param s
     * @return true si se ha registrado el miembro / false en caso contrario.
     */
    private boolean resigtrarSocio(Socio s){
        boolean socioRegistrado = false;
        int posicionLibre = devolverPosicionLibre();
        boolean socioDuplicado = buscarMiembroPorNumero(s.getNumSocio());

        if(posicionLibre >= 0 && !socioDuplicado){
                listaSocios[posicionLibre] = s;
                socioRegistrado = true;

        }

        return socioRegistrado;
    }


    /**
    private Socio expulsarSocio(int numero){
        Socio socio;
        boolean socioExpulsado = false;

        if(buscarMiembroPorNumero(numero)){

        }
    }
        /*
        for (int i = 0; i < cantidad_Socios && !socioExpulsado; i++) {
            if(socios[i].getNumSocio() == numero){
                socios[i] = null;
                socioExpulsado = true;
            }
        }
        return
    }

         */

}
