import java.util.Scanner;

public class A2Q2 {
	
	 public static void main(String[] args) {

  //Write a java program that reads in the radius and length of a cylinder and computes the area and volume.

		    Scanner r = new Scanner(System.in);
		    
		    System.out.print("Enter the radius and length of a cylinder:" + " ");
		    
		      double radius = r.nextDouble();
	   	  
	   	      double area = ((radius*radius*(Math.PI)));
	   	  
	   	      double lenght = r.nextDouble();
	   	  
	   	      double volume = (area*lenght);
	   	  
	   	                  System.out.println("The area is"+" "+ area);
	   	  
	   	                  System.out.println("The volume is"+" " +volume);
	 }
}