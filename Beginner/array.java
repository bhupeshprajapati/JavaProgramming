import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] result=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("\nEnter the array element "+ (i+1) +" : ");
            result[i]=sc.nextInt();
        }     
         Arrays.sort(result);  
         for(int i=0;i<5;i++){
            System.out.print(" "+result[i]);
        }     
    }
}