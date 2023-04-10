public class array6 {
    public static void reverse(int arr[])
     { int j,i,temp;

        for( i=0 ,j= arr.length -1; i<arr.length/2; i++ , j--){
          temp= arr[i];
          arr[i]= arr[j];
          arr[j]= temp;
        }
        for( i=0; i<arr.length; i++){
            System.out.println( arr[i]);
        }

        
        

    }
    public static void main(String[] args) {
        System.out.println("enter size");
        reverse(array4.makeArray(array4.takeSize()));  }
}
