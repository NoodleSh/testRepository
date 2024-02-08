package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student[] students2 = {new Student("김민재",20,178.2,70.0,1,"정보시스템공학과"),
                               new Student("손흥민",21,187.3,80.0,2,"경영학과"),
                               new Student("이강인",23,167.0,45.0,4,"정보통신공학과")};



        students[0] = new Student("김민재",20,178.2,70.0,1,"정보시스템공학과");
        students[1] = new Student("손흥민",21,187.3,80.0,2,"경영학과");
        students[2] = new Student("이강인",23,167.0,45.0,4,"정보통신공학과");


        /* students */
        for(Student student: students ){
            System.out.println(student.getInformation());
        }

        /* students2 */
        for(Student student: students2 ){
            System.out.println(student.getInformation());
        }

        System.out.println();
        System.out.println("====================== 여기서부터 사원 출력 ===========================");


        Employee[] employees = new Employee[10];

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true){

        }
    }
}
