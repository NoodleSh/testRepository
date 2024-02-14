package com.hw1.view;


import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름 입력: ");
        String name = sc.nextLine();


        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        System.out.print("성별 입력: ");
        char gender = sc.nextLine().charAt(0);

        this.lm.insertMenu(); // 일단 보류
        int menuCount;

        while (true){
            System.out.print("메뉴 선택: ");
            menuCount = sc.nextInt();
            switch (menuCount){
                case 1:
                    System.out.println("마이페이지");
                    this.lm.myInfo();
                    break;

                case 2:
                    System.out.println("도서 전체 조회");
                    selectAll();
                    break;

                case 3:
                    System.out.println("도서 검색");
                    searchBook();
                    break;

                case 4:
                    System.out.println("도서 전체 조회");
                    rentBook();
                    break;

                case 0:
                    System.out.println("프로그램 종료");
                    break;
                
                default:
                    System.out.println("다시 선택해주세요");
            }
            if(menuCount == 0){
                break;
            }
        }

        
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i = 0; i < bList.length; i++){
            System.out.print(i+"번 도서: " + bList + "/");
        }

    }

    public void searchBook(){
        System.out.println("검색할 제목 키워드: ");
        String keyword = sc.nextLine();
        Book[] searchList = new Book[] {lm.searchBook(keyword)};

        for(Book searchBookList : searchList){
            System.out.println(searchBookList);
        }
    }

    public void rentBook(){
        selectAll();

        System.out.println("대여할 도서 번호 선택: ");
        int bookNum = sc.nextInt();
        this.lm.rentBook(bookNum);

    }
}
