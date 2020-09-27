package com.filemanagement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FilePrinting {
	public File[] getFiles() { 
	File path = new File("Files/");
	File file1[] = null;
	if(path.isDirectory()) {
		file1 = path.listFiles(); 
		Arrays.sort(file1);		
	}
	return file1;
	}
	public void createFile() {
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
	public void deleteFie() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name of the file which is to be deleted");
		String str = s.next();
		File f = new File("Files/"+str+".txt");
		if(f.delete()) {
			System.out.println("File is deleted");
		}else {
			System.out.println("File is not found which is to be deleted"); 
		}
	}
	public void searchFile() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter file name which is to searched");
		String fileName = s.next();  
		File f = new File("Files/");
		if(f.isDirectory()) {
			File[] fileList = f.listFiles();
			for(File file : fileList) {
				if(file.getName().equals(fileName+".txt")) {
					System.out.println("File found with name : "+file.getName());
				}else {
					System.out.println("File doesn't exist");
				}
			}
		}
	}
}
