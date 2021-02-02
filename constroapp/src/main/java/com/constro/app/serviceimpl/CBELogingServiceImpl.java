package com.constro.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.constro.app.bo.CBELogin;
import com.constro.app.dao.CBELogingDao;
import com.constro.app.service.CBELoginService;
@Service
public class CBELogingServiceImpl implements CBELoginService {

	
	@Autowired
	private CBELogingDao dao;
	@Override
	public int CBELoging(CBELogin loginbo) {
		int cnt = dao.CBELoging(loginbo);

		return cnt;
	}

}
