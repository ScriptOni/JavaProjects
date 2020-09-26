package com.views;

import javax.swing.border.*;
import java.awt.*;

public class RoundedBorder implements Border{
		private int radius;
		
		public RoundedBorder(int radius){
			this.radius = radius;
		}
		public Insets getBorderInsets(Component component){
			return new Insets(radius+1,radius+1,radius+2,radius);
		}
		public boolean isBorderOpaque(){
			return true;
		}
		public void paintBorder(Component component,Graphics graphics,int x,int y,int width,int height){
			graphics.drawRoundRect(x,y,width-1,height-1,radius,radius);
			
		}
		
}