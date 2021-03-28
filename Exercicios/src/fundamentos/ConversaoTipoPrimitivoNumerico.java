package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		int i = 1;
		double a = 1.0; //Implicita;
		
		float b = (float) 1.5555555584;
		double d = 5.9;
		int x = (int)d;
		System.out.println(x);
		
		int c = 129;
		byte e = (byte)c;
		System.out.println(e);
		

	}

}
