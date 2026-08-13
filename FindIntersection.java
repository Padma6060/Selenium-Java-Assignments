package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

    public static void main(String[] args) {
        
        List<Integer> NumberList1 = new ArrayList<>();
        NumberList1.add(3);
        NumberList1.add(2);
        NumberList1.add(11);
        NumberList1.add(4);
        NumberList1.add(6);
        NumberList1.add(7);
        System.out.println("The first numbers list is:"+ NumberList1);
        List<Integer> NumberList2 = new ArrayList<>();
        NumberList2.add(1);
        NumberList2.add(2);
        NumberList2.add(8);
        NumberList2.add(4);
        NumberList2.add(9);
        NumberList2.add(7);
        System.out.println("The second numbers list is:"+ NumberList2);
        int sizeOfList1 = NumberList1.size();
        for(int i=0; i<sizeOfList1; i++) {
            if(NumberList2.contains(NumberList1.get(i))) {
                System.out.println(NumberList1.get(i));
            }
        }
        

       

    }

    

}
