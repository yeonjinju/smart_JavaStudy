package 학생정보관리프로그램;

public class test {

	class A {
		int num = 50;

		public A() {
			System.out.print("X");
		}

		public A(int n) {
			System.out.print("Y");
		}

		public void printNum() {
			System.out.print(num);
		}
	}

	class B extends A {
		int num = 100;

		public B() {
			System.out.print("A");
		}

		public B(int n) {
			super(n);
			System.out.print("B");
		}

		public void printNum() {
			System.out.print(num);
		}
	}

	class C extends B {
		int num = 200;

		public C() {
			System.out.print("C");
		}

		public C(int n) {
			super(n);
			System.out.print("D");
		}

		public void printNum() {
			System.out.print(num);
		}

		public void show() {
			System.out.print("E");
		}
	}

	public static void main(String[] args) {
		A a1 = new C();
		B b1 = new C(5);
		A a2 = new B();

		a1.printNum();
		b1.printNum();
		a2.printNum();
	}

}
