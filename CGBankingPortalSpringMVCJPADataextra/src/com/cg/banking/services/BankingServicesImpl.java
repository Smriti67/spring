package com.cg.banking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.banking.beans.Account;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServiceDownException;

@Component
public class BankingServicesImpl implements BankingServices
{
	@Autowired
	private AccountDAO accountDAO;
	
	@Override
	public Account openAccount(Account account)

	{
		account=accountDAO.save(account);
		return account;
	}

	  @Override
		public Account getAccountDetails(long accountNo) throws AccountNotFoundException {
			Account account=accountDAO.findById(accountNo).orElseThrow
					(()->new AccountNotFoundException("Not found"));
			if(account!=null)
				return account;
			throw new AccountNotFoundException("not found");
		}

	@Override
	public List<Account> getAllAccountDetails() throws BankingServiceDownException {
		
		return accountDAO.findAll();
	}

}
/*
	@Override                                     
	public float depositAmount(long accountNo, float amount)
			throws AccountNotFoundException, BankingServiceDownException, AccountBlockedException 
	{
		  Account account = accountDAO.findById(accountNo).orElseThrow
					(()->new AccountNotfoundException("Account not found associate Id"+accountNo));
		  if(account == null) 
			  throw new AccountNotFoundException("Account Not Found!"+ accountNo); 
		 
		float currentAmount =  account.getAccountBalance() + amount;
		account.setAccountBalance(currentAmount);
		Transaction transaction = new Transaction();
		
		transaction.setTransactionType(BankingDBUtil.getDEPOSIT_STATUS());
		transaction.setAmount(amount);
		transaction.setAccount(account);
		//account.transactions.put(BankingDBUtil.getTRANSACTION_ID(),transaction);
		this.accountDAO.update(account);
		transactionDAO.save(transaction);
		return currentAmount;
	}

	@Override
	public float withdrawAmount(long accountNo, float amount, long pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServiceDownException, AccountBlockedException {
		Account account = accountDAO.findById(accountNo).orElseThrow
				(()->new AccountNotfoundException("Account not found associate Id"+accountNo));;
		float newAmount =account.getAccountBalance();
		if(account == null)
			throw new AccountNotFoundException("Account Not Found!" + accountNo);

		getAccountDetails(accountNo);
		if(pinNumber == account.getPinNumber())
		{
			newAmount = account.getAccountBalance() - amount;
			account.setAccountBalance(newAmount);
			Transaction transaction = new Transaction();
			transaction.setTransactionType(BankingDBUtil.getWITHDRAW_STATUS());
			transaction.setAmount(newAmount);		
			transaction.setAccount(account);
			account.transactions.put(BankingDBUtil.getTRANSACTION_ID(),transaction);
			this.accountDAO.update(account);
			transactionDAO.save(transaction);
			return newAmount;
		}
			else if(pinNumber != account.getPinNumber())
		{
			count++;
			if(count % 4!=0)
			   throw new InvalidPinNumberException("Enter Valid Pin Number");
			if(count % 4 == 0)
			{
				account.setAccountStatus("Blocked");
				throw new AccountBlockedException("Sorry Your Account Has Been Blocked!");
			}
		float currentAmount = account.getAccountBalance();
		if(amount > currentAmount)
			throw new InsufficientAmountException("Insufficient Amount in the Account! " + accountNo);
		}
	return newAmount;
	}
	@Override
	public boolean fundTransfer(long accountNoTo, long accountNoFrom, float transferAmount, long pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServiceDownException, AccountBlockedException {
		Account account = accountDAO.findOne(accountNoFrom);
		withdrawAmount(accountNoFrom, transferAmount,pinNumber);
		getAccountDetails(accountNoTo);
		account = accountDAO.findOne(accountNoTo);
		depositAmount(accountNoTo,transferAmount);
		getAccountDetails(accountNoFrom);
		Transaction transaction = new Transaction();
		transaction.setTransactionType(BankingDBUtil.getFUND_TRANSFER_TRANSACTION_STATUS());
		transaction.setAmount(transferAmount);		
		transaction.setAccount(account);
		return true;
	}
  
   @Override
	public List<Account> getAllAccountDetails() throws BankingServiceDownException {
		return accountDAO.findAll();
	}

	
	@Override
	public String accountStatus(long accountNo)
			throws BankingServiceDownException, AccountNotFoundException, AccountBlockedException {
		Account account = accountDAO.findById(accountNo).orElseThrow
				(()->new AccountNotfoundException("Account not found account No"+accountNo));;
		return account.getAccountStatus();
	}*/

	


