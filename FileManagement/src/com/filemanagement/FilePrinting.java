package com.filemanagement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FilePrinting {
	public File[] getFiles() { 
	File path = new File("root/");
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
		try {
			do{
				String fileName = s.next();
			File file = new File("root/"+fileName+".txt");
			if(file.createNewFile()) {
				 FileOutputStream outputStream = new FileOutputStream(file);
				System.out.println("enter the content of the file");
				Scanner sp = new Scanner(System.in);
				String s1 = sp.nextLine();
				byte[] bytes = s1.getBytes(); 
				outputStream.write(bytes);
				outputStream.close();
				System.out.println("file is created");
			break;
			}else{
				System.out.println("file already exist Please enter a new file name");
			}
			}while(true);
					} catch (IOException e) {
					e.printStackTrace();
		}
	}
	public void deleteFie() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name of the file which is to be deleted");
		String str = s.next();
		File f = new File("root/"+str+".txt");
		if(f.delete()) {
			System.out.println("File is deleted");
		}else {
			System.out.println("File is not found which is to be deleted"); 
		}
	}
	public void searchFile() {
		Scanner s = new Scanner(System.in);
		int count=0; 
		System.out.println("enter file name which is to searched");
		String fileName = s.next();  
		File f = new File("root/");
		if(f.isDirectory()) {
			File[] fileList = f.listFiles();
			for(File file : fileList) {
				if(file.getName().equals(fileName+".txt")) {
					count++;
					break;
				}else {
					count = 0;
				}
			}
			if(count > 0){
				System.out.println(fileName+".txt");
			}else{
				System.out.println("File not found");
			}
		}
	}
}
