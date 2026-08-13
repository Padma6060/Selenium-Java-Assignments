package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElements {

    public static void main(String[] args) {

    List<String> ElementsList = new ArrayList<String> ();
    ElementsList.add("HCL");
    ElementsList.add("Wipro");
    ElementsList.add("Aspire systems");
    ElementsList.add("CTS");
    System.out.println("The elements list is :"+ ElementsList);
    Collections.sort(ElementsList);
    int sizeOfList = ElementsList.size();
    for(int i=sizeOfList-1; i>=0; i--) {
        System.out.println(ElementsList.get(i));
    }

        
    }

   

    

}
