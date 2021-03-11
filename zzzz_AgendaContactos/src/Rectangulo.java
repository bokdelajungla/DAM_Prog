public class Rectangulo {

         public static String descripcion = "Figura de 4 lados";

         private int ancho;

         private int alto;

         public Rectangulo(int ancho, int alto) {

                       this.ancho = ancho;

                       this.alto = alto;

         }

         public String ver() {

                       return "Rectangulo de " + ancho + " x " + alto;

         }

}