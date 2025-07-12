package week1;

public class contarVolcaes {

	public static void main(String[] args) {
		System.out.println(contar("aeiouwwwwwwwwabvbvs", 0));
	}
	
	public static int contar(String cad, int index) {
		if (cad.length() == index) {
			return 0;
		}
		
		if (cad.charAt(index) == 'a' || cad.charAt(index) == 'e' || cad.charAt(index) == 'i' ||
				cad.charAt(index) == 'o' || cad.charAt(index) == 'u'  ) {
			return contar(cad, index + 1) + 1;
		} else {
			return contar(cad, index + 1) + 0;
		}
	}
}
