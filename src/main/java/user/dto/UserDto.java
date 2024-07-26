package user.dto;

public class UserDto {

	private int userId;
	private String userName;
	private String userLocation;
	private String message;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userLocation=" + userLocation + ", message="
				+ message + "]";
	}
	
	
	
}
