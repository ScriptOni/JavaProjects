package com.views;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.*;

public class MyButton extends JButton{
	public MyButton(String name){
		super(name);
		setBorderPainted(false);
		setFocusable(false);
		setBackground(Constants.BACKGROUND_1COLOR);
		setForeground(Color.WHITE);
		setFont(Constants.FONT_ROBOTO);
		
	}
	
}


