package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

for (int j = 1; j < 11; j++) {
System.out.println(j);	
}

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null," The more you take, the more you leave behind. What am I?"  );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equalsIgnoreCase("footsteps")) {
	JOptionPane.showMessageDialog(null," Correct. 1 point   " );
	score ++;

}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, " Wrong.");
	
}
	// 6. Add some more riddles
 String shave = JOptionPane.showInputDialog(null, " I shave every day, but my beard stays the same. What am I");
if (shave.equalsIgnoreCase("a barber")) {
	JOptionPane.showMessageDialog(null," Correct. 1 point   " );
	score ++;
		
	
}	
else {
	JOptionPane.showMessageDialog(null, " Wrong.");
	
}
 	


// 2. Make a pop up to show the score.
		
	JOptionPane.showMessageDialog(null, " your score is "  + score );
	
	
	
	
	
	}



}

