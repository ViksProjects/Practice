package Intial;

public interface SampleIngterface {
	
	default void  defCode() {
		System.out.println("This is the base Default method code");
	}

	
	public void copy();
	public void copyTestCode();
	
	static void stCode() {
		System.out.println("This is for Static Method");
	}
}
