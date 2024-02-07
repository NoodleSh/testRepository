package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    // 부모클래스 보다 자식클래스를 구체화
    
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;
    
    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출함");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스 모든 필드를 초기화 하는 생성자 호출함");
    }

    
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
//        this(cpu, hdd, ram, operationSystem); // super()와 this()는 동시에 사용 불가능
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스 부모 필드도 초기화하는 생성자 호출함");
    }


    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }


    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }


    public String getOperationSystem() {
        return operationSystem;
    }
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation(){
        return super.getInformation()
                //하나씩 불러오기 위해선 super.getter메소드로 호출
                //this를 사용할 경우 자기 자신을 계속해서 호출하기 때문에 StackOverFlow발생
                + "Computer [ cpu = "
                + this.cpu + ", hdd = "
                + this.hdd + ",ram = "
                + this.ram + ", operationSystem = "
                + this.operationSystem
                +"]";

    }


}
