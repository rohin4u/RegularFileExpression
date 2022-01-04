package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter("F://output.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("F://input.txt"));
		
		String line  = br.readLine();
		
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		
		
		while(line!=null) {
			
			Matcher m = p.matcher(line);
			
			while(m.find())
			{
				writer.println(m.group());
			}
			
			
			line = br.readLine();
			
		}
		writer.flush();
		writer.close();
		System.out.println("file is done");
	

	}

}
