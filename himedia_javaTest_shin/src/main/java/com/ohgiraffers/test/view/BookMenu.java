package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
/* view */
    BookManager bm = new BookManager();
    Scanner sc = new Scanner(System.in);
    int menu;
    public BookMenu(){

    }

    public void menu(){





        while(true){

            System.out.println("\n1. 도서 추가");
            System.out.println("2.도서 삭제");
            System.out.println("3.도서 검색");
            System.out.println("4.입력한 도서 정보 출력 ");
            System.out.println("5.도서 전체 출력 ");
            System.out.println("6.도서 정렬 조회 ");
            System.out.println("7.도서 향상된 전체 조회\n");

            System.out.print("메뉴 선택: ");
            menu = sc.nextInt();


            switch (menu){
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.deleteBook(inputBook().getbNo());
                    break;
                case 3:
                    bm.searchBook(inputBookTitle());
                    break;
                case 4:
                    bm.printBook(inputBook().getbNo());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    bm.sortedBook(inputBook().getbNo());
                    break;
                case 7:
                    ArrayList<BookDTO> bookNo;
                    bookNo = new ArrayList<>(inputBook().getbNo());
                    bm.printBookList(bookNo);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 다시 입력해주세요");
                    break;


            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호: ");
        int bNo = sc.nextInt();
        System.out.println("도서 카테고리 ");
        System.out.print("1.인문 / 2.자연과학/ 3.의료 / 4.기타 : ");
        int bCategory = sc.nextInt();
        System.out.print("도서 제목: ");
        String bTitle = sc.next();
        System.out.print("도서 작가: ");
        String bAuthor = sc.next();

        BookDTO insertBook = new BookDTO(bNo, bCategory, bTitle, bAuthor);

        return insertBook;
        
    }

    public String inputBookTitle(){
        System.out.print("도서 제목: ");
        String bTitle = sc.next();

        return bTitle;
    }
}
