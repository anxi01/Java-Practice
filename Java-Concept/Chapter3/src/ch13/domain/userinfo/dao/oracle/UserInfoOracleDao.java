package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{
	
	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into ORACLE DB userId = " + userinfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into ORACLE DB userId = " + userinfo.getUserId());	
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete into ORACLE DB userId = " + userinfo.getUserId());	
	}


}
