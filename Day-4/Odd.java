import java.util.Scanner;

class Odd{
       public static void main(String args[]){
           int[] o=new int[5];
           int num;
           
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           for(int i=0;i<5;i++){
                   o[i]=sc.nextInt();
                         }
                         
           System.out.println("Odd numbers are:");
           for(int i=0;i<5;i++){
                   if(o[i]%2==0){
               System.out.println(+o[i]);
           }
                         }                           
          }
}
