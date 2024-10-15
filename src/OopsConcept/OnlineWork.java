package OopsConcept;

public class OnlineWork extends DrakeOnlineServices {
	
	public void forms() {
		
		System.out.println("All types of form Filling work done here.");

	}
	public void games() {
		System.out.println("Great Players plays the game w.r.t Time.");
	}
	 public void entrance() {
		 System.out.println("Entrance Exam Forms.");
	 }

	public static void main(String[] args) {
		
		OnlineWork ow=new OnlineWork();
		ow.entrance();
		ow.games();
		ow.forms();
		ow.print();
		ow.scan();
		ow.services();
		ow.tejscreations();
	

	}

}
