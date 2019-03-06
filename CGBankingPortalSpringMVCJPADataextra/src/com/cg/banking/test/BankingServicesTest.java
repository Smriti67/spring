package com.cg.banking.test;

public class BankingServicesTest {
	
	/*
	 * Account account=new Account();
	 * 
	 * 
	 * private static BankingServices service;
	 * 
	 * @BeforeClass public static void setUpTestEnv() { service= new
	 * BankingServicesImpl(); }
	 * 
	 * @Before public void setUpTestData() {
	 * 
	 * Account account1 = new
	 * Account(101,201,"Savings","Active",1000.0f,account.transactions<Integer,
	 * Transaction>); Account account2 = new Account(
	 * 102,202,"Savings","Active",1000.0f, account.transactions);
	 * BankingDBUtil.account.put(account1.getAccountNo(), account1);
	 * BankingDBUtil.account.put(account2.getAccountNo(), account2);
	 * 
	 * BankingDBUtil.ACCOUNT_NO_COUNTER=102; }
	 * 
	 * @Test(expected= AccountNotFoundException.class) public void
	 * getAccountDetailsForInvalidData()throws InvalidAccountTypeException,
	 * AccountNotFoundException, BankingServiceDownException {
	 * service.getAccountDetails(458); }
	 * 
	 * @Test public void getAccountDetailsForValidData() throws
	 * InvalidAccountTypeException, BankingServiceDownException,
	 * AccountNotFoundException { Account expectedAccount= new
	 * Account(101,201,"Savings","Active",1000, account.transactions); Account
	 * actualAccount =service.getAccountDetails(101);
	 * Assert.assertEquals(expectedAccount, actualAccount); }
	 * 
	 * @Test(expected=AccountNotFoundException.class) public void
	 * testDepositForInvalidData() throws InvalidAccountTypeException,
	 * AccountNotFoundException, BankingServiceDownException{
	 * service.getAccountDetails(564); }
	 * 
	 * @Test public void testDepositForValidData() throws InvalidAmountException,
	 * AccountNotFoundException, InvalidAccountTypeException,
	 * AccountBlockedException, com.cg.banking.exceptions.AccountNotFoundException,
	 * BankingServiceDownException{ int expectedBalance =2000; int actualBalance=
	 * (int) service.depositAmount(101, 1000);
	 * Assert.assertEquals(expectedBalance,actualBalance); }
	 * 
	 * @Test public void testWithdrawForValidData() throws
	 * InsufficientAmountException, AccountNotFoundException,
	 * InvalidPinNumberException, BankingServiceDownException,
	 * AccountBlockedException { long expectedBalance =500; long actualBalance=
	 * (long)service.withdrawAmount(102, 500.0f, 202); assertEquals(expectedBalance,
	 * actualBalance); }
	 * 
	 * @Test(expected=AccountNotFoundException.class) public void
	 * testWithdrawForInvalidData() throws AccountNotFoundException,
	 * InvalidAccountTypeException, InvalidAmountException,
	 * InvalidPinNumberException, AccountBlockedException,
	 * InsufficientAmountException, AccountNotFoundException,
	 * BankingServiceDownException{ service.withdrawAmount(45667, 622555, 33346); }
	 * 
	 * @Test(expected=AccountNotFoundException.class) public void
	 * testFundTransferForInvalidData()throws AccountNotFoundException,
	 * InvalidAccountTypeException, InvalidAmountException,
	 * InvalidPinNumberException, AccountBlockedException,
	 * InvalidAccountTypeException, InsufficientAmountException,
	 * AccountNotFoundException, BankingServiceDownException{
	 * service.fundTransfer(402, 506, 5000, 208); }
	 * 
	 * @Test public void testfundTransferForvalidData() throws
	 * AccountNotFoundException, InvalidAccountTypeException,
	 * InvalidAmountException, InvalidPinNumberException, AccountBlockedException,
	 * InvalidAccountTypeException,
	 * InsufficientAmountException,AccountNotFoundException,
	 * BankingServiceDownException{ // int expectedWithdrawAccBal=500; // int
	 * actualWithdrawAccBal= (int)service.withdrawAmount(101, 500, 201); long
	 * expectedDepositAccBal =1500; long
	 * actualDepositAccBal=(long)service.depositAmount(102,500 ); //
	 * Assert.assertEquals(expectedWithdrawAccBal, actualWithdrawAccBal);
	 * Assert.assertEquals(expectedDepositAccBal, actualDepositAccBal); }
	 * 
	 * @After public void tearDownTestData() { BankingDBUtil.account.clear();
	 * BankingDBUtil.ACCOUNT_NO_COUNTER=100; }
	 */
	 
}
