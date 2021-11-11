package com.techgeeknext.repository;


import com.techgeeknext.model.DigitCardDao;
import com.techgeeknext.model.UserDao;
import org.springframework.data.repository.CrudRepository;

public interface DigitCardRepository extends CrudRepository<DigitCardDao, Long> {
    DigitCardDao findByCardNumber(String cardNumber);
    Iterable<DigitCardDao> findByUser(UserDao user);
}