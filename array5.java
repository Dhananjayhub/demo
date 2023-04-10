public class array5 {
    public static int max(int arr[]) {
        int maxi= 0;
        // int i;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            
            
            
        }
        return maxi;
         

    
    }
    //  -1 , -2 , -3 , -4
    // 1,2,3,4,5

    public static void main(String[] args) {
        System.out.println("enter size");
        System.out.println(max(array4.makeArray(array4.takeSize())));
    }
}
