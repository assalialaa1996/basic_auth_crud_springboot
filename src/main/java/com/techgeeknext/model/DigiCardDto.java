package com.techgeeknext.model;

public class DigiCardDto {

    private String cardNumber;
    private  UserDto user;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public DigiCardDto() {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
