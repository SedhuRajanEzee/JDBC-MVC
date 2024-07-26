package user.controller;

import user.dto.UserDto;
import user.entity.User;
import user.service.UserService;

public class UserController {

	private UserService service=new UserService();
	
	
	//saveUser API
	public UserDto saveUser(User usr) {
		
		return service.saveUser(usr);
	}
	
	
	
	//findUser API
	public UserDto findUser(int userId) {
		
		return service.findUser(userId);
	}
	
	public UserDto deleteUser(int userid) {
		
		return service.deleteUser(userid);
	}
	
	
	public static void main(String[] args) {
		
		UserController controller=new UserController();
//		
//		User usr=new User();
//		usr.setUserId(100);
//		usr.setUserName("M Sedhu Rajan");
//		usr.setUserEmail("shedhu10@gmail.com");
//		usr.setUserPassword("SedhuRajan");
//		usr.setUserLocation("Vellore");
//		
//		System.out.println(controller.saveUser(usr));
		
//		System.out.println(controller.findUser(1));
		
		System.out.println(controller.deleteUser(100));
		
	}
}
