package amd.caveofprogramming.section14.l164;

public class Interfaces {

	public static void main(String[] args) {

		IDescribable[] descObjs = { new Person(), new Computer() };

		for (IDescribable descObj : descObjs) {
			System.out.println(descObj.getDescription());
		}

	}

}
