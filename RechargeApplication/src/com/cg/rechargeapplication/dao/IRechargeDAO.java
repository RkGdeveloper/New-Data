package com.cg.rechargeapplication.dao;

import java.util.ArrayList;

import com.cg.rechargeapplication.bean.RechargeData;

public interface IRechargeDAO {

	ArrayList<Integer> getAllPackName();

	int insertRechargeDetails(RechargeData rd);

	ArrayList<RechargeData> getAllRechargeDetails();

}
