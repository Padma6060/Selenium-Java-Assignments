package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {

        List<Integer> NumberList = new ArrayList<>();
        System.out.println("The numbers list is:"+ NumberList);
        NumberList.add(3);
        NumberList.add(2);
        NumberList.add(11);
        NumberList.add(4);
        NumberList.add(6);
        NumberList.add(7);
        System.out.println("The numbers list is:"+ NumberList);
        Collections.sort(NumberList);
        System.out.println("The sorted number list is:"+ NumberList);
        int secondLargestNumber = NumberList.get(NumberList.size() - 2);
        System.out.println("The second largest number in list is:"+secondLargestNumber );

        }
       }


