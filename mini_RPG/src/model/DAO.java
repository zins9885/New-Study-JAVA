package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
   // ojdbc 파일 연동해주기 (build path 경로 :C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id ="service";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url,db_id,db_pw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();}
		
	}
	private void getClose() {
		
		try {
		if(rs!=null) {
		   rs.close();	
		}
		if(psmt!=null) {
			psmt.close();
		}
		if(conn!=null) {
			conn.close();
		}
	 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    // 활 정보를 전부 가져오는 메서드
	public ArrayList<ItemVo> BowchekAll(){
		ArrayList<ItemVo> BowList = new ArrayList<>();
		
		connect();
		try {
		String sql = "select * from Bow";
		psmt = conn.prepareStatement(sql);
		rs=psmt.executeQuery();
		//rs의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인한다. 
		while(rs.next()) {
			BowVo item = new BowVo(0,null,0,0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			item.setDurability(rs.getInt(4));
			BowList.add(item); // 업캐스팅 = > BowVO는 ItemVo보다 아래있지만 업캐스팅 해서 해당 ArrayList에 들어갈수있다. 
		}
		getClose();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
			 return BowList;
		}

	// 칼 정보를 전부 가져오는 메서드
    public ArrayList<ItemVo> SwordcheckAll(){
	 ArrayList<ItemVo> = new ArrayList<>();
	 connect();
	 
	try {
	 String sql="select*from Sword";
	 psmt = conn.prepareStatement(sql);
	 rs = psmt.executeQuery();
	 
	 while(rs.next())
		 SwordVo item = new SwordVO(0,null,0);
	         item.setItemNum(rs.getInt(1));
	         item.setName(rs.getString(2));
	         item.setAttackPower(rs.getInt(3));
	         SwordList.add(item);
	 
	 
 }
	
	
	 
	}



	