public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //El valor mayor
        System.out.println(Math.max(x,y));

        //Devuelve Raiz Cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //pi *r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4*PI*r2
        System.out.println(4*(Math.PI * Math.pow(y,2))) ;
        System.out.println(4*Math.PI * Math.pow(y,2)) ;


        //Volumen de una esfera
        //4/3 * PI * r3
        System.out.println((4/3)*Math.PI * Math.pow(y,3));
    }
}
