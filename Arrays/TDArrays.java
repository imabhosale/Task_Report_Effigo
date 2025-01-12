package Arrays;

import java.util.Arrays;

public class TDArrays {public static void main(String[] args) {
    int [] [] arr=new int[3][4];
   // System.out.println(Arrays.toString(arr));   Not working 
   System.out.println(Arrays.deepToString(arr));//Arrays.deepToString():

   arr[0][0]=72;
   arr[0][1]=74;
   arr[0][2]=78;
   arr[0][3]=76;

   arr[1][0]=65;
   arr[1][1]=64;
   arr[1][2]=61;
   arr[1][3]=67;

   arr[2][0]=95;
   arr[2][1]=98;
   arr[2][2]=99;
   arr[2][3]=100;
   System.out.println(arr.length);

   //or int [][]arr={{12,12,32},{09,98,22}}  this can be another way to initialize 2d array
//    System.out.println("harry got : "+Arrays.toString(arr[0]));
//    System.out.println("Ron got : "+Arrays.toString(arr[1]));
//    System.out.println("Hermione got : "+Arrays.toString(arr[2]));

    // System.out.print("harry got : ");
    // for(int j=0;j<arr[0].length;j++){
    //     System.out.print(arr[0][j]+" ");
    // }
    // System.out.println();

    // System.out.print("Ron got : ");
    // for(int j=0;j<arr[1].length;j++){
    //     System.out.print(arr[0][j]+" ");
    // }
    // System.out.println();

    // System.out.print("Hermione got : ");
    // for(int j=0;j<arr[2].length;j++){
    //     System.out.print(arr[2][j]+" ");
    // }

    for(int i=0;i<arr.length;i++){
        switch (i) {
            case 0:
                System.out.print("Ron got :");
                break;
            case 1:
                System.out.print("Ron got ");
                break;
            case 2:
                System.out.print("Hermione got ");
                break;
        
        }
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
    
}
