
package com.views;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
	//CONSTANTS
	
	//COMPONENTS 
	private MenuBar menuBar;
	private MainView mainView;
	private StatusBar statusBar;
	public View(){
	   try{
		   UIManager.setLookAndFeel(Constants.LOOK_AND_FEEL);
		   setTitle(Constants.TITLE);
		   setSize(Constants.WIDTH,Constants.HEIGHT);
		   setUndecorated(Constants.UNDECORATED);
       	   setIconImage(new ImageIcon(Constants.LOGO_URL).getImage());
	       setDefaultCloseOperation(Constants.EXIT_ON_CLOSE);
	       setLocationRelativeTo(Constants.CENTER_LOCATION);
		   setResizable(Constants.RESIZABLE);
		   setLayout(new BorderLayout());
		   add(setMenuBar(),Constants.NORTH);
		   add(setMainView(),Constants.CENTER);
		   add(setStatusBar(),Constants.SOUTH);
		   setVisible(Constants.IS_VISIBLE);
	   }catch(Exception e){
	       e.printStackTrace();
	   }
	}
	private MainView setMainView(){
		mainView = new MainView();
		return mainView;
	}
	private MenuBar setMenuBar(){ 
		menuBar = new MenuBar();
		return menuBar;
	}
	private StatusBar setStatusBar(){
		statusBar = new StatusBar();
		return statusBar;
	}
	
}