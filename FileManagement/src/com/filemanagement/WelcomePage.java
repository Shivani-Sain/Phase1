package com.filemanagement;

import java.io.File;
import java.util.Scanner;

public class WelcomePage {
	public static void main(String[] args) {
		System.out.println("-----File Management System -----------");
		System.out.println("---------Developer Name:Shivani Pal--------------");
		int str =0;
		int str1 = 0;
		outerLoop:
		do {
			System.out.println("Enter 1 to show files in ascending order ");
			System.out.println("Enter 2 for other activities");
			System.out.println("Enter 3 to exit ");
			Scanner scanner = new Scanner(System.in);
			try{
				str = scanner.nextInt();
			} catch(Exception e){
				System.out.println("Please enter a valid Number");
			}
		switch(str) {
		default:{
			if(str != 3){
				System.out.println("Please choose a valid option this is Wrong input");
				break;
			}else{
				break outerLoop;
			}
		}
		case 1 :{
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
		case 2 :{ 
			innermost :
			do {
				System.out.println("enter 1 to add files");
				System.out.println("enter 2 to delete file");
				System.out.println("enter 3 search file");
				System.out.println("enter 4 to main context");
				try{
				str1 = scanner.nextInt();
				}catch(Exception e){
					System.out.println("Please enter a valid number");
					break;
				}
			switch(str1) {
			case 1 :System.out.println("adding files");
			new FilePrinting().createFile();
				break ;
			case 2 :System.out.println("deleting files");
			new FilePrinting().deleteFie();
			break;
			case 3 :System.out.println("searching files");
			new FilePrinting().searchFile();
			break;
				default:{
				if(str1 != 4){
					System.out.println("Please choose a valid option this is Wrong input");
					break ;
				}else{
				break innermost;
				}
				}
			}
			
		}while(str1 != 4);
		}
	
	}
	}while(str != 3);
	}
}
