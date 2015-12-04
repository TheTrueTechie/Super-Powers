public class Minions {

	private String name;
	private int eyes;
	private String color;
	private String master;

	
	
	Minions(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color	; 
		this.master = master;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	/**
	 * To make these tests pass, you will need to create a Minion class with the member variables below.
	 * 
	 * <code>
	 * 			private String name; 
	 * 			private int eyes; 
	 * 			private String color; 
	 * 			private String master;
	 * </code>
	 * 
	 * Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will
	 * pass.
	 * 
	 **/
}