import java.util.Scanner;

public class EmployeeSalary{
   String name;
   int date,month,year;
   float salary,Asalary;
   Scanner sc=new Scanner(System.in);
   
   void get(){
          System.out.println("Name of Employee");
          name=sc.nextLine();
         
          System.out.println("Birth date :DD MM YYYY");
          date=sc.nextInt();
          month=sc.nextInt();
          year=sc.nextInt();
          
          System.out.println("Monthly Salary of Employee"); 
          salary=sc.nextFloat();      
      }
      
      void display(){
            System.out.println("Name of Employee:"+name);
            System.out.println("Birth date : "+date+"-"+month+"-"+year);  

      }
      
      void age(){
             int age;
             age=year-2020;
             System.out.println("Age : "+age);
      }
      
      void AnnualSalary(){
            System.out.println("Monthly Salary:"+salary);         
            Asalary=salary*12;
            System.out.println("Annual Salary : "+Asalary);   
      }
      
      void tax(){
         float tax;
            if(Asalary>=500000){
                    tax= Asalary*20/100;  
                    System.out.println("Income Tax Amount(20%):"+tax);                             
                  }
            else if(Asalary>=400000 && Asalary<500000){
                    tax= Asalary*15/100;  
                    System.out.println("Income Tax Amount(15%):"+tax);
                  }
            else if(Asalary>=300000 && Asalary<400000){
                    tax= Asalary*10/100;  
                    System.out.println("Income Tax Amount(10%):"+tax);
                  }
            else if(Asalary>=200000 && Asalary<300000){
                    tax= Asalary*5/100;  
                    System.out.println("Income Tax Amount(5%):"+tax);
                  }      
      }
}

class DemoSalary{
    public static void main(String args[]){
       EmployeeSalary es=new EmployeeSalary();
       es.get();
       es.display();
       es.age();
       es.AnnualSalary();
       es.tax();
    }
}
