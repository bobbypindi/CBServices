package com.constro.app.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.constro.app.bo.CBELogin;
import com.constro.app.dao.CBELogingDao;
import com.constro.app.daoconstrans.DaoConstrains;
@Repository
public class CBELogingDaoImpl implements CBELogingDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int CBELoging(CBELogin loginbo) {
		int count=jdbcTemplate.queryForInt(DaoConstrains.SQL_CBELOGING_LOGIN,loginbo.getUserName(),loginbo.getPassWord());
		return count;
	}

}
