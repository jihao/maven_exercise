package com.haojii.maven.helloworld;

import javax.servlet.http.Cookie;

import org.apache.log4j.Logger;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		javax.servlet.http.Cookie c = new Cookie("key", "value");
		Logger logger =Logger.getLogger(App.class);
		logger.debug(c.getVersion());
	}
}
