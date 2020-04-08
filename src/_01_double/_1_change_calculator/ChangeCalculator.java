package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String A = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int N =Integer.parseInt(A);
N=N*5;
		// Ask the user how many dimes they have, and convert their answer
String C = JOptionPane.showInputDialog("how many dimes do you have");
int D =Integer.parseInt(C)  ;
D=D*10;
		// Ask the user how many quarters they have, and convert their answer
String E = JOptionPane.showInputDialog("how many quarters do you have");
int Q = Integer.parseInt(E)  ;
Q=Q*25;
		// Calculate how much money the user has.  Hint: Use a double variable 
double Money=(N + D + Q)/100.0;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null,"You have $"+ Money);
	}
}


