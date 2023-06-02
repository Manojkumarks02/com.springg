package springlifecycle;

public class Bean1 {
	private String message;

	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("init begin");
	}
	public void destroy() {
		System.out.println("destroying");
	}
}
