package notificationSystem;

import transferObject.UserDTO;

public interface NotificationService {

	public void sendNotifcation(UserDTO user, String message);
}
