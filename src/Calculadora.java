


public class Calculadora implements iCalculadora{

	

	private Pila <Double> operacion;
	

	/**
	 * Constructor
	 */
	public Calculadora(){
		operacion = new Pila<Double>();	
	}
	
	/** 
	 * @param String. Es una línea de texto con los números y las operaciones a realizar
	 * Devuelve el resultado en forma double
	 */
	public double operar(String n){
		
		for (int i=0; i<n.length(); i++) {
			switch(n.charAt(i)){
			case '0': operacion.push(0.0);
				break;
			case '1': operacion.push(1.0);
				break;
			case '2': operacion.push(2.0);
				break;
			case '3': operacion.push(3.0);
				break;
			case '4': operacion.push(4.0);
				break;
			case '5': operacion.push(5.0);
				break;
			case '6': operacion.push(6.0);
				break;
			case '7': operacion.push(7.0);
				break;
			case '8': operacion.push(8.0);
				break;
			case '9' : operacion.push(9.0);
				break;
			case '+':{
				double x = (double) operacion.pop();
				double y = (double) operacion.pop();
				double resultado = suma(x, y);
				operacion.push(resultado);
				break;
			}
			case '-':{
				double x = (double)operacion.pop();
				double y = (double)operacion.pop();
				double resultado = resta(x, y);
				operacion.push(resultado);
				break;
			}
			case '*':{
				double x = (double)operacion.pop();
				double y = (double)operacion.pop();
				double resultado = multiplicacion(x, y);
				operacion.push(resultado);
				break;
			}
			case '/':{
				double x = (double)operacion.pop();
				double y = (double)operacion.pop();
				double resultado = division(x, y);
				operacion.push(resultado);
				break;
			}
			}
		}
		return (double)operacion.pop();
	}




	




	
	@Override
	/* 
	 * Implementa el método suma de iCalculadora
	 * @param double a, b. Números a operar
	 */
	public double suma(double a, double b) {

		return a + b;

	}



	@Override
	/* 
	 * Implementa el método resta de iCalculadora
	 * @param double a, b. Números a operar
	 */
	public double resta(double a, double b) {

		return a - b;

	}



	@Override
	/* 
	 * Implementa el método multiplicación de iCalculadora
	 * @param double a, b. Números a operar
	 */
	public double multiplicacion(double a, double b) {

		return a * b;

	}



	@Override
	/* 
	 * Implementa el método division de iCalculadora
	 * @param double a, b. Números a operar
	 */
	public double division(double a, double b) {

		return a / b;

	}







}

