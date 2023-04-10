public class array7 {
    public static int replace(int arr[]) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1)
            arr[i]*=3;
            else if(arr[i]%2==0)
            arr[i]*=2;

        }
        for(int i=0; i<arr.length; i++){
            System.out.println( arr[i]);
        }

        
        return 0;

    }
    public static void main(String[] args) {
        System.out.println("enter size");
        System.out.println(replace(array4.makeArray(array4.takeSize())));
    }
}
