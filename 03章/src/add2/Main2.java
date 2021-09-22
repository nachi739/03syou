package add2;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("九九表");
		for (int i = 1; i <= 9; i ++) {
			if (i < 5) {
				System.out.print(i);
				System.out.print("    ");
			} else if(i == 5) {
				System.out.println( i + "    ");
				System.out.println();
				System.out.print("     ");
			} else {
				System.out.print(i + "    ");
			}
		}
	}

}
