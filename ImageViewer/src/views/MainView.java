
package com.views;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class MainView extends JPanel implements ActionListener{
	
	private NavigationView navView;
	private ImageView imageView;
	
	public MainView(){
		setBackground(Constants.TRANSPARENT);
		navView 	= new NavigationView();
		imageView 	= new ImageView();		
		navView.setPreferredSize(new Dimension(800,50));
		
		//imageLoader
		//ActionListener
		navView.addActionListener(this);
		
		setLayout(new BorderLayout());
		add(imageView,BorderLayout.CENTER);
		add(navView,BorderLayout.SOUTH);
		
	}
	
	public void actionPerformed(ActionEvent ev){
		var layout 		= imageView.getLayout();
		
		var previousBtn = navView.getSource("previous");
		var nextBtn 	= navView.getSource("next");
		
		if(ev.getSource() == previousBtn){
			layout.previous(imageView);
		}
		if(ev.getSource() == nextBtn){
			layout.next(imageView);
		}
	}
}