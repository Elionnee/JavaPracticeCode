package Pruebas1;

public class InstanceOfPrueba {
	class A {
		int j, i;
	}

	class B {
		int i, j;

	}

	class C extends A {
		int k;
	}

	class D extends A {
		int k;
	}

	public static void main(String args[]) {
		InstanceOfPrueba i = new InstanceOfPrueba();
		A a = i.new A();
		B b = i.new B();
		C c = i.new C();
		D d = i.new D();

		if (a instanceof A) {
			System.out.println("a is instance of A");
		}

		if (b instanceof B) {
			System.out.println("b is instance of B");
		}

		if (c instanceof C) {
			System.out.println("c is instance of C");
		}

		if (c instanceof A) {
			System.out.println("c can be cast to A");
		} else {
			System.out.println("c cannot be cast to A");
		}

		if (a instanceof C) {
			System.out.println("a can be cast to C");
		} else {
			System.out.println("a cannot be cast to C");
		}

		System.out.println("------------------------------------------------------");

		A ob;

		ob = d;

		System.out.println("ob ahora hace referencia a d");
		if (ob instanceof D) {
			System.out.println("ob is instance of D");
		}

		if (ob instanceof A) {
			System.out.println("ob can be cast to A");
		} else {
			System.out.println("ob cannot be cast to A");
		}


		if (ob instanceof C) {
			System.out.println("ob can be cast to C");
		} else {
			System.out.println("ob cannot be cast to C");
		}

		System.out.println("------------------------------------------------------");

		ob = c;

		System.out.println("ob ahora hace referencia a c");
		if (ob instanceof C) {
			System.out.println("ob is instance of C");
		}
		
		if (ob instanceof D) {
			System.out.println("ob can be cast to D");
		} else {
			System.out.println("ob cannot be cast to D");
		}

		if (ob instanceof A) {
			System.out.println("ob can be cast to A");
		} else {
			System.out.println("ob cannot be cast to A");
		}

		System.out.println("------------------------------------------------------");

		if (a instanceof Object) {
			System.out.println("a may be cast to Object");
		}

		if (b instanceof Object) {
			System.out.println("b may be cast to Object");
		}

		if (c instanceof Object) {
			System.out.println("c may be cast to Object");
		}

		if (d instanceof Object) {
			System.out.println("d may be cast to Object");
		}

	}

}
