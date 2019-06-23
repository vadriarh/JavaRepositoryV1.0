package com.test.factory.abs.homework;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		Chair ArtDecoChair = new Chair() {

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
				System.out.println("It's Chair of ArtDeco");

			}

			@Override
			public void style() {
				System.out.println("ArtDeco style");

			}

			@Override
			public void material() {
				System.out.println("Material:Shenill.");

			}

			@Override
			public void size() {
				System.out.println("Size: 74x90x91");

			}

			@Override
			public void type() {
				System.out.println("Straight type.");

			}

			@Override
			public void foldable() {
				System.out.println("Not foldable.");

			}

		};
		return ArtDecoChair;
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		CoffeeTable ArtDecoCoffeTable = new CoffeeTable() {

			@Override
			public void style() {
				System.out.println("ArtDeco style");

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
				System.out.println("Material: LDSP");

			}

			@Override
			public void info() {
				System.out.println("It's CoffeeTable of ArtDeco");

			}

			@Override
			public void hasLegs() {
				System.out.println("3(three) legs");

			}

			@Override
			public void foldable() {
				System.out.println("Not foldable");

			}
		};
		return ArtDecoCoffeTable;
	}

	@Override
	public Cupboard createCupboard() {
		Cupboard ArtDecoCupboard = new Cupboard() {

			@Override
			public void style() {
				System.out.println("ArtDeco style");

			}

			@Override
			public void size() {
				System.out.println("Size: 80x40x220");

			}

			@Override
			public void sitOn() {
				System.out.println("No sit");

			}

			@Override
			public void material() {
				System.out.println("Material: LDSP, Glass \"Blue\"");

			}

			@Override
			public void info() {
				System.out.println("It's Cupboard of ArtDeco");

			}

			@Override
			public void hasLegs() {
				System.out.println("4(four) legs");

			}

			@Override
			public void type() {
				System.out.println("Type: Books and cups.");

			}

			@Override
			public void installation() {
				System.out.println("Floor installation.");

			}
		};
		return ArtDecoCupboard;
	}

	@Override
	public Sofa createSofa() {
		Sofa ArtDecoSofa = new Sofa() {

			@Override
			public void style() {
				System.out.println("ArtDeco style");

			}

			@Override
			public void size() {
				System.out.println("Size: Normal - 218x95x90\nFoldable - 218x145x90");

			}

			@Override
			public void sitOn() {
				System.out.println("Sit on.");

			}

			@Override
			public void material() {
				System.out.println("Material: Shenill");

			}

			@Override
			public void info() {
				System.out.println("It's Sofa of ArtDeco");

			}

			@Override
			public void hasLegs() {
				System.out.println("1(one) legs");

			}

			@Override
			public void type() {
				System.out.println("Angular type.");

			}

			@Override
			public void foldable() {
				System.out.println("Foldable");

			}
		};

		return ArtDecoSofa;
	}

}
