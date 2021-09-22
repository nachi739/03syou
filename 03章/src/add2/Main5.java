package add2;

public class Main5 {

	public static void main(String[] args) {
		String a = " ";
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				System.out.println("*");
			}else {
				System.out.println(a + "*");
				a += " ";
			}
		}
	}

}
