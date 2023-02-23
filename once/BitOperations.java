package once;

public class Bit_once { 
     
    public  static void print(int num) { 
        for(int i = 31; i >= 0; i--) { 
          System.out.print((num & ( 1 << i) === 0 ) ? '1' : '0');
        }
    }  

     public static void  main (String[] args){
        int num =4;
        print(num);
     } 

}
