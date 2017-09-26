package com.cg.rechargeapplication.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.rechargeapplication.bean.RechargeData;
import com.cg.rechargeapplication.dbconfig.DbUtil;

public class RechargeDAOImpl implements IRechargeDAO{
	ArrayList<Integer> packName ;
	
	@Override
	public ArrayList<Integer> getAllPackName() {
		// TODO Auto-generated method stub
	Connection con;
	try {
		
	packName = new ArrayList<Integer>();
		con = DbUtil.getConnection();
	
	Statement st = con.createStatement();
		
	ResultSet rs = st.executeQuery("Select recharge_Id from recharge");
	while(rs.next())
	{
		packName.add(rs.getInt(1));
	}
	
	} catch (IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return packName;
	}

	@Override
	public int insertRechargeDetails(RechargeData rd) {
	
		int res = 0;
	Connection con;

	try {
		con = DbUtil.getConnection();
		String sql = "Insert into rechargeTransactions values(rech_seq.nextval,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, rd.getRechId());
		pst.setLong(2, rd.getMobileNo());
		pst.setString(3, rd.getCouponCode());
		res = pst.executeUpdate();
	} catch (IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	return res;
			
	}

	@Override
	public ArrayList<RechargeData> getAllRechargeDetails() {
		ArrayList<RechargeData> rechData = new ArrayList<RechargeData>();
		RechargeData rd;
		
		Connection con;
		try {
			con = DbUtil.getConnection();
		
		String sql = "Select * from rechargeTransactions";
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			rd= new RechargeData();
			rd.setRechTransId(rs.getInt(1));
			rd.setRechId(rs.getInt(2));
			rd.setMobileNo(rs.getLong(3));
			rd.setCouponCode(rs.getString(4));
			rechData.add(rd);
		}
		
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rechData;
	}

}
