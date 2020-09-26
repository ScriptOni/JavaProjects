package com.views;

import java.awt.Color;
import java.awt.Font; 
import java.awt.BorderLayout;
import javax.swing.border.Border;
import java.awt.Component;
import javax.swing.UIManager;
public class Constants{
	
	protected static final String TITLE				= "Peculiar Image Viewer";
	protected static final String LOGO_URL 			= "assets/logos/peculiar.png"; 
	protected static final String LOOK_AND_FEEL	= UIManager.getSystemLookAndFeelClassName();
	//protected static final String LOOK_AND_FEEL		= "javax.swing.plaf.nimbus.NimbusLookAndFeel";
	protected static final int WIDTH 				= 1000;
	protected static final int HEIGHT 				= 700;
	protected static final int EXIT_ON_CLOSE 		= 3;
	protected static final Component CENTER_LOCATION = null;
	protected static final BorderLayout LAYOUT		= new BorderLayout();
	protected static final String CENTER 			= BorderLayout.CENTER;
	protected static final String NORTH 				= BorderLayout.NORTH;
	protected static final String SOUTH 				= BorderLayout.SOUTH;
	protected static final boolean IS_VISIBLE		= true;	
	protected static final boolean UNDECORATED		= false;
	protected static final boolean RESIZABLE			= true;

	protected static Color BACKGROUND_1COLOR 	= new Color(23,36,39,255);
	protected static Color BACKGROUND_2COLOR 	= new Color(69,66,56,255);
	protected  static Color TRANSPARENT 	 	= new Color(0,0,0,0);
	
	protected static Font FONT_ROBOTO			= new Font("Roboto",0,14);

}