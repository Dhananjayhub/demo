

public class array3 {

    public static int fiveSum(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%3==0 && array[i]%5==0){
                sum+=array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fiveSum(array4.makeArray(array4.takeSize())));
    }
    
}