package com.cg.rechargeapplication.services;

import java.util.ArrayList;

import com.cg.rechargeapplication.bean.RechargeData;

public interface IRechargeServices {

	ArrayList<Integer> getAllPackName();

	int insertRechargeData(RechargeData rd);

	ArrayList<RechargeData> getAllRechargeDetails();

	boolean checkPackId(int pId);

	boolean checkMob_Id(long mob_no);

	boolean checkCouponCode(String couponCd);

}
