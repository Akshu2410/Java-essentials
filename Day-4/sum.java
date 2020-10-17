import java.util.Scanner;

class sum{
       public static void main(String args[]){
           int[] arr=new int[5];
           int num,add=0;

           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");           
           for(int i=0;i<arr.length;i++){
                   arr[i]=sc.nextInt();
                   add = add + arr[i];
                         }
                      
             System.out.println("Sum of numbers is:"+add);              
          }
}
