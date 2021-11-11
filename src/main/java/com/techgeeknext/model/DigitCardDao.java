package com.techgeeknext.model;

import javax.persistence.*;

@Entity
@Table(name = "digit_card")
public class DigitCardDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column
    private String cardNumber;

    public UserDao getUser() {
        return user;
    }

    public void setUser(UserDao user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "user_id", nullable = true)
    private UserDao user;



    public DigitCardDao() {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
