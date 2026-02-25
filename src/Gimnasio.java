public class Gimnasio {
    private String codigo;
    private String nombre;
    private Socio socios[];
    private Sala salas[];
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
            if(socios[i] == null){
                posicionLibre = i;
            }
        }
        return posicionLibre;
    }

    private boolean resigtrarSocio(Socio s){
        boolean socioRegistrado = false;
        int posicionLibre = devolverPosicionLibre();

        for (int i = 0; i < cantidad_Socios && !socioRegistrado; i++) {
            if(posicionLibre >= 0 && s.getNumSocio() != socios[i].getNumSocio()){
                socios[i] = s;
                socioRegistrado = true;

            }
        }
        return socioRegistrado;
    }
}
