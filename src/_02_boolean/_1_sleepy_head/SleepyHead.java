package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
         
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    
        isWeekday= JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
System.out.println(isWeekday);

isVacation= JOptionPane.showConfirmDialog(null, "Is it a VaCaTiOn?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
System.out.println(isVacation);  
if(isWeekday==1 || isVacation==0) {
JOptionPane.showMessageDialog(null, "sleep in");
}else {
	JOptionPane.showMessageDialog(null, "get up lazybones!");

}





/*
         * Print “sleep in"? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!"? 
         * If it is a weekday, but we are on vacation,  print “sleep in"?.
         */
    }
}
