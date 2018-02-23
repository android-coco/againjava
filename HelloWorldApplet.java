package com.yh.demo;

import java.applet.Applet;
import java.awt.Graphics;
/**
 * 
 * @author yh
 * @version 1.2
 */
@SuppressWarnings("serial")
public class HelloWorldApplet extends Applet {
	@Override
	public void paint(Graphics g) {
		g.drawString("Hello World", 25, 50);
	}
}
