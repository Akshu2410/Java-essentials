import java.util.Scanner;

public class percentage{

          int m1,m2,m3,m4,m5;
          int total;
          float per;
          Scanner sc=new Scanner(System.in); 
          
          void getMarks(){
   System.out.println("Marks in Subject English");
   m1=sc.nextInt();
   
   System.out.println("Marks in Subject Science");
   m2=sc.nextInt();
   
   System.out.println("Marks in Subject Maths");
   m3=sc.nextInt();
   
   System.out.println("Marks in Subject History");
   m4=sc.nextInt();
   
   System.out.println("Marks in Subject Geography");
   m5=sc.nextInt();
          } 
          
          void displayMarks(){
                  System.out.println("Marks in Subject English:"+m1);
                  System.out.println("Marks in Subject Science:"+m2);
                  System.out.println("Marks in Subject Maths:"+m3);
                  System.out.println("Marks in Subject History:"+m4);
                  System.out.println("Marks in Subject Geography:"+m5);
          }
          
          void total(){
             total=m1+m2+m3+m4+m5;
             System.out.println("Total Marks are:"+total);
          }
          
          void percent(){
             per=total/5;
              System.out.println("Percentage : "+per);            
          }
          
          void Grade(){
                  if(per>60 && per<=100){
                             System.out.println("Grade A");     
                      }
                  else if(per>55 && per<=60){
                             System.out.println("Grade B+");     
                      }
                  else if(per>50 && per<=55){
                             System.out.println("Grade B");     
                      }
                  else if(per>43 && per<=50){
                             System.out.println("Grade C+");     
                      }
                  else if(per>35 && per<=43){
                             System.out.println("Grade C");     
                      }
                  else if(per>0 && per<=35){
                             System.out.println("Grade F(FAIL)");     
                      }
          }
     
}

class Demo{
     public static void main(String args[]){
     percentage p=new percentage();
     p.getMarks();
     p.displayMarks();
     p.total();
     p.percent();
     p.Grade();
     }
}
