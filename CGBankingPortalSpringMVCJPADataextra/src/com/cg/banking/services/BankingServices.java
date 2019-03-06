package com.cg.banking.services;
import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServiceDownException;

public interface BankingServices 
{
      Account openAccount(Account account); 
      Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServiceDownException;
      List<Account> getAllAccountDetails() throws BankingServiceDownException;
     /*
      float depositAmount(long accountNo, float amount) throws AccountNotFoundException, BankingServiceDownException, AccountBlockedException;
      
      float withdrawAmount(long accountNo, float amount, long pinNumber) throws InsufficientAmountException, AccountNotFoundException,
      InvalidPinNumberException, BankingServiceDownException, AccountBlockedException;
      
      boolean fundTransfer(long accountNoTo, long accountNoFrom, float transferAmount,long pinNumber) throws InsufficientAmountException,
      AccountNotFoundException, InvalidPinNumberException, BankingServiceDownException, AccountBlockedException;
      
      Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServiceDownException;
      
      List<Account> getAllAccountDetails() throws BankingServiceDownException;
      
      
      public String accountStatus(long accountNo) throws BankingServiceDownException, AccountNotFoundException, AccountBlockedException;
*/
     
}
