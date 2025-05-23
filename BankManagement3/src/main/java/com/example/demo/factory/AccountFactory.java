package com.example.demo.factory;

import com.example.demo.service.AccountsServiceInterface;
import com.example.demo.service.CurrentAccountServiceImpl;
import com.example.demo.service.SavingAccountServiceImpl;

public class AccountFactory {

	public static AccountsServiceInterface getIntance(String accType) {
		if (accType.equals("savingaccount"))
			return new SavingAccountServiceImpl();
		if (accType.equals("currentaccount"))
			return new CurrentAccountServiceImpl();
		return null;

	}

}
