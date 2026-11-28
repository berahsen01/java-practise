package javaPractise;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;

public class GuessıngNumberGUI {

    public static void main(String[] args) {
    	int number=(int)(Math.random() * 100) + 1;

        JFrame frame = new JFrame("Guess The Number");
         frame.getContentPane().setBackground(new Color(255,228,235));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("GUESS THE NUMBER");
        title.setBounds(100, 30, 250, 30);
        title.setFont(new Font("Arial",Font.BOLD,20));
        title.setForeground(new Color(190,70,120));
        

        JTextField input = new JTextField();
        input.setBounds(120, 100, 150, 35);

        JButton button = new JButton("GUESS");
        button.setBounds(140, 150, 110, 35);
        button.setBackground(new Color(230,120,160));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial",Font.BOLD,14));
        button.setOpaque(true);
        button.setBorderPainted(false);

        JLabel result = new JLabel("Enter a number!");
        result.setBounds(120, 210, 200, 30);
        result.setForeground(new Color(170,65,110));
        result.setFont(new Font("Arial",Font.BOLD,14));
        
        
        button.addActionListener(e->{
        	try {
        		int guess= Integer.parseInt(input.getText());
        		 if (guess< number) {
        			 result.setText("try a bigger number");
        		 }else if (guess> number) {
        			 result.setText("try a smaller ");
        		 }else {
        			 result.setText("CONGRULATİONS");
        		 }
        	} catch (NumberFormatException ex) {
        		result.setText("PLEASE ENTER A VALİD");
        	}
        });
        
        

        frame.add(title);
        frame.add(input);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}
