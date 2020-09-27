package com.filemanagement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFiles {
	public void addFile() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the file name");
		String fileName = s.next();
		File file = new File("Files/"+fileName+".txt");
		try {
			if(file.createNewFile()) {
			System.out.println("file is created");
			}
					} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
