public class DataType {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678903L;
        double nD = 123.334667;
        float nF = 123.3456F;
    //java 10
        var salary = 1000;
        //pension 3%
        var pension = salary*0.03; //double
        System.out.println(salary);
        System.out.println(pension);
        var totalSalary = salary -pension;
        System.out.println(totalSalary);

        var employeedName= "Karina Jimenez";
        System.out.println("EMPLOYEE: " +employeedName + " SALARY: " +totalSalary);
    }
}
