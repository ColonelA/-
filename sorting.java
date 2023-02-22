public class sorting {
    public static void selectSorting(int arr[]) { 
    
        if (arr == null || arr.length < 2) {
            return;
        } 
         int N = arr.length;

         for(int i = 0; i < N;  i++ ){ 
            int minValueIndex = i;

            for(int j = i +1; j < N;  j++ ){ 
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
         }
    
    
    
    } 
     
     public static void printArray(int arr[]){ 
         
        for(int i = 0; i < arr.length; i++){ 
             
        }
     }  


     public static void swap(int[] arr, int i , int j){ 
         int tmp = arr[i]; 
         arr[i] = arr[j] ;
         arr[j] = tmp;
        
     }


}
