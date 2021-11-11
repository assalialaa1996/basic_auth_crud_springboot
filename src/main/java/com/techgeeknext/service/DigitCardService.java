package com.techgeeknext.service;

import com.techgeeknext.model.DigiCardDto;
import com.techgeeknext.model.DigitCardDao;
import com.techgeeknext.model.UserDao;
import com.techgeeknext.model.UserDto;
import com.techgeeknext.repository.DigitCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DigitCardService implements DigitCardRepository {
    @Autowired
    private  DigitCardRepository digitCardRepository;

    @Override
    public DigitCardDao findByCardNumber(String cardNumber) {
        return null;
    }

    public Iterable<DigitCardDao> findByUser(UserDao user){
        return this.digitCardRepository.findByUser(user);
    }
    public DigitCardDao save(DigiCardDto card){

        DigitCardDao digitCardDao= new DigitCardDao();
        digitCardDao.setCardNumber("42424242");
        return digitCardRepository.save(digitCardDao);

    }

    public DigitCardDao add(DigitCardDao card){


        return digitCardRepository.save(card);

    }

    public Iterable<DigitCardDao> findAll() {
        return digitCardRepository.findAll();
    }

    public void deleteById(Long integer) {
        this.digitCardRepository.deleteById(integer);
    }

    @Override
    public void delete(DigitCardDao digitCardDao) {

    }


    @Override
    public <S extends DigitCardDao> S save(S s) {
        return null;
    }

    @Override
    public <S extends DigitCardDao> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    public Optional<DigitCardDao> findById(Long integer) {
        return this.digitCardRepository.findById(integer);
    }

    @Override
    public boolean existsById(Long integer) {
        return false;
    }



    @Override
    public Iterable<DigitCardDao> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }





    public void delete(Long id) {
        this.digitCardRepository.deleteById(id);
    }

    @Override
    public void deleteAll(Iterable<? extends DigitCardDao> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
