import java.util.*;
public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
		String userString = getUserInput(scanner);
        while (!userString.isEmpty()) {
            System.out.println(latinStr(userString));
            userString = getUserInput(scanner);
        
        }
        }
	}
	
	private static String latinStr (String english) {
		StringBuilder latinString = new StringBuilder();
		for (String word: english.split("\\s")) {
			latinizeWord (latinString, word);
			latinString.append(" ");
		}
		return latinString.toString();
	}
	
	private static void latinizeWord (StringBuilder latinString, String word) {
		if (vowelStart(word)) {
			latinString.append(word).append("ay");
		} else {
			latinString.append(word.substring(1)).append(word.charAt(0)).append("ay");
		}
	}
	
		private static boolean vowelStart(String word) {
			return "AEIOUaeiou".indexOf(word.charAt(0)) != -1;
		}

		private static String getUserInput(Scanner scanner) {
		    System.out.print("Enter a string to be converted into Pig Latin. To stop, enter a blank input: ");
		    return scanner.nextLine();
		}
}
