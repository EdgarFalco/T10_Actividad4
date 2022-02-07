package objetos;

import javax.swing.JOptionPane;

public class Operacion {
	
	//Metodo s'encargara de la suma de dos numeros
	public static void suma() {
		double num1;
		double num2;
		double resultado;
		num1 = Interfaz.pedirNumero();		
		num2 = Interfaz.pedirNumero();		
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "La suma de " + num1 + " i " + num2 + " es igual a " + resultado);
		Interfaz.eleccion();
		
	}
	
	//Metodo s'encargara de la resta de dos numeros
	public static void resta() {
		double num1;
		double num2;
		double resultado;
		num1 = Interfaz.pedirNumero();
		num2 = Interfaz.pedirNumero();
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "La resta de " + num1 + " i " + num2 + " es igual a " + resultado);
		Interfaz.eleccion();
	}
	
	//Metodo s'encargara de la multliplicacion de dos numeros
	public static void multiplicacion() {
		double num1;
		double num2;
		double resultado;
		num1 = Interfaz.pedirNumero();
		num2 = Interfaz.pedirNumero();
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "La multiplicacion de " + num1 + " i " + num2 + " es igual a " + resultado);
		Interfaz.eleccion();
	}
	
	//Metodo s'encargara de la division de dos numeros
	public static void division() {
		double num1;
		double num2;
		double resultado;
		num1 = Interfaz.pedirNumero();
		num2 = Interfaz.pedirNumero();
		try {
			resultado = num1 / num2;
			//Al ser valores doubles si dividimos por 0 devuleve "infinity", capturamos la exepcion si dividimos por 0
			if(String.valueOf(resultado) == "Infinity") { 
				throw new ArithmeticException();
			} else {
				JOptionPane.showMessageDialog(null, "La division de " + num1 + " i " + num2 + " es igual a " + resultado);
			}			
			
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "No puede dividir por zero");
			division();
		}
		Interfaz.eleccion();
		
	}
	
	//Metodo s'encargara de la potencia de dos numeros
	public static void potencia() {
		double num1;
		double num2;
		double resultado;
		num1 = Interfaz.pedirNumero();
		num2 = Interfaz.pedirNumero();
		resultado = Math.pow(num1, num2);
		JOptionPane.showMessageDialog(null, "La potencia de " + num1 + " i " + num2 + " es igual a " + resultado);
		Interfaz.eleccion();
		
	}
	
	//Metodo s'encargara de la raiz cuadrada de un numero
	public static void raizCuadrada() {
		double num1;		
		double resultado;
		num1 = Interfaz.pedirNumero();
		try {
			if(num1 < 0) {
				throw new Exception();
			} else {				
				resultado = Math.sqrt(num1);
				JOptionPane.showMessageDialog(null, "La raiz Cuadrada de " + num1 + " es igual a " + resultado);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No puede ser negativo");
			raizCuadrada();
		}
		Interfaz.eleccion();
		
	}
	
	//Metodo s'encargara de la raiz cubica de un numero
	public static void raizCubica() {
		double num1;		
		double resultado;
		num1 = Interfaz.pedirNumero();
		try {
			if(num1 < 0) {
				throw new Exception();
			} else {				
				resultado = Math.cbrt(num1);
				JOptionPane.showMessageDialog(null, "La raiz Cubica de " + num1 + " es igual a " + resultado);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No puede ser negativo");
			raizCuadrada();
		}
		Interfaz.eleccion();
	}
}
