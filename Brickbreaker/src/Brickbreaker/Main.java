package Brickbreaker;

import javax.swing.JFrame;

public class Main {
public static void main(String[] args)
{
	JFrame obj = new JFrame();
	Gameplay gameplay=  new Gameplay();
	obj.setBounds(10, 10, 700, 600);
	obj.setTitle("Break the Brick");
	obj.setResizable(false);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.add(gameplay);
}
}
