public class array10 {
    public static void create(int arr[])
     { int i ;
        int e=0;
        int o=0;

        int[] even = new int[5];
        int[] odd = new int[5];
        for( i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]= arr[i];
                o++;
            }
          }

        for( e=0; e<even.length; e++){
            System.out.println( even[e]);
        }
        for( o=0; o<odd.length; o++){
            System.out.println( odd[o]);
        }

        
        

    }
    public static void main(String[] args) {
        System.out.println("enter size");
        create(array4.makeArray(array4.takeSize()));  }
}
