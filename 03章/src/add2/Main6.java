

package add2;

public class Main6 {

	public static void main(String[] args) {
		String a = "*";
		for (int i = 9; i > 0; i--) {

			String str1 = new String(new char[i]).replace("\0", "*");
			System.out.println(str1);

		}

	}

}
