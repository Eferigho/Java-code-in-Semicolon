package chapter9;

public enum Wing {
	
	LEFT_BIG_WING(4),
	RIGHT_BIG_WING(4),
	
	LEFT_SMALL_WING(2),
	RIGHT_SMALL_WING(2);
	
	private int wingSize;

	Wing(int wingSize){
		this.wingSize = wingSize;
	}
	
	public int getSize() {
		return wingSize;
	}
	
	public void setSize(int size) {
		this.wingSize = size;
	}
}
