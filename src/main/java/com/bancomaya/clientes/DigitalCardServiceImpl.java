package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.DigitalCard;

@WebService(endpointInterface = "com.bancomaya.clientes.DigitalCardService")
public class DigitalCardServiceImpl implements DigitalCardService{
	
	private static List<DigitalCard> cards = new ArrayList<>();
	@Override
	public DigitalCard createDigitalCard(DigitalCard card) {
		card.setId(cards.size() + 1);
		cards.add(card);
		return card;
	}

	@Override
	public List<DigitalCard> getDigitalCard() {
		
		return cards;
	}

	@Override
	public DigitalCard getCardNumber(String cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DigitalCard getCustomerNumber(String customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
