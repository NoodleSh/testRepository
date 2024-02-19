package com.ohgiraffers.test.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    /* comparator */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result;

        if(o1.getCategory() > o2.getCategory()){
            result = 1;
        }else if(o1.getCategory() < o2.getCategory()){
            result = -1;
        }else{
            result = 0;
        }
        return result;
    }
}
