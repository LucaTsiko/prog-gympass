public class Gimnasio {
    private String codigo;
    private String nombre;
    private Socio socios[];
    private Sala salas[];
    private int responsableId;

    private final int Cantidad_Socios;
    private final int Cantidad_Salas;

    public Gimnasio(String codigo, String nombre,int CantidadSocios, int cantidadSalas, int responsableId) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.Cantidad_Socios = CantidadSocios;
        this.Cantidad_Salas = cantidadSalas;

        this.responsableId = responsableId;

    }
}
