package com.nullPointer.Domain.Model.Cards;
import com.nullPointer.Domain.Controller.MoneyController;
import com.nullPointer.Domain.Controller.PlayerController;
import com.nullPointer.Domain.Model.GameEngine;

public class CCPayHospitalBills extends CommunityChestCard {
	private MoneyController moneyController = MoneyController.getInstance();
	private PlayerController playerController = PlayerController.getInstance();
	
	private int hospitalBill = 100;

	public CCPayHospitalBills(String title, boolean isImmediate) {
		super(title, isImmediate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playCard(GameEngine gameEngine) {
		// TODO Auto-generated method stub
		moneyController.decreaseMoney(playerController.getCurrentPlayer(), hospitalBill);
		System.out.println(playerController.getCurrentPlayer().getName() + " lost " + hospitalBill + "$.");
	}

}
