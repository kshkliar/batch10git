package com.collection.class23.task1;

public class UserClassa {
    /*
    Write program: userClass  that has a constructor that initializes
    instance variable name and mobile number. Create a subclass  userInfo
    that will have user address variable and it also being initialized through
    constructor call. Print users name, mobile number and address in userDetails
    method. Test your code.
     */

    String name;
    String mobileNumber;

    UserClassa(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}