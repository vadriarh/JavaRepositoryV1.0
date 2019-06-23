package model;

public class ChildB extends Parent {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();// invoke super method implementation
		// add something else
		System.out.println("Child B: do something else");
	}

	public ChildB() {
		System.out.println("Java was here -> ChildB() constructor");
	}
}
