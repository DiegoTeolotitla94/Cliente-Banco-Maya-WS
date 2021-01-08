package com.bancomaya.clientes;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.DigitalCard;

@WebService
public interface DigitalCardService {
	DigitalCard createDigitalCard(DigitalCard card);
	List<DigitalCard> getDigitalCard();
	DigitalCard getCardNumber(String cardNumber);
	DigitalCard getCustomerNumber(String customerNumber);

}
