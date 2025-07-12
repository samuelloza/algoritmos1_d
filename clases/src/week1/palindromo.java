package week1;

public class palindromo {

	public static void main(String[] args) {
		String cad = "ORURO";
		
		System.out.println(isPalintromo(cad, 0, cad.length() - 1));
	}
	
	public static boolean isPalintromo(String cade, int begin, int end) {
		if (begin == end) {
			return true;
		} else {
			if (cade.charAt(begin) == cade.charAt(end)) {
				System.out.println(cade.charAt(begin) + " == " + cade.charAt(end));
				return isPalintromo(cade, begin + 1, end - 1);
			} else {
				return false;				
			}
		}
	}

}
