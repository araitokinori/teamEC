package com.internousdev.red.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.red.dto.DestinationInfoDTO;
import com.internousdev.red.util.DBConnector;

public class DestinationInfoDAO {

	public int destinationInsert(String userId , String familyName , String firstName ,  String familyNameKana , String firstNameKana , String email , String telNumber , String userAddress){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		int count = 0;

		String sql = "insert into destination_info(user_id , family_name , first_name , family_name_kana , first_name_kana , email , tel_number , user_address , regist_date , update_date)"
				+ "values(?,?,?,?,?,?,?,?,now(),now())";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);
			ps.setString(2, familyName);
			ps.setString(3, firstName);
			ps.setString(4, familyNameKana);
			ps.setString(5, firstNameKana);
			ps.setString(6, email);
			ps.setString(7, telNumber);
			ps.setString(8, userAddress);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				con.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;

	}

	//ユーザーIDに紐付いた宛先情報を参照して、リストに入れる。
	public ArrayList<DestinationInfoDTO> selectDestinationInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<DestinationInfoDTO> destinationInfoDTO = new ArrayList<DestinationInfoDTO>();

		String sql = "SELECT * FROM destination_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				DestinationInfoDTO dto = new DestinationInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setUserAddress(rs.getString("user_address"));
				destinationInfoDTO.add(dto);
			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				con.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return destinationInfoDTO;
	}

	//宛先情報IDに紐付いた宛先情報の削除。
	public int deleteDestinationInfo(int id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM destination_info WHERE id = ?";

		int result = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			result = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				con.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}