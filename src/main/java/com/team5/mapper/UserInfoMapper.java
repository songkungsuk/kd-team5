package com.team5.mapper;

import java.util.List;

import com.team5.vo.UserInfoVO;

public interface UserInfoMapper {
	
	public List<UserInfoVO> selectUserInfos(UserInfoVO user);
	public UserInfoVO selectUserInfo(int uiNum);
	public int insertUserInfo(UserInfoVO user);
	public int updateUserInfo(UserInfoVO user);
	public int deleteUserInfo(int uiNum);
}
