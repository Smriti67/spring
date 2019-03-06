package com.cg.banking.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;
import com.cg.banking.beans.Account;
public class BankingDBUtil
{
	/*public static HashMap<Long, Account> account = new HashMap<>();
	static private int n = 9999-1000;
	public static int ACCOUNT_NO_COUNTER = 100000;
	
    static Random transactionID = new Random();
    static Random pin = new Random();
    public static int pinNumber = pin.nextInt(9999)%n;
    public static int transactionId = transactionID.nextInt(9999)%n;*/
	static private int n = 9999-1000;
	static Random rand = new Random();
	static Random pin = new Random();
	public static int pinNumber = pin.nextInt(9999)%n;
	public static int ACCOUNT_NO_COUNTER = 100000;
	public static int TRANSACTION_ID=5000;
    public static String accountStatus = "Active";
    public static String depositTransaction = "Amount Deposited";
    public static String withdrawTransaction = "Amount Withdrawn";
    public static String fundTransferTransaction = "Fund Transferred";

	/*
	 * public static int getACCOUNT_NO_COUNTER() { return ++ACCOUNT_NO_COUNTER; }
	 */
    public static int getPIN_NUMBER()
    {
    	return ++pinNumber;
    }

	
    public static int getTRANSACTION_ID() 
    { 
    	return ++TRANSACTION_ID; 
    }
	 
    public static String getACCOUNT_STATUS()
    {
    	return accountStatus;
    }
    public static String getDEPOSIT_STATUS()
    {
    	return depositTransaction;
    }
    public static String getWITHDRAW_STATUS()
    {
    	return withdrawTransaction;
    }
    public static String getFUND_TRANSFER_TRANSACTION_STATUS()
    {
    	return fundTransferTransaction;
    } 
    
    
}
