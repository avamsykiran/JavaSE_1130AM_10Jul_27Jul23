package com.cts.iostreamsdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1WriteTextFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter File Name: ");
		String fileName = scan.next();
		
		List<String> lines = new ArrayList<>();
		String line = null;
		
		System.out.println("Type contnet into the file('*STOP*') to stop: ");
		while(!"*STOP*".equals(line)) {
			line=scan.nextLine();
			if(!line.equals("*STOP*")) {
				lines.add(line);
			}
		}
		
		Path filePath = Paths.get(fileName);
		try {
			Files.write(filePath, lines);
			System.out.println("File Saved!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();

	}

}
