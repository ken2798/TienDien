/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author tiencong
 */
public class Customer {
    private String code;
    private String usernName;
    private  String passWord;
    private String fullName;
    private String address;
    private String identityCard;
    private  String phoneNumber;
    
    public Customer(){
        
    }

    public Customer(String code, String usernName, String passWord, String fullName, String address, String identityCard, String phoneNumber) {
        this.code = code;
        this.usernName = usernName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.address = address;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
