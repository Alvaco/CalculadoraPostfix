import java.util.ArrayList;


public class Main <E> implements iCalculadora, iPila{

	

	private String expresion;

	private ArrayList operacion;

	

	public Main(String expresion){
	this.expresion = expresion;	

	}
	
	public int evaluar(){
		operacion = new ArrayList();
		for (int i=0; i<expresion.length(); i++) {
			switch(expresion.charAt(i)){
			case '0': operacion.add(0);
				break;
			case '1': operacion.add(1);
				break;
			case '2': operacion.add(2);
				break;
			case '3': operacion.add(3);
				break;
			case '4': operacion.add(4);
				break;
			case '5': operacion.add(5);
				break;
			case '6': operacion.add(6);
				break;
			case '7': operacion.add(7);
				break;
			case '8': operacion.add(8);
				break;
			case '9' : operacion.add(9);
				break;
			case '+':{
				int x = (int) pop();
				int y = (int) pop();
				int resultado = suma(x, y);
				push(resultado);
				break;
			}
			case '-':{
				int x = (int) pop();
				int y = (int) pop();
				int resultado = resta(x, y);
				push(resultado);
				break;
			}
			case '*':{
				int x = (int) pop();
				int y = (int) pop();
				int resultado = multiplicacion(x, y);
				push(resultado);
				break;
			}
			case '/':{
				int x = (int) pop();
				int y = (int) pop();
				int resultado = division(x, y);
				push(resultado);
				break;
			}
			}
		}
		return (int) pop();
	}

	



	@Override
	public E pop() {
		return (E) operacion.remove(0);
		

	}



	@Override

	public boolean isEmpty() {

		return false;

	}



	@Override

	public int suma(int a, int b) {

		return a + b;

	}



	@Override

	public int resta(int a, int b) {

		return a - b;

	}



	@Override

	public int multiplicacion(int a, int b) {

		return a * b;

	}



	@Override

	public int division(int a, int b) {

		return a / b;

	}





	@Override

	public void push(Object algo) {
		 operacion.add(algo);
		// TODO Auto-generated method stub

		

	}



}




