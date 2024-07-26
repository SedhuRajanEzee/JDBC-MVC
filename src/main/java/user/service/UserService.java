package user.service;

import user.dao.UserDao;
import user.dto.UserDto;
import user.entity.User;

public class UserService {

	private UserDao dao=new UserDao();

	public UserDto saveUser(User usr)  {

		User dbUser=dao.saveUser(usr);

		if(dbUser!=null) {

			UserDto dto=new UserDto();
			dto.setUserId(dbUser.getUserId());
			dto.setUserName(dbUser.getUserName());
			dto.setUserLocation(dbUser.getUserLocation());
			dto.setMessage(" User Data Saved Succefully ");

			return dto;
		}

		return null;
	}

	public UserDto findUser(int userId) {

		User dbUser=dao.findUser(userId);

		if(dbUser!=null) {

			UserDto dto=new UserDto();
			dto.setUserId(dbUser.getUserId());
			dto.setUserName(dbUser.getUserName());
			dto.setUserLocation(dbUser.getUserLocation());
			dto.setMessage(" User Data Fetched Succefully ");

			return dto;
		}
		return null;
	}

	public UserDto deleteUser(int userid) {

		User dbUser=dao.deleteUser(userid);

		if(dbUser!=null) {

			UserDto dto=new UserDto();
			dto.setUserId(dbUser.getUserId());
			dto.setUserName(dbUser.getUserName());
			dto.setUserLocation(dbUser.getUserLocation());
			dto.setMessage(" User Data Deleted Succefully ");

			return dto;
		}
		
		return null;
	}


}
