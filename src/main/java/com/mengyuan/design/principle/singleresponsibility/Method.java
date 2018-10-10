package com.mengyuan.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address){
        userName = "mengyuan";
        address = "nanning";
    }

    private void updateUserInfo(String userName, String ...properties){
        userName = "mengyuan";
    }

    private void updateUsername(String userName){
        userName = "mengyuan";
    }

    private void updateUserAddress(String address){
        address = "nanning";
    }

    private void updateUserInfo(String userName, String address, boolean bool){

        if (bool){
            // todo something1
        }else {
            // TODO something2
        }

        userName = "mengyuan";
        address = "nanning";
    }
}
