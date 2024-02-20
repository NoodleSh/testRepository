package com.hi_4.test.teamGame;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
public class Application {
            public static void main(String[] args) {
                Map<String, String[]> members = new HashMap<>();
                members.put("1조", new String[]{"A", "B", "C", "D"});
                members.put("2조", new String[]{"E", "F", "G", "H"});

                String[] team1Members = members.get("1조");
                String[] team2Members = members.get("2조");

                String player1 = getRandomMember(team1Members);
                String player2 = getRandomMember(team2Members);

                System.out.println("대결할 선수는 " + player1 + "와 " + player2 + "입니다");

                String winner = playGame(player1, player2);

                System.out.println(winner + "가 이겼습니다");
            }

            private static String getRandomMember(String[] teamMembers) {
                return teamMembers[new Random().nextInt(teamMembers.length)];
            }

            private static String playGame(String player1, String player2) {
                if (player1.equals(player2)) {
                    return "무승부";
                } else if ((player1.equals("가위") && player2.equals("보")) ||
                        (player1.equals("바위") && player2.equals("가위")) ||
                        (player1.equals("보") && player2.equals("바위"))) {
                    return player1;
                } else {
                    return player2;
                }
            }
        }

