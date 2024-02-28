package com.hi_4.test.bakejun;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Speed_AplusB {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            int num = Integer.parseInt(br.readLine()); // 횟수 입력

            StringTokenizer str; //문자열을 토큰화 시키기 위해 선언

            System.out.println("반복할 횟수: " + num);


            for(int i = 0; i <num; i++) {
                str = new StringTokenizer(br.readLine()," "); 
                bw.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
                //문자열
            }

            br.close();

            bw.flush();
            bw.close();

    }
}
