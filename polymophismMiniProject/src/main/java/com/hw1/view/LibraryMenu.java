package com.hw1.view;


import com.hw1.model.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Arrays;
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
        char gender = sc.next().charAt(0);

        Member mem  = new Member();
//        this.lm.insertMenu(); // 일단 보류
        mem.setName(name);
        mem.setAge(age);
        mem.setGender(gender);

        lm.insertMember(new Member(mem.getName(), mem.getAge(), mem.getGender()));



        int menuCount;

        while (true){

            System.out.println();
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여");
            System.out.println("0. 프로그램 종료");
            System.out.println();

            System.out.print("메뉴 선택: ");
            menuCount = sc.nextInt();
            switch (menuCount){
                case 1:
                    System.out.println("마이페이지");
                    System.out.println(lm.myInfo());
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
                    System.out.println("도서 대여");
                    rentBook();
                    break;

                case 0:
                    System.out.println("프로그램 종료");
                    //break;
                    return; //바로 프로그램 종료
                
                default:
                    System.out.println("다시 선택해주세요");
                    break;
            }
//            if(menuCount == 0){
//                break;
//            }
        }
    }


    public void selectAll(){

        Book[] bList = lm.selectAll();

        for(int i = 0; i < bList.length; i++){
            System.out.print(i+"번 도서: " + bList[i] + "/");
            System.out.println();
        }

    }

    public void searchBook(){ // 입력부분 수정 필요..
        System.out.print("검색할 제목 키워드: ");
        String keyword = sc.nextLine();
        Book[]searchList = lm.searchBook(keyword);
        System.out.println();

        for(Book bk :searchList ){
                if(bk != null){
                    System.out.println(bk);
                }
            }
        }





    @Override
    public String toString() {
        return "LibraryMenu{" +
                "lm=" + lm +
                ", sc=" + sc +
                '}';
    }

    public void rentBook(){
        selectAll();

        System.out.println();
        System.out.println("대여할 도서 번호 선택: ");
        int bookNum = sc.nextInt();
        lm.rentBook(bookNum);// 리턴값 돌아올시 bookNum은 사라지고 rentBook의 반환값만 있다고 생각하면 편할듯
        int result = lm.rentBook(bookNum);

        // 0일 경우  “성공적으로 대여되었습니다.” 출력
        // 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
        // 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요” 출력


        // ???수정해야할듯
        if(result == 0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }else if(result == 2){
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급 되었습니다. 마이페이지를 통해 확인하세요");
        }



    }
}
