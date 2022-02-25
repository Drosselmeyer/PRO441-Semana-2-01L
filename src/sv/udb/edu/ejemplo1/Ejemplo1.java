package sv.udb.edu.ejemplo1;
import javax.swing.*;

public class Ejemplo1 {
	public static void main(String[] args) {
		//Variables
		int Num1, Num2;
			
		//Solicitamos el primer numero
		Num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
		//Solicitamos el segundo numero
		Num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
		
		//Condicion para probar los numeros
		if(Num1>Num2) {
			JOptionPane.showMessageDialog(null,
					"El numero "+Num1+" es mas grande que el "+ Num2);
		}else if(Num1<Num2) {
			JOptionPane.showMessageDialog(null,
					"El numero "+Num1+" es mas pequeño que el "+ Num2);
		}else if(Num1==Num2) {
			JOptionPane.showMessageDialog(null,
					"El numero "+Num1+" es igual al "+ Num2);
		}
		
		if((Num1%2)==0) {
			JOptionPane.showMessageDialog(null,
					"El numero "+Num1+" es par");
		}
		
		if((Num2%3)==0 && (Num2%11)==0) {
			JOptionPane.showMessageDialog(null,
					"El numero "+Num2+" es divisible entre 3 y 11");
		}
	}
}
