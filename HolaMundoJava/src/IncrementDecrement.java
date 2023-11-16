public class IncrementDecrement {
    public static void main(String[] args) {
        int lives =5;
        lives = lives -1;
        System.out.println(lives);//4
    //Decremento
        lives--;
        System.out.println(lives);//3
    //Incremento
        lives++;
        System.out.println(lives);//4

        // Prefija
        int gift = 100 + lives++;
        System.out.println(gift);
        System.out.println(lives);
        //Gana regalo por ganar vida
        //Postfijo
         gift = 100 + ++lives;
        System.out.println(gift);
        System.out.println(lives);

    }
}
