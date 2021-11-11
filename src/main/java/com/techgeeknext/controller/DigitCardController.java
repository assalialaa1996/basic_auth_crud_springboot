package com.techgeeknext.controller;
import com.techgeeknext.model.DigitCardDao;
import com.techgeeknext.model.UserDao;
import com.techgeeknext.service.DigitCardService;
import com.techgeeknext.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

@RestController
@CrossOrigin()
public class DigitCardController  {

    @Autowired
    private DigitCardService digitCardService;
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @RequestMapping(value = "/digit_cards/{id}", method = RequestMethod.POST)
    public String crateDigitCard(@PathVariable(value = "id") Long userId,@RequestBody DigitCardDao card) {
        DigitCardDao digitCardDto= new DigitCardDao();
        digitCardDto.setCardNumber(card.getCardNumber());
        Optional<UserDao> user= userDetailsService.findById(userId);
        digitCardDto.setUser(user.get());
        this.digitCardService.add(digitCardDto);
        return "card added successfully";
    }

    @RequestMapping(value = "/digit_cards/{id}", method = RequestMethod.GET)
    public Iterable<DigitCardDao> getUserDigitCards(@PathVariable(value = "id") Long userId) {
        Optional<UserDao> user= userDetailsService.findById(userId);
        Iterable<DigitCardDao> digitCardDaos= this.digitCardService.findByUser(user.get());
        return digitCardDaos;
    }

    @RequestMapping(value = "/digit_cards/{id}", method = RequestMethod.DELETE)
    public Map<String, Boolean> deleteDigitCard(@PathVariable(value = "id") Long cardId)

         {
             this.digitCardService.delete(cardId);
             Map<String, Boolean> response = new HashMap<>();
             response.put("deleted", Boolean.TRUE);
             return response;
        }





}