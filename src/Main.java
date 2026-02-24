public class Main {
    public static void main(String[] args) {
    //    StringBuilder sb;
        Gimnasio miGym;
        Gimnasio uaxGym;
        int  UAXGYM_SOCIOS;
        int UAXGYM_SALAS;

        Socio socio1 = new Socio(1,"Luca");
        Socio socio2 = new Socio(2,"Victor");

        Sala sala1 = new Sala(1,"Aquí es donde van los fuertes y ganadores del hackathon");
        Sala sala2 = new Sala(2,"Sala solo accesible para los flacos");

        miGym = new Gimnasio("1","JavaGym", 30,2);
        uaxGym = new Gimnasio("1","JavaGym", 30,2);

        /*
        sb = new StringBuilder();

        sb.append(socio1.toString());

         */

        System.out.println(socio1.toString());
        System.out.println(socio2.toString());

        System.out.println(sala1.toString());
        System.out.println(sala2.toString());

        System.out.println(miGym.toString());
    }
}