import java.util.ArrayList;


public class Main implements iCalculadora, iPila{
	
	private String expresion;
	private ArrayList operacion;
	
	public Main(){
	}
	

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}

}

