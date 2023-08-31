package contoller;

public class StringAppendage {
	public static void main(String[] args) {
		StringAppendage stringApp = new StringAppendage();
		System.out.println(stringApp.append("Tate", " loves Java"));

	}

	public String append(String i, String j) {
		return i + j;

	}
}
