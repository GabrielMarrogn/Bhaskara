import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double r1 = 0;
        double r2= 0;

        double calculo = Math.pow(b,2) - 4 * a * c;

        if(calculo < 0 || a == 0.0){
            System.out.println("Impossivel calcular");
        }else{
            r1 = (-b +Math.sqrt(calculo))/(2*a);
            r2 = (-b -Math.sqrt(calculo))/(2*a);
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }
    }
}
