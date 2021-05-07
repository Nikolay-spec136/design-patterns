package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Гергана");
		User user2 = new ChatUser(chat, "Ивелин");
		User user3 = new ChatUser(chat, "Даниел");
		
		user2.send("cat");
		user1.send("addBot");
		user2.send("cat");
		user3.send("cat");
	}

}
