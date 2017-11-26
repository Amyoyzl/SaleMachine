
public class Main {

	public static void main(String[] args) {
		
		SaleMachine sm = new SaleMachine(); 
		System.out.println(sm.buy("beer", 100));
		System.out.println(sm.buy("beer", 100));
		System.out.println(sm.buy("beer", 100));
		System.out.println(sm.buy("beer", 50));
		System.out.println(sm.buy("orange", 100));
		System.out.println(sm.buy("orange", 100));
		System.out.println(sm.buy("orange", 100));
		System.out.println(sm.buy("orange", 20));
		System.out.println(sm.buy("orange", 50));
		System.out.println(sm.buy("kole", 50));	
		System.out.println(sm.buy("orange", 50));
		
	}
}
