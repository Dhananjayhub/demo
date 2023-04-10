public class array9 {
    public static void reverse(int arr[])
     { int i,temp;

        for( i=0; i<arr.length; i=i+2){
          temp= arr[i];
          arr[i]= arr[i+1];
          arr[i+1]= temp;
        }
        for( i=0; i<arr.length; i++){
            System.out.println( arr[i]);
        }

        
        

    }
    public static void main(String[] args) {
        System.out.println("enter size");
        reverse(array4.makeArray(array4.takeSize()));  }
}
