public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable){
            //send file
            fileSended++;
            System.out.println("Archivo Enviado");

        }else {
            System.out.println("Porfavor enciende el bloutooth ");
        }
    }
}
