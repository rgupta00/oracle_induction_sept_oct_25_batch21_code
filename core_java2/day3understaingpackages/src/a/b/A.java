package a.b;

public class A {
	private int i = 1;
	int j = 11;
	protected int k = 111;
	public int m = 1111;

	void printDefault() {
		System.out.println("printDefault method of class A");
	}

	private void printPrivate() {
		System.out.println("printPrivate method of class A");
	}

	protected void printProtected() {
		System.out.println("printProtected method of class A");
	}

	public void printPublic() {
		System.out.println("printPublic method of class A");
	}
}
