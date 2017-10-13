package BubbleSort;
 import java.util.Scanner;
  public class BubbleSortClass{
 
     public static void BubbleSort(){
         
      Scanner input = new Scanner(System.in);
        
      int[] array = new int[10];
      int assist, i, j;
         
       for(i = 0; i < 10; ++i){
           System.out.print("Enter the "+(i+1)+"º integer value: ");
           array[i] = input.nextInt();
       }
         
       for(i = 0; i < array.length; ++i){
        for(j = 0; j < (array.length - 1); ++j){
           if(array[j] > array[j + 1]){
              assist = array[j];
              array[j] = array[j + 1];
              array[j + 1] = assist;                    
          }       
         }
        }  
           for(i = 0; i < array.length; ++i){
               System.out.print(array[i]+" ");
           }           
   }
      
     public static void main(String[] args){
         
         System.out.println(" Bubble Sort program ");
                        BubbleSort();     
    }   
   }