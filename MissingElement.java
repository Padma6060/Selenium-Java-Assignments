package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

    public static void main(String[] args) {
        
        List<Integer> NumList = new ArrayList<>();
        NumList.add(1);
        NumList.add(2);
        NumList.add(3);
        NumList.add(4);
        NumList.add(10);
        NumList.add(6);
        NumList.add(8);
        Collections.sort(NumList);
        System.out.println("The missing number is: ");
        int sizeOfList = NumList.size();
        for(int i=0; i<sizeOfList-1; i++) {
            int currentNum = NumList.get(i);
            int nextNum = NumList.get(i+1);
            if( currentNum + 1 != nextNum) {
                for (int j= currentNum+1; j< nextNum; j++) {
                    System.out.println(j);
                }
            }
        }

        


    }

}
