import java.util.Scanner;
public class calculadoraScanner {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1 , num2 , resultado ;
        System.out.println("Dame el primer valor para la suma");
        num1 = entrada.nextInt();
        System.out.println("Dame el segundo valor");
        num2 = entrada.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es " +  resultado);
        
        System.out.println("Dame el primer valor para la resta");
        num1 = entrada.nextInt();
        System.out.println("Dame el segundo valor para la resta");
        num2 = entrada.nextInt();
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es " +  resultado);
        
        System.out.println("Dame el primer valor para la multiplicacion");
        num1 = entrada.nextInt();
        System.out.println("Dame el segundo valor para la multiplicacion");
        num2 = entrada.nextInt();
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es " +  resultado);
        
        System.out.println("Dame el primer valor para la division");
        num1 = entrada.nextInt();
        System.out.println("Dame el segundo valor para la division");
        num2 = entrada.nextInt();
        resultado = num1 / num2;
        System.out.println("El resultado de la division es " +  resultado);
    }
}
