public class Funtions {
    public static void main(String[] args) {
        double y =3;
        //Area de un circulo
        //pi *r2

        System.out.println(circleArea(y));


        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y)) ;
        System.out.println(4*Math.PI * Math.pow(y,2)) ;


        //Volumen de una esfera
        //4/3 * PI * r3
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS a Dolares: " +coverToDolar(200,"MXN"));

    }

    /**
     * Funtion: funcion que especificando su valor de radio cacula el area de un circulo
     * @param r Valor de radio
     * @return Math.PI*Math.pow(r,2) Devuelve el area del circulo.
     * */


    public static double circleArea(double r){

        return Math.PI*Math.pow(r,2);
    }

    /**
     * Funtion: funcion que especificando su valor de radio cacula el area de una Esfera
     * @param r Valor de radio
     * @return 4*(Math.PI * Math.pow(r,2)) Devuelve el area de una esfera.
     * */
    public static double sphereArea(double r){
        return 4*(Math.PI * Math.pow(r,2));
    }

    /**
     * Funtion: funcion que especificando su valor de radio cacula el volumen de una Esfera
     * @param r Valor de radio
     * @return (4/3)*Math.PI * Math.pow(r,3) Devuelve el volumen de una esfera.
     * */
    public static double sphereVolumen(double r){
        return (4/3)*Math.PI * Math.pow(r,3);
    }

    /**
     * Description: Funcion que especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity cantidad de dinero
     * @param currency Tipo de moneda: Solo esta habilitado para MXN y COP.
     * @return quantity Devuelve la cantidad actualizada en Dolares.
     * */
    public static double coverToDolar(double quantity , String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
