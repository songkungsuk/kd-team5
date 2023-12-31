package com.team5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.mapper.UserInfoMapper;

import com.team5.vo.UserInfoVO;

@Service //서비스가있어야 비로소 서비스가됨
public class UserInfoServiceImpl  {
	
	@Autowired
	UserInfoMapper uiMapper;
	

	public List<UserInfoVO> selectUserInfos(UserInfoVO user) {
		
		return uiMapper.selectUserInfos(user);
	}


	public UserInfoVO selectUserInfo(int uiNum) {
		
		return uiMapper.selectUserInfo(uiNum);
	}
	
	public int insertUserInfo(UserInfoVO user) {
		
		return uiMapper.insertUserInfo(user);
	}


	public int updateUserInfo(UserInfoVO user) {
		
		return uiMapper.updateUserInfo(user);
	}


	public int deleteUserInfo(int uiNum) {
		
		return uiMapper.deleteUserInfo(uiNum);
	}

}
