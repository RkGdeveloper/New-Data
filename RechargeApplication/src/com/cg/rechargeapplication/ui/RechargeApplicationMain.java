package com.cg.rechargeapplication.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.rechargeapplication.bean.RechargeData;
import com.cg.rechargeapplication.services.IRechargeServices;
import com.cg.rechargeapplication.services.RechargeServicesImpl;

public class RechargeApplicationMain {
	
	
	public static void main(String[] args) {
		RechargeApplicationMain rm =  new RechargeApplicationMain();
		
		rm.getOperations();
		
	}
	Scanner sc = new Scanner(System.in);
	void getOperations()
	{
		while(true)
		{
		System.out.println("Enter your Choice\n===================="
				+ "\n1.Recharge"
				+ "\n2.View All Recharge Data"
				+ "\n3.Exit");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1: 
			getRecharge();
			break;
		case 2:
			viewAllRechargeData();
			break;
		case 3:
		{
			System.out.println("Thank You .... Visit Again...");
			System.exit(0);
		}
		}
		}
	}
	
	
	IRechargeServices irs = new RechargeServicesImpl();
	
	private void viewAllRechargeData() {
		ArrayList<RechargeData> rechData = new ArrayList<RechargeData>();
		rechData = irs.getAllRechargeDetails();
		for(RechargeData re : rechData){
			System.out.println(re);
		}
	}
	
	
	private void getRecharge() {
		ArrayList<Integer> packId = new ArrayList<Integer>();
		packId = irs.getAllPackName();
		
		RechargeData rd = new RechargeData();
		
		System.out.println("Select any Pack from this "+packId);
		int pId = sc.nextInt();
		if(irs.checkPackId(pId))
		{
		rd.setRechId(pId);		
			System.out.println("Enter Your Mobile Number : ");
			long mob_no = sc.nextLong();
			if(irs.checkMob_Id(mob_no))
			{
				rd.setMobileNo(mob_no);				
				sc.nextLine();
				System.out.println("Enter Coupon Code : ");
				String couponCd = sc.nextLine();
				if(irs.checkCouponCode(couponCd))
				{
					rd.setCouponCode(couponCd);			
					int res = irs.insertRechargeData(rd);
					System.out.println(res+" row inserted");
				}
			}
		}
	}
}