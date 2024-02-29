package com.ohgiraffers.model.dto;

public class MenuDTO implements java.io.Serializable{

    private String menuName;
    private int menuPirce;
    private int categoryCode;
    private int menuCode;
    private String orderableStatus;

    public MenuDTO(){

    }

    public MenuDTO(String menuName, int menuPirce, int categoryCode, int menuCode, String orderableStatus) {
        this.menuName = menuName;
        this.menuPirce = menuPirce;
        this.categoryCode = categoryCode;
        this.menuCode = menuCode;
        this.orderableStatus = orderableStatus;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPirce() {
        return menuPirce;
    }

    public void setMenuPirce(int menuPirce) {
        this.menuPirce = menuPirce;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuName='" + menuName + '\'' +
                ", menuPirce=" + menuPirce +
                ", categoryCode=" + categoryCode +
                ", menuCode=" + menuCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
