package model;

public class ChildBB extends ChildB {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
		System.out.println("Child BB: do something else");
	}

	public ChildBB() {
		System.out.println("Java was here -> ChildBB() constructor");
	}
}
