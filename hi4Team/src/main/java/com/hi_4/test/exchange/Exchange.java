package com.hi_4.test.exchange;

import java.io.IOException;
import java.util.Scanner;

public class Exchange {

    public void mainPage() {

        Money[] money = {new Usd(), new Eur(), new Aud()};


        for(int i = 0; i < money.length; i++) {
            System.out.println(money[i].toString());
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        int eventChk; // 이벤트 참여여부
        int exchangeChk; // 환전여부
        double randExchange; // 랜덤환율
        int exchangeValue;// 환전 종류
        double exchangeMoney; //환전 금액
        double exchangeReturn; //총 계산 금액



        while(true) {
            System.out.println("랜덤 추가 환율우대 이벤트를 진행 중입니다. 참여하시겠습니까?");
            System.out.print("1.예 2.아니오 : ");

            eventChk = sc.nextInt();

            /* 이벤트 참여 O*/
            try {
                if(eventChk == 1 ) {
                    randExchange =(Math.random()*5)+1;
                    System.out.println("축하드립니다. 환율 우대를 " + randExchange + "% 더 받고 환전을 진행하실 수 있습니다.");
                    System.out.print("이벤트에 참여 하셨습니다. 환전을 진행하시겠습니까?(1.예 2.아니오) : ");
                    exchangeChk = sc.nextInt();
                    if(exchangeChk == 1) {


                        System.out.print("환전 종류를 선택해주세요(1.미국달러 2.유로 3.호주달러) : ");
                        exchangeValue = sc.nextInt();

                        /* 미국 */
                        if(exchangeValue == 1) {
                            System.out.print("얼마를 환전하시겠습니까?: ");
                            exchangeMoney = sc.nextInt();

                            if(exchangeMoney < 5) {
                                exchangeMoney = 5;
                                System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                            }

                            if(exchangeMoney > money[0].getLimit()) {
                                exchangeMoney = money[0].getLimit();
                                System.out.println("미국 달러의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                                System.out.println("최대 금액으로 자동 입력 되었습니다.");
//										 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//										 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
                                exchangeReturn =  (exchangeMoney/(money[0].getNotified() + (money[0].getBuy() - money[0].getNotified()) * (1-(money[0].getRate()+randExchange))));

                                System.out.println(exchangeMoney + "만원을 " + ((money[0].getRate()+randExchange)) + "% 우대 받아 " + exchangeReturn + " 미국달러로 환전하였습니다.");
                                break;

                            }

//									환전금액이 한도보다 높지 않을때
                            exchangeReturn = (exchangeMoney/(money[0].getNotified() + (money[0].getBuy() - money[2].getNotified()) * (1-(money[0].getRate()+randExchange))));

                            System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate()+randExchange)) + "% 우대 받아 " + exchangeReturn + " 미국달러로 환전하였습니다.");
                            break;

                            /* 유로 */
                        }else if(exchangeValue == 2) {
                            System.out.print("얼마를 환전하시겠습니까?: ");
                            exchangeMoney = sc.nextInt();

                            if(exchangeMoney < 5) {
                                exchangeMoney = 5;
                                System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                            }

                            if(exchangeMoney > money[1].getLimit()) {
                                exchangeMoney = money[1].getLimit();
                                System.out.println("유로의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                                System.out.println("최대 금액으로 자동 입력 되었습니다.");
//										 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//										 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
//                                exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[1].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()+randExchange))));
                                exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[1].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()+randExchange))));

                                System.out.println(exchangeMoney + "만원을 " + ((money[1].getRate()+randExchange)) + "% 우대 받아 " + exchangeReturn + " 유로로 환전하였습니다.");
                                break;
                            }

//									환전금액이 한도보다 높지 않을때
//                            exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[2].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()+randExchange))));
                            exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[2].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()+randExchange))));
                            System.out.println(exchangeMoney + "만원을 " + ((money[1].getRate()+randExchange)) + "% 우대 받아 " + exchangeReturn + " 유로로 환전하였습니다.");
                            break;

                            /* 호주 */
                        }else if(exchangeValue == 3) {
                            System.out.print("얼마를 환전하시겠습니까?: ");
                            exchangeMoney = sc.nextInt();

                            if(exchangeMoney < 5) {
                                exchangeMoney = 5;
                                System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                            }

                            if(exchangeMoney > money[2].getLimit()) {
                                exchangeMoney =  money[0].getLimit();
                                System.out.println("호주 달러의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                                System.out.println("최대 금액으로 자동 입력 되었습니다.");
//										 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//										 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
                                exchangeReturn =  (exchangeMoney/(money[2].getNotified() + (money[2].getBuy() - money[2].getNotified()) * (1-(money[2].getRate()+randExchange))));

                                System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate()+randExchange)) + "% 우대 받아" + exchangeReturn + "호주달러로 환전하였습니다.");
                                break;
                            }
//									환전금액이 한도보다 높지 않을때
                            exchangeReturn = (exchangeMoney/(money[2].getNotified() + (money[2].getBuy() - money[2].getNotified()) * (1-(money[2].getRate()+randExchange))));
                            System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate()+randExchange)) + "% 우대 받아 " + exchangeReturn + " 호주달러로 환전하였습니다.");
                            break;


                        }else {
                            System.out.println("없는 환전 종류입니다. 다시 선택해주세요.");
                        }


                    }else if(exchangeChk == 2) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }else {
                        System.out.println("보기 중에서 선택해주세요.");
                    }

                }else if(eventChk == 2){
                    System.out.println("이벤트에 참여하지 않습니다.");

                }else {
                    System.out.println("보기 중에서 선택해주세요.");
                }

            }catch(Exception e){
                e.printStackTrace();
            }


            /* 이벤트 참여 X */
            System.out.print("환전을 진행하시겠습니까?(1.예 2.아니오) : ");
            exchangeChk = sc.nextInt();

            if(exchangeChk == 1) {
                System.out.print("환전 종류를 선택해주세요(1.미국달러 2.유로 3.호주달러) : ");
                exchangeValue = sc.nextInt();
                if(exchangeValue == 1) {
                    System.out.print("얼마를 환전하시겠습니까?: ");
                    exchangeMoney = sc.nextInt();

                    if(exchangeMoney < 5) {
                        exchangeMoney = 5;
                        System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                    }

                    if(exchangeMoney > money[0].getLimit()) {
                        exchangeMoney = money[0].getLimit();
                        System.out.println("호주 달러의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                        System.out.println("최대 금액으로 자동 입력 되었습니다.");
//							 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//							 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
                        exchangeReturn = (exchangeMoney/(money[0].getNotified() + (money[0].getBuy() - money[0].getNotified()) * (1-(money[0].getRate()))));

                        System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate())) + "% 우대 받아 " + exchangeReturn + " 미국달러로 환전하였습니다.");
                        break;
                    }

                    //						환전금액이 한도보다 높지 않을때
                    exchangeReturn = (exchangeMoney/(money[0].getNotified() + (money[0].getBuy() - money[2].getNotified()) * (1-(money[0].getRate()))));

                    System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate())) + "% 우대 받아 " + exchangeReturn + " 미국달러로 환전하였습니다.");
                    break;

                }else if(exchangeValue == 2) {
                    System.out.print("얼마를 환전하시겠습니까?: ");
                    exchangeMoney = sc.nextInt();

                    if(exchangeMoney < 5) {
                        exchangeMoney = 5;
                        System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                    }

                    if(exchangeMoney > money[2].getLimit()) {
                        exchangeMoney = money[0].getLimit();
                        System.out.println("호주 달러의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                        System.out.println("최대 금액으로 자동 입력 되었습니다.");
//							 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//							 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
                        exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[1].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()))));

                        System.out.println(exchangeMoney + "만원을 " + ((money[1].getRate())) + "% 우대 받아 " + exchangeReturn + " 유로로 환전하였습니다.");
                        break;
                    }
                    //						환전금액이 한도보다 높지 않을때
                    exchangeReturn = (exchangeMoney/(money[1].getNotified() + (money[1].getBuy() - money[1].getNotified()) * (1-(money[1].getRate()))));

                    System.out.println(exchangeMoney + "만원을 " + ((money[1].getRate())) + "% 우대 받아 " + exchangeReturn + " 유로로 환전하였습니다.");
                    break;


                }else if(exchangeValue == 3) {
                    System.out.print("얼마를 환전하시겠습니까?: ");
                    exchangeMoney = sc.nextInt();

                    if(exchangeMoney < 5) {
                        exchangeMoney = 5;
                        System.out.println("최소 환전 금액은 " + exchangeMoney + "만원 입니다.");
                    }
                    if(exchangeMoney > money[2].getLimit()) {
                        exchangeMoney = money[0].getLimit();
                        System.out.println("호주 달러의 일일한도는 "+ exchangeMoney +"만원 입니다.");
                        System.out.println("최대 금액으로 자동 입력 되었습니다.");
//							 (환전 종류 선택 > 환전금액 입력: 최소 5만원에서 최대 일일한도 금액까지 > 환전계산)
//							 환전 계산 방법 : 환전금액/(고시환율 + (살때환율 - 고시환율)*(1 - 우대이율)) // (최종 환전 금액은 소수점 절삭)
//
                        exchangeReturn =  (exchangeMoney/(money[2].getNotified() + (money[2].getBuy() - money[2].getNotified()) * (1-(money[2].getRate()))));

                        System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate())) + "% 우대 받아 " +(int) exchangeReturn + " 호주달러로 환전하였습니다.");
                        break;
                    }

                    //						환전금액이 한도보다 높지 않을때
                    exchangeReturn = (exchangeMoney/(money[2].getNotified() + (money[2].getBuy() - money[1].getNotified()) * (1-(money[2].getRate()))));

                    System.out.println(exchangeMoney + "만원을 " + ((money[2].getRate())) + "% 우대 받아 " +(int) exchangeReturn + " 호주 달러로 환전하였습니다.");
                    break;

                }

            }else if(exchangeChk == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("보기 중에서 골라주세요.");
            }



        }
    }
}