package mediator;

import java.util.ArrayList;
import java.util.List;


public class Chat implements MessageMediator {
	
	private List<User> users;
    private boolean addBotIsSaid = false;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		if(message == "addBot") {
			Singleton connection = Singleton.getInstance();
			connection.postMessage("Изписано е 'addBot'");
			addBotIsSaid = true;
		}
		
		
		for(User chatUser: this.users) {
			
			if(chatUser!=user) {
			chatUser.receive(message);
			}
		}
		
		
		if(addBotIsSaid == true && message == "cat") {
			users.remove(user);
			
			System.out.println("'Cat' е забранена дума");
			System.out.println("Хора в чата:");
			
			for(User userr: this.users) {
				System.out.println(userr.name);
			}
		}
	}	

	
	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	}
