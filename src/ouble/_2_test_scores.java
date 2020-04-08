package ouble;

import javax.swing.JOptionPane;

public class _2_test_scores {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What is you Test SC0RE!");
	
	
	
	
	double d_score = Double.parseDouble(score);
	
	if (d_score>80.0) {
		JOptionPane.showMessageDialog(null,"Congrats You passed");
	
	}
	if (d_score<80.0 && d_score>60.0) {
		JOptionPane.showMessageDialog(null,"so close");
	}
		if (d_score<60.0 && d_score>20.0) {
			JOptionPane.showMessageDialog(null,":{");
		}
			if (d_score<20.0 && d_score>0.0) {
				JOptionPane.showMessageDialog(null,"u jus bad");
			}
			if (d_score<120.0 && d_score>100.0) {
				JOptionPane.showMessageDialog(null,"u to coul for skool");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}

}
