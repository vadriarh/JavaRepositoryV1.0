package model;

public class Parent {

	// I STATIC THINGS
	public static int si = 59;
	static {
		System.out.println("STATIC BLOCK-> JAVA WAS HERE");
	}

	// NON STATIC BLOCK
	{
		System.out.println("NON STATIC BLOCK-> JAVA WAS HERE");
	}

	// II DEFAULT VALUES
	public int i;

	// III Constructor
	public Parent() {
		System.out.println("Java was here -> Parent() constructor");
	}

	public void doSomething() {

		System.out.println("Parent->doSomething");
	}

}
