import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
	
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader texto = new BufferedReader(new FileReader(new File("datos.txt")));
		String expresion =  texto.readLine();
		Calculadora calc = new Calculadora();
		System.out.println(calc.operar(expresion));
		
		// TODO Auto-generated method stub
		

	}

}
