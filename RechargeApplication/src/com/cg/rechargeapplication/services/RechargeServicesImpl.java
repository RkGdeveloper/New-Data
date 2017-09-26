package com.cg.rechargeapplication.services;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.rechargeapplication.bean.RechargeData;
import com.cg.rechargeapplication.dao.IRechargeDAO;
import com.cg.rechargeapplication.dao.RechargeDAOImpl;

public class RechargeServicesImpl implements IRechargeServices{

	IRechargeDAO ird = new RechargeDAOImpl();
	ArrayList<Integer> packIds;
	
	@Override
	public ArrayList<Integer> getAllPackName() {
		packIds = new ArrayList<Integer>();
		
		packIds = ird.getAllPackName();
		return packIds;
	}


	@Override
	public int insertRechargeData(RechargeData rd) {
		return ird.insertRechargeDetails(rd);
	}


	@Override
	public ArrayList<RechargeData> getAllRechargeDetails() {
		return ird.getAllRechargeDetails();
	}


	@Override
	public boolean checkPackId(int pId) {
		if(packIds.contains(pId))
			return true;
		else{
		System.out.println("pId does not Exist in database");
		return false;
		}
	}


	@Override
	public boolean checkMob_Id(long mob_no) {
		String input = String.valueOf(mob_no);
		String pat = "[789]{1}[0-9]{9}";
		if(Pattern.matches(pat, input)){
			return true;
		}
		else{
				System.out.println("Mobile number must be 10 digits");
			return false;
		}
	}


	@Override
	public boolean checkCouponCode(String couponCd) {
		String pat = "T10";
		if(pat.equals(couponCd)){
			return true;
		}
		else
		{
			System.out.println("Coupon code must be T10");
		return false;
		}
	}

}
