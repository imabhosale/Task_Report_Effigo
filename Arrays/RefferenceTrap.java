package Arrays;

import java.util.Arrays;

public class RefferenceTrap {
    public static void main(String[] args) {
        String [] staffLastyr={"Abhishek", "Kunal","virat"};
        String [] staffThisyr=staffLastyr;
        System.out.println(Arrays.toString(staffLastyr));
        staffThisyr[1]="rushi";
        System.out.println(Arrays.toString(staffThisyr));
        System.out.println(Arrays.toString(staffLastyr));

    }
    
}
