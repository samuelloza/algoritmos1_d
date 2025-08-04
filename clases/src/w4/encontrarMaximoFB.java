package w4;

public class encontrarMaximoFB {

	public static void main(String[] args) {
		int vec[] = {1 ,4, 5 ,6 ,7, -4};
		System.out.println(encontrarMaximoFB(vec));

	}
	
	//O(n²)
	//10^9
	public static int encontrarMaximoFB(int vec[]) {
		for (int i = 0; i < vec.length; i++) { //n
			boolean esMaximo= true;
			for (int j = 0; j < vec.length; j++) {//n
				if (vec[i] > vec[j]) {
					esMaximo = false;
					break;
				}
			}
			
			if (esMaximo) {
				return vec[i];
			}
		}
		return vec[0];
	}
}
