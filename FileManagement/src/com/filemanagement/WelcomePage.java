package com.filemanagement;

import java.io.File;
import java.util.Scanner;

public class WelcomePage {
	public static void main(String[] args) {
		System.out.println("-----File Management System -----------");
		System.out.println("---------Developer Name:Shivani Pal--------------");
		System.out.println("Enter 1 to show files in ascending order ");
		System.out.println("Enter 2 for other activities");
		System.out.println("Enter 3 to exit ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		do {
		switch(str) {
		case "1" :{
			//System.out.println("Going to print the files ascending order");
			File[] file1 =new FilePrinting().getFiles();
			if(file1 != null && file1.length >0) {
			for(File f:file1) {
				System.out.println(f.getName());
			}
			}else {
				System.out.println("No file exists");
			}
			break;
		}
		case "2" :{ 
			System.out.println("enter 1 to add files");
			System.out.println("enter 2 to delete file");
			System.out.println("enter 3 search file");
			System.out.println("enter 4 to exit");
			String str1 = scanner.next();
			do {
			switch(str1) {
			case "1" :System.out.println("adding files");
			new FilePrinting().createFile();
				break;
			case "2" :System.out.println("deleting files");
			new FilePrinting().deleteFie();
			break;
			case "3" :System.out.println("searching files");
			new FilePrinting().searchFile();
			break;
			case "4" :break;
				}
			break;
		}while(str != "4");
		}
	default:{
	break;
	}
	}
	}while(str != "3");
	}
}
