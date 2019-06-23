package com.test.factory.abs.homework;

public class GothicFurnitureFactory implements FurnitureFactory {

	public Chair createChair() {
		Chair GothicChair = new Chair() {

			@Override
			public void sitOn() {
				System.out.println("Yes");

			}

			@Override
			public void hasLegs() {
				System.out.println("4(four) legs");

			}

			@Override
			public void info() {
				System.out.println("It's Chair of Gothic");

			}

			@Override
			public void style() {
				System.out.println("Gothic style");

			}

			@Override
			public void material() {
				System.out.println("Material:Wood, Leather.");

			}

			@Override
			public void size() {
				System.out.println("Size: 90x90x91");

			}

			@Override
			public void type() {
				System.out.println("Hight type.");

			}

			@Override
			public void foldable() {
				System.out.println("Not foldable.");

			}

		};
		return GothicChair;
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		CoffeeTable GothicCoffeTable = new CoffeeTable() {

			@Override
			public void style() {
				System.out.println("Gothic style");

			}

			@Override
			public void size() {
				System.out.println("Size: 90x65x30");

			}

			@Override
			public void sitOn() {
				System.out.println("Sit off");

			}

			@Override
			public void material() {
				System.out.println("Material: Red wood");

			}

			@Override
			public void info() {
				System.out.println("It's CoffeeTable of Gothic");

			}

			@Override
			public void hasLegs() {
				System.out.println("4(four) legs");

			}

			@Override
			public void foldable() {
				System.out.println("Not foldable");

			}
		};
		return GothicCoffeTable;
	}

	@Override
	public Cupboard createCupboard() {
		Cupboard GothicCupboard = new Cupboard() {

			@Override
			public void style() {
				System.out.println("Gothic style");

			}

			@Override
			public void size() {
				System.out.println("Size: 95x40x220");

			}

			@Override
			public void sitOn() {
				System.out.println("No sit");

			}

			@Override
			public void material() {
				System.out.println("Material: Dark wood, Glass \"Gold\"");

			}

			@Override
			public void info() {
				System.out.println("It's Cupboard of Gothic");

			}

			@Override
			public void hasLegs() {
				System.out.println("4(four) legs");

			}

			@Override
			public void type() {
				System.out.println("Type: Books.");

			}

			@Override
			public void installation() {
				System.out.println("Floor installation.");

			}
		};
		return GothicCupboard;
	}

	@Override
	public Sofa createSofa() {
		Sofa GothicSofa = new Sofa() {

			@Override
			public void style() {
				System.out.println("Gothic style");

			}

			@Override
			public void size() {
				System.out.println("Size: Normal - 218x95x90");

			}

			@Override
			public void sitOn() {
				System.out.println("Sit on.");

			}

			@Override
			public void material() {
				System.out.println("Material: Red Wood, Leather");

			}

			@Override
			public void info() {
				System.out.println("It's Sofa of Gothic");

			}

			@Override
			public void hasLegs() {
				System.out.println("4(four) legs");

			}

			@Override
			public void type() {
				System.out.println("Straigt type.");

			}

			@Override
			public void foldable() {
				System.out.println("Not foldable");

			}
		};

		return GothicSofa;
	}

}
