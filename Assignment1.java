class Programs{
	void printINeuron() {
		int i_val = 10;
		int j_val = 10;
		//I
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(i == 0 || i == i_val-1 || j == j_val/2) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//N
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || j == j_val-1 || j == i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//E
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || i == i_val-1 || i==0 || i==i_val/2) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//U
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || j == j_val-1 || i == i_val-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//R
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || i==0 || i==i_val/2) {
					System.out.print("*");
				}
				else if(i<i_val/2 && j==j_val-1) {
					System.out.print("*");
				}
				else if(i>i_val/2 && j==i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//O
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || j == j_val-1 || i == 0 || i==i_val-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//N
		for(int i = 0; i < i_val; i++) {
			for(int j = 0; j < j_val; j++) {
				if(j == 0 || j == j_val-1 || j == i) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void printProgram2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	void printProgram3(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1||j<=n/2-i
						|| j>=n/2+i) {
				System.out.print("*");
			}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	void printProgram4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<i-n/2+2||j>=n/2+(n-i)-2) {
				System.out.print("*");
			}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	void printProgram5(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||i<n/2-j+1||i>n/2+j-1) {
				System.out.print("*");
			}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Programs programs = new Programs();
		programs.printINeuron();
		System.out.println("------------------------");
		programs.printProgram2(9);
		System.out.println("------------------------");
		programs.printProgram3(13);
		System.out.println("------------------------");
		programs.printProgram4(13);
		System.out.println("------------------------");
		programs.printProgram5(13);
	}
}
