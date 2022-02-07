package objetos;

import javax.swing.JOptionPane;

public class Interfaz {	
	
	static double numOperacion;
	
	//Pedirá por pantalla las operaciones disponibles ( se tendrá que introducir del 1 - 8)
	public static int pedirCalculo() {
		int operacionCalculo = 0;
		String operacionCalculoTxt;
		
		try {
			do {
				operacionCalculoTxt = JOptionPane.showInputDialog("CALCULADORA:\nIntoduce el calculo que quiere realizar: 1-7"
						+ "\n1- suma\n2- resta\n3- multiplicacion\n4- division\n5- potencia\n6- raiz cuadrada\n7- raiz cubica\n8- Salir");
				operacionCalculo = Integer.parseInt(operacionCalculoTxt);
			} while (operacionCalculo > 8 || operacionCalculo < 1);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No has introducido un numero valido");
			eleccion();
		}
		return operacionCalculo;
	}
	
	//Dependiendo de la eleccion sumara, restara, multiplicara, etc
	public static void eleccion() {
		
		switch (pedirCalculo()) {
		case 1:
			Operacion.suma();
			break;
		case 2:
			Operacion.resta();
			break;
		case 3:
			Operacion.multiplicacion();
			break;
		case 4:
			Operacion.division();
			break;
		case 5:
			Operacion.potencia();
			break;
		case 6:
			Operacion.raizCuadrada();
			break;
		case 7:
			Operacion.raizCubica();
			break;
		case 8:
			System.exit(0);
		}
	}
	
	//Pedira por pantalla los numeros para hacer las operaciones
	public static double pedirNumero() {
		
		String operacionTxt;				
		
		try {
			operacionTxt = JOptionPane.showInputDialog("Introduce un numero: ");
			numOperacion = Double.parseDouble(operacionTxt);			
			
		} catch (Exception e) {//sino introduce un numero valido saldra un mensaje y volvera a pedir el numero		
			JOptionPane.showMessageDialog(null, "No has introducido un numero valido");
			pedirNumero();
		}
		return numOperacion;
	}
	
	
}
