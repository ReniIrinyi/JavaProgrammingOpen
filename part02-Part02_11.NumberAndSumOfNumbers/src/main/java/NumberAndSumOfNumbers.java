
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0;
        int inputnr=0;
        
        while(true){
            System.out.println("Give a number:");
            int nr=Integer.valueOf(scanner.nextLine());
            if(nr>0 || nr<0){
                inputnr +=1;
                sum+=nr;
                continue;
            }
            if(nr==0){
                System.out.println("Number of numbers: "+inputnr);
                System.out.println("Sum of the numbers: "+sum);
                break;
            }
            
        }
    }
}
