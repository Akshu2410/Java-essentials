import java.util.Scanner;

public class Avenger{
String name,power,weapon,planet;
int age;
   Scanner sc=new Scanner(System.in);
   
   void getDetails(){
     System.out.println("Enter Name of the Avenger:");
     name=sc.nextLine();
     System.out.println("Enter Power of the Avenger:");
     power=sc.nextLine();
     System.out.println("Enter Weapon of the Avenger:");
     weapon=sc.nextLine();
     System.out.println("Enter Planet of the Avenger:");
     planet=sc.nextLine();
     System.out.println("Enter Age of the Avenger:");
     age=sc.nextInt();
     
   }
   
   void displayDetails(){
      System.out.println("Name of the Avenger:"+name);  
      System.out.println("Age of the Avenger:"+age);  
      System.out.println("Power of the Avenger:"+power); 
      System.out.println("Weapon of the Avenger:"+weapon);  
      System.out.println("Planet of the Avenger:"+planet);  
   }
}

class AvengerMain{
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     Avenger[] a=new Avenger[5];
     for(int i=0;i<5;i++)
          {
               a[i]=new Avenger();
               System.out.println("Enter Detail of Avenger "+(i+1));
               a[i].getDetails();
               System.out.println("");
          }
          
     for(int i=0;i<5;i++)
          {
               a[i].displayDetails();
               System.out.println("");
          }
     }
}
