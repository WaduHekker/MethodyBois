public class myBubbleSort
{
   public static void main (String [] args){
       int[] A = {24,-12,1000,-3,0,0,-45,67,312,82,4,9,1001,45,56,-1002};
       bubbleSort (A);
       System.out.print(java.util.Arrays.toString(A));
   }
   public static void swap (int[]A,int i, int j){
       int temp = A[i];
       A[i] = A [j];
       A[j] = temp;
   }
   public static void bubbleSort (int[]A){
       for (int i = 0; i < A.length - 1; i++){
           for (int j = 0; j <A.length - 1; j++){
               if (A[j] > A [j+1]){
                   swap (A,j,j+1);
                }
            }
        }
    }
}
