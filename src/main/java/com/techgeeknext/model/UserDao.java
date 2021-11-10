package com.techgeeknext.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "user")
public class UserDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;



    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<DigitCardDao> digitCards;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<DigitCardDao> getDigitCards() {
        return digitCards;
    }

    public void setDigitCards(Set<DigitCardDao> digitCards) {
        this.digitCards = digitCards;
    }

}

