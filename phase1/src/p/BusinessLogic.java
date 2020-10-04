package p;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BusinessLogic {
	String path="C:\\Users\\Rahul\\Downloads\\Programs\\phase1\\root";
	int flag=0;

	public void add() {try {
		System.out.println("Enter the name of file in the format example.txt:");
	      Scanner s= new Scanner(System.in);
	      String fileName=s.nextLine();
	      File myObj = new File("C:\\Users\\Rahul\\Downloads\\Programs\\phase1\\root\\"+fileName);
	       if (myObj.createNewFile()==true) {
	        System.out.println("File created: " + myObj.getName()+"\n");
	      } else {
	        System.out.println("File already exists.\n");
	      }
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	}
	public void delete() {
		System.out.println("enter the name of file to delete:");
	    Scanner s= new Scanner(System.in);
		String fileToDelete=s.nextLine();
	      File myObj = new File("C:\\Users\\Rahul\\Downloads\\Programs\\phase1\\root\\"+fileToDelete);
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName()+"\n");
	    } else {
	      System.out.println("Failed to delete the file.\n");
	    } 
	}
	public void search()
	{     
		File folder = new File(path);
		//int flag=0;
        String[] files = folder.list();
        System.out.println("Enter the name of file to search:");
	    Scanner s3= new Scanner(System.in);
	    String fileToSearch= s3.nextLine();
 
        for (String s : files)
        {
            if(fileToSearch.equals(s)) {
            	flag=1;
            	break;
            } 
            else {
            	flag=0;
            }
        }
        if(flag==1) {
        	System.out.println("File found !");
        }
        else {
        	System.out.println("File not found !");
        }
    	
    }
	public void sort()
	{
		File folder = new File(path);
		 
		String[] files = folder.list();
        Set<String> ts= new TreeSet();
        for(String x:files) {
        	    			ts.add(x);
        	}
        if(ts.isEmpty()) {
        	System.out.println("Folder is empty !!\n");
        }
        else {
        	System.out.println("Displaying files in ascending order..");
        	System.out.println(ts);
        }
        	
        
        
}}
