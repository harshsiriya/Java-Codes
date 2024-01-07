package com.company;

import javax.lang.model.element.Element;

public class exe07_pp03_calculateAverageMarks {
    public static void main(String[] args) {
        int [] marks = {99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80};
        float average = 0;
        int total =0 ;
        for(int Element : marks){
            total += Element;
        }
        average = total / marks.length;
        System.out.println(average);
    }
    
}
