package com.views;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.File;


public class ImageView extends JPanel{
	
	private CardLayout cardLayout = new CardLayout();
	private String currentDirector = System.getProperty("user.dir");
	private String folderName = "/assets/logos/";
	private File folder = new File(currentDirector + folderName);
	private File[] listOfFiles = folder.listFiles();
	
	public ImageView(){
		setLayout(cardLayout);
		setBackground(Constants.BACKGROUND_2COLOR);
		imageLoader();
		
	}
	private void imageLoader(){
		for(File file: listOfFiles){
			String name = file.getName();
			try{
			    var imgUrl = new ImageIcon(currentDirector+folderName+name);
				// var img = imgUrl.getImage().getScaledInstance(Constants.WIDTH,Constants.HEIGHT,Image.SCALE_SMOOTH);
				var image = new JLabel(imgUrl);
				image.setIcon(imgUrl);
				image.setBorder(BorderFactory.createLineBorder(Constants.BACKGROUND_1COLOR,3));
				addImage(name,image);
			}catch(Exception e){
			    e.printStackTrace();
			}
			
		}
	}
	public CardLayout getLayout(){
		return this.cardLayout;
	}
	private void addImage(String name,JLabel image){
		add(name,image);
	}
}