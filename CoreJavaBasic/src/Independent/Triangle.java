package Independent;

public class Triangle {

	public static void main(String[] args) {
		System.out.println("......STAR PATTERNS...\n");
		getRight();
		getReverseRight();
		getTriangle();
		getTriangleIf();
		getLeft();
	}
	public static void getRight() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	public static void getReverseRight() {
		System.out.println("------------------------------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	public static void getTriangle() {
		System.out.println("------------------------------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void getTriangleIf() {
		System.out.println("------------------------------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
	public static void getLeft() {
		System.out.println("------------------------------------------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
