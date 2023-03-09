package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	Properties prop;
	public final String filepath = "C:\\Users\\Lakshmi Praveena\\Desktop\\JavaSprint2\\JavaProgramesSprint2\\src\\main\\java\\config\\config.proprerty";

	public ConfigFileReader() throws IOException {
		File f = new File(filepath);
		FileInputStream fin = new FileInputStream(f);
		prop = new Properties();
		prop.load(fin);
	}

	public String url() {

		return prop.getProperty("url");

	}
}
