package Arrays;

import java.util.Arrays;

public class UpdatingArray {
    public static void main(String[] args) {
        String [] menu={"Espresso","Iced Coffe","Macchiato"};
        String str=Arrays.toString(menu);
        System.out.println(str);

        String [] newArray=new String[5];
        int p=0;
        for(int i=0;i<menu.length;i++){
            newArray[i]=menu[i];
        }

        newArray[3]="House Blend";
        newArray[4]="Bhakari";

        // String s="Abhis";
        //  s=s+"abh";
        // System.out.println(s);

        System.out.println(Arrays.toString(newArray));
    }
    
}
