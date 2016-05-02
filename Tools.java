//binario todo
//sumar todos los numeros
//numero mayo


package models;

public class Tools{

	public static final char MOUTH = 'v';
	public static final char EYES = ':';

	private int numberchar;
	private int totals;
	private int sumatetotal;

	public int countcharacters(String phrase, char seek){
		int size = phrase.length();
		int count = 0;
		for(int i = 0; i < phrase.length(); i++){
	//		System.out.println(phrase.charAt(i))
			if(phrase.charAt(i)==seek){
			count++;
			}
			
		}
		return count;
	}

	public int countwords(String phrase){
		int size = phrase.length();
		int count = 0;
		for(int i = 0; i < phrase.length(); i++){
//			System.out.println(phrase.charAt(i));
			if((phrase.charAt(i) >= 32 && phrase.charAt(i) <= 47)){
			count++;
			totals++;
			}
		}
		return totals;
	}

	public int countfaces(String phrase){
		int size = phrase.length();
		int count = 0;
		for(int i = 0; i < phrase.length(); i++){
//			System.out.println(phrase.charAt(i));
			if(phrase.charAt(i) == EYES){
				if((phrase.charAt(i++)) == MOUTH)
				count++;
			}
		}
		return count;
	}

	public int verificatebinarie(String number){
		int size = number.length();
		int count = 0;
		for(int i = 0; i < number.length(); i++){
			if((number.charAt(i)) == 48 || (number.charAt(i) == 49)){
				System.out.println("ok");
			}else{
				System.out.println("numero no binario");
				break;
			}
		}
		return count;
	}

	public int sumatenum(String code){
		int size = code.length();
		int count = 0;
		for(int i = 0; i < code.length(); i++){
			if((code.charAt(i) >= 48 || (code.charAt(i) <= 57))){
				sumatetotal += (code.charAt(i));
			}	
		}
		return sumatetotal;
	}

	public int mayornumber(String number){
		int size = number.length();
		int count = 0;
		for(int i = 0; i < number.length(); i++){
			if((number.charAt(i) >= 48 || (number.charAt(i) <= 57))){
				if(i > count);
				count = i;
			}	
		}
		return count;
	}

	public static void main (String [] args){
		Tools frase = new Tools();
		System.out.println(frase.countcharacters("mi mama me mima", 'm'));
		System.out.println(frase.countwords("la la la? ola! "));
		System.out.println(frase.countfaces("ola :v :v"));
		System.out.println(frase.verificatebinarie("1010101010"));
		System.out.println(frase.sumatenum("asdasd678"));
		System.out.println(frase.mayornumber("1,1,1,1,5"));
	}
}