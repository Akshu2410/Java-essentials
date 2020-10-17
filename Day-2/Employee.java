public class Employee {
   
String name,city;
int age;
             
   void display(){
        System.out.println("The name is "+name);
        System.out.println("Age is "+age);
        System.out.println("The city is "+city);
   }
   
   

}

class Main{
public static void main(String args[]){
      Employee e=new Employee();
      Employee e1=new Employee(); 
      
      e.name="Akshari";
      e.age=21;
      e.city="pune";
      e.display();
      
      System.out.println("");
      
      e1.name="Darshana";
      e1.age=22;
      e1.city="Chakan";
      e1.display();
   }
}
