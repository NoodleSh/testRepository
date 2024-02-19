package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.awt.print.Book;
import java.util.*;

public class BookManager {

     BookMenu bMenu = new BookMenu();
    private ArrayList<BookDTO> bookList;
    Scanner sc = new Scanner(System.in);

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        this.bookList.add(book);
    }

    public void deleteBook(int key) {
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getbNo() == key){
                bookList.remove(key);
            }else {
                System.out.println("존재하지 않는 번호입니다.");
            }
        }

    }

    public void searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.contains(title)) {
                System.out.println(bookList.get(i).getTitle());
            } else {
                System.out.println("조회된 도서가 목록에 없습니다.");
            }
        }
    }

    public void displayAll() {
        System.out.println("5. 전체 출력");

        if(bookList == null){
            System.out.println("비어있습니다.");
        }
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(i + "번 도서 : " + bookList.get(i));
        }
    }

    public List<BookDTO> sortedBookList(int type) {


        switch (type) {
            case 1:
                Comparator<BookDTO> ascNo = new AscBookNo();
                bookList.sort(ascNo);
                break;
            case 2:
                Comparator<BookDTO> ascTitle = new AscBookTitle();
                bookList.sort(ascTitle);
                break;
            case 3:
                Comparator<BookDTO> descNo = new DescBookNo();
                bookList.sort(descNo);
                break;
            case 4:
                Comparator<BookDTO> descTitle = new DescBookTitle();
                bookList.sort(descTitle);
                break;
        }

        return
    }
        public void printBookList (List < BookDTO > printList) {
            System.out.println("도서 정보 정렬 후 출력: " + bMenu.selectSortedBook());
        }

    }

