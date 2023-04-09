
import java.util.Scanner;

public class array4 {
        public static int takeSize(){
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            
            return size;
            
            

        }
        public static int[] makeArray(int size){
            int[] array = new int[size];
            Scanner s = new Scanner(System.in);
            int i;
            for(i=0; i<size; i++) {
                array[i] = s.nextInt();
            }
            s.close();
            return array;
        }
        public static int oddSum(int array[]){    
            int sum=0;
            for(int i = 0; i<array.length;i+=2){
                sum+= array[i];
            }
            return sum;
        }
        public static void main(String args[]){
            // system.out.println("enter size" +takesize());

            System.out.println(oddSum(makeArray(takeSize())));

        }

}
