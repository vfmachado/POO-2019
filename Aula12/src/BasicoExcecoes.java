import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicoExcecoes {

	public static void main(String[] args) {
		
		System.out.println("Comecei bem ...");
		//SE EU N�O SEI SE DEVO TRATAR... TRATO!
		Scanner in = new Scanner(System.in);
		//bloco para lidar com exce��es em java!
		try { //tenta..
			System.out.println("Informe dois valores");
			int a = in.nextInt();
			int b = in.nextInt();
			
			int resultado = a / b;
			System.out.println("O resultado foi: " + resultado);
			
		} catch (ArithmeticException e) { //caso n�o consiga... executa isto!
			//e.printStackTrace();
			System.out.println("Voc� n�o pode dividir por zero!");
		} catch (InputMismatchException e) {
			System.out.println("Eii... eu pedi dois n�meros inteiros!");
		}
		
		
		System.out.println("Terminei melhor ainda...");
	}

}
