package com.techgeeknext.repository;


import com.techgeeknext.model.DigitCardDao;
import org.springframework.data.repository.CrudRepository;

public interface DigitCardRepository extends CrudRepository<DigitCardDao, Long> {
    DigitCardDao findByCardNumber(String cardNumber);
}