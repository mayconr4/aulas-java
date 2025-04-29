
public class Exemplo11 {

	public static void main(String[] args) {
		double num_01 = 8;
		int num_02 = 5;
		int num_03 = 2;
		int num_04 = 7;
		boolean resp;
		
		// System.out.println(" num_01 é maior que  num_02?"+ (num_01>num_02));
		// System.out.println(" num_01 é menor que  num_02?"+ (num_01<num_02));
		// System.out.println(" num_01 é maior que  num_02?"+ (num_01>=num_02));
		// System.out.println(" num_01 é maior que  num_02?"+ (num_01<=num_02));
		// System.out.println(" num_01 é maior que  num_02?"+ (num_01!=num_02));
		// System.out.println( num_01>num_02 && num_04 >  num_03);
		// System.out.println( num_01>num_02 && num_04 <  num_03);
		// System.out.println( num_01>num_02 && num_04 != num_03);
		// System.out.println( num_01>num_02 || num_04 != num_03);
		System.out.println( num_01>num_02 && num_04 <num_03 || num_01<num_02 && num_01>num_02 );
		System.out.println( num_01>num_02 && num_04 != num_03 || num_01<num_03);
		System.out.println( num_01<num_02 && num_04 != num_03 || num_01>num_03);
		System.out.println( num_01>num_02 && num_04 == num_03 || num_01<num_03 && num_01<num_02);
		System.out.println( !(num_01<num_02 && num_04 != num_03 || num_01>num_03));
		

	}

}
