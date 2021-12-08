package com.collection.class23.task1;

public class UserInfoa extends UserClassa {
    String address;

    UserInfoa(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void userDetails() {
        System.out.println(name + " " + mobileNumber + " " + address);
    }

    public static void main(String[] args) {
        UserInfoa userInfo = new
                UserInfoa("Masoud", "13546", "afkabf");
        userInfo.userDetails();
    }
}