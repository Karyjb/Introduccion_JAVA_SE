public class LogicOperation {
    public static void main(String[] args) {
        int a =8;
        int b =5;

        //Operadores de asignación
        System.out.println("  a es igual b: " +(a==b));
        System.out.println(" a es diferente a b: " + (a!=b));

        //Operadores relacionales
        System.out.println("  a es mayor b: " +(a>b));
        System.out.println("  a es menor b: " +(a<b));
        System.out.println("  a es mayor o igual a b: " +(a>=b));
        System.out.println("  a es menor o igual a b: " +(a<=b));

        if (a==b){
            System.out.println("  a es igual b ");
        }else if (a!=b){
            System.out.println(" a es diferente a b");
        } else if(a>b){
            System.out.println("  a es mayor b ");
        }else if(a<b){
            System.out.println("  a es mayor o igual a b");
        }else if(a<=b){
            System.out.println("  a es menor o igual a b ");
        }
    }
}
