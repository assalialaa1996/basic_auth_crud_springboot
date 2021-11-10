package com.techgeeknext.controller;
import com.techgeeknext.model.DigiCardDto;
import com.techgeeknext.model.DigitCardDao;
import com.techgeeknext.service.DigitCardService;
import com.techgeeknext.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin()
public class DigitCardController  {

    @Autowired
    private DigitCardService digitCardService;

    @RequestMapping(value = "/digit_cards", method = RequestMethod.POST)
    public String crateDigitCard(@RequestBody DigitCardDao card) {
        DigitCardDao digitCardDto= new DigitCardDao();
        digitCardDto.setCardNumber(card.getCardNumber());
        this.digitCardService.add(digitCardDto);
        return "card added successfully";
    }

    @RequestMapping(value = "/digit_cards", method = RequestMethod.GET)
    public Iterable<DigitCardDao> getDigitCards() {

        Iterable<DigitCardDao> digitCardDaos= this.digitCardService.findAll();
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

    @RequestMapping(value = "/digit_cards/{id}", method = RequestMethod.PUT)
    public Map<String, Boolean> updateDigitCard(@PathVariable(value = "id") Long cardId)
    {
        this.digitCardService.delete(cardId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }



}