package finalProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Finalproject {
	public static void main(String[] args) throws IOException {
		options();
	}
	public static void options() throws IOException {
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("select your choice:");
		 System.out.println("1)show the list of files present");
		 System.out.println("2)to perform advanced actions to the files");
		 System.out.println("3)to exit the application");
		 int c= myObj.nextInt();
		 String arr[]={"first.txt","second.txt"};
		 switch(c) {
		 case 1:
			 List<String> results = new ArrayList<String>();


			 File[] files = new File("E:\\wipro\\projects\\files").listFiles();
			 

			 for (File file : files) {
			     if (file.isFile()) {
			         results.add(file.getName());
			     }
			 
			 }
			 for(String i:results) {
				 System.out.println(i);
			 }
			 break;
		 case 2:
			 Scanner myOb = new Scanner(System.in);
			 System.out.println("select your choice:");
			 System.out.println("1)add your own file");
			 System.out.println("2)delete the existing file");
			 System.out.println("3)search your file from existing files");
			 System.out.println("4)go to previous options");
			 int b= myOb.nextInt();
			 switch(b) {
			 case 1:
				 System.out.println("enter the file name with extension:");
				 Scanner name = new Scanner(System.in);
				 String j= "E:/wipro/projects/files/"+name.next();
				 File file =new File(j);
					if(file.createNewFile()) {
						System.out.println("File is Created");
					}
					else {
						System.out.println("File is Already Exist");
					}
				    System.out.println("do you want to add something to your file(Y/N)");
				    Scanner choice = new Scanner(System.in);
					String h= choice.next();
					System.out.println(h);
					 if (h.equals("Y")) {
						 
						 Scanner tin = new Scanner(System.in);
						 String t= tin.next();
						 
						 try {							 
						     
							 FileWriter myw=new FileWriter(j);
							 myw.write(t);
							 myw.close();
							 System.out.println("text added");
							
						 }
						 catch (IOException e) {
							 System.out.println("error occured");
							 e.printStackTrace();
						 }
						  
										 
						    
						 
					 }
				 break;
			 case 2:
				 System.out.println("enter the file name with extension you want to delete");
				 Scanner del = new Scanner(System.in);
				 String k= del.next();
				 String u= "E:/wipro/projects/files/"+k;
				 try {
			            Files.deleteIfExists(Paths.get(u));
			                
			        }
			        catch (NoSuchFileException e) {
			            System.out.println("No such file/directory exists");
			                
			        }
			        catch (DirectoryNotEmptyException e) {
			            System.out.println("Directory is not empty.");
			        }
			        catch (IOException e) {
			            System.out.println("Invalid permissions.");
			        }
			 
			        System.out.println("Deletion successful.");
				 break;
			 case 3:
				 List<String> result = new ArrayList<String>();


				 File[] fil = new File("E:\\wipro\\projects\\files").listFiles();
				 

				 for (File fle : fil) {
				     if (fle.isFile()) {
				         result.add(fle.getName());
				     }
				 
				 }
				 System.out.println("enter the file name to search");
				 Scanner ser = new Scanner(System.in);
				 String s= ser.next();
				 int r=0;
				 for(String i: result) {
					 if(i.equals(s)) {
						 r=0;
						
						 break;
					 }
					 else {
						 r=r+1;
						 
						 
					 }
					 
				 }
				 if(r==0) {
					 System.out.println("file exist");
					 
				 }
				 else {
					 System.out.println("files doesnt exist");
				 }
				 
				 break;
			 case 4:
	
				 options();
				 break;
			 
			 }
			 			 
			 break;
		 case 3:
			 System.out.println("exited");
			 System.exit(0);
			 break;
		
		 }
		 
	}

}




