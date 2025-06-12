package org.airport.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseAirport {

	public static Properties properties;
	public static FileInputStream fileInputStream;

	public static Properties datas() throws IOException {

		properties = new Properties();
		fileInputStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\org\\airport\\tests\\Prop.properties");
		properties.load(fileInputStream);
		return properties;
	}
}
