package Oop;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String [] spareParts=new String[]{"Tires","keys"};
        ObjectWorld toyota=new ObjectWorld("Toyata", 11000, 2023, null, spareParts);
        ObjectWorld bmw=new ObjectWorld("BMW", 13000, 12030, "White", spareParts);
        spareParts[0]="window";
        System.out.println(Arrays.toString(toyota.getParts()));

    }
}
