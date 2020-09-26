package com.views;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class NavigationView extends JPanel{
	
	
	private MyButton prevBtn,nextBtn;
	
	
	
	public NavigationView(){
		setBackground(Constants.BACKGROUND_2COLOR);
		prevBtn = new MyButton("Previous");
		nextBtn = new MyButton("Next");
		
		prevBtn.setPreferredSize(new Dimension(100,30));
		nextBtn.setPreferredSize(new Dimension(100,30));
		prevBtn.setMargin(new Insets(50,5,50,5));
		nextBtn.setMargin(new Insets(50,5,50,5));
		
		prevBtn.setForeground(Constants.BACKGROUND_2COLOR);
		nextBtn.setForeground(Constants.BACKGROUND_2COLOR);
		
		prevBtn.setBackground(Constants.BACKGROUND_1COLOR);
		nextBtn.setBackground(Constants.BACKGROUND_1COLOR);
		
		
	
		add(prevBtn);
		add(nextBtn);
	}
	void addActionListener(ActionListener listener){
		prevBtn.addActionListener(listener);
		nextBtn.addActionListener(listener);
	}
	Object getSource(String name){
		if(name.equals("previous")){
			return this.prevBtn;
		}
		if(name.equals("next")){
			return this.nextBtn;
		}
		return null;
	}
}