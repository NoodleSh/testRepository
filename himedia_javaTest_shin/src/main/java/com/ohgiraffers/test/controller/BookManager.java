package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.comparator.AscCategory;
import com.ohgiraffers.test.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    /* Controller */
    ArrayList<BookDTO> bookList;
    public BookManager(){
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book){
        bookList.add(book);
    }

    public void deleteBook(int index){
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getbNo() == index){
                bookList.remove(i);
            }
        }
        System.out.println(bookList.get(index) + "를 삭제 했습니다");
    }

    
    /* 도서 검색*/
    public int searchBook(String bTittle){
        int result = 0;
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(bTittle)){
                System.out.println("검색한 도서: "+bookList.get(i));
                result = 1;
            }else{
                System.out.println("도서가 없네요");
                result = 0;
            }
        }
        return result;
    }

    
    /* 선택한 도서 목록 조회 */
    public void printBook(int index){
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getbNo() == index){
                System.out.println(i + "번째 도서: " + bookList.get(i));
                break;
            }else{
                System.out.println("도서 정보가 존재하지 않습니다.");
                break;
            }
        }

    }

    /* 도서 목록 전체 출력 */
    public void displayAll() {
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i) != null){
                System.out.println("도서 목록: " + bookList.get(i));
            }else{
                System.out.println("도서 목록이 없네요..?");
            }
        }
    }
    
    /* 도서 정렬 조회 */
    public ArrayList<BookDTO> sortedBook(int select) {

        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getbNo() > select){
                Comparator<BookDTO> ascCategory = new AscCategory();
                bookList.sort(ascCategory);
                System.out.println(bookList.get(i));
            }else{
                Comparator<BookDTO> descCategory = new DescCategory();
                bookList.sort(descCategory);
                System.out.println(bookList.get(i));
            }


        }
            return bookList;
    }

    
    /* 향상된 for문 출력*/
    public void printBookList(ArrayList<BookDTO>index){
            for(BookDTO printBookList : index){
                System.out.println("도서 목록:" + printBookList);
            }
    }
}
