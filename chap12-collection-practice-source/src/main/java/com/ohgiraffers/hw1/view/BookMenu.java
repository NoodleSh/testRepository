package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private BookManager bm  = new BookManager();
    Scanner sc = new Scanner(System.in);
    int menu;

    public BookMenu() {

    }

    public void mainMenu(){
        System.out.println();
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서 정보 정렬 후 출력");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 검색 출력");
        System.out.println("5. 전체 출력");
        System.out.println("6. 끝내기");
        System.out.println();


        while(true){
            System.out.print("메뉴입력: ");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    inputBook();
                    break;
                case 2:
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(inputBookNo());
                    break;
                case 4:
                    bm.searchBook(inputBookTitle());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 다시 입력해 주세요.");
                    break;
            }
        }



    }


    public BookDTO inputBook(){
        System.out.println("1. 새 도서 추가");
//        System.out.println("도서번호 : ");
//        int bNo = sc.nextInt();

        System.out.print("카테고리(1. 인문 / 2. 자연과학 / 3. 의로 / 4. 기타) : ");
        int category = sc.nextInt();

        System.out.print("도서 제목 : ");
        String title = sc.next();

        System.out.print("작가 : ");
        String author = sc.next();

//        bm.addBook(new BookDTO(category, title, author));
        BookDTO inputBookInfo = new BookDTO(category, title, author);
        return inputBookInfo;
    }

    public int inputBookNo(){
        System.out.println("3. 도서 삭제");
        System.out.print("도서번호(ISBN): ");
        int bookNum = sc.nextInt();
        return bookNum;
    }

    public String inputBookTitle(){
        System.out.println("4. 도서 검색 출력");
        System.out.print("도서 제목 : ");
        String title = sc.next();
        return title;
    }

    public List<BookDTO> selectSortedBook(){
        System.out.println("2. 도서 정보 정렬 후 출력");

        System.out.println();
        System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정렬");
        System.out.println();

        System.out.print("도서 정렬 방식 선택:");
        int sortNum = sc.nextInt();
        List<BookDTO> sortBno = new ArrayList<>(sortNum); //리스트 객체 생성후 정렬 번호를 생성해서 반환



        //수정 필요..
        if(sortNum == 1){
            bm.sortedBookList(sortNum);
        }else if(sortNum == 2){
            bm.sortedBookList(sortNum);
        }else if(sortNum == 3){
            bm.sortedBookList(sortNum);
        }else if(sortNum == 4){
            bm.sortedBookList(sortNum);
        }
        
        //2번 메뉴에서 리턴값 필요
        return sortBno;
    }

}
