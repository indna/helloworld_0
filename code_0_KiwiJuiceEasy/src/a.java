
public class a {
	public static void main(String args[]) {

		int[] capacities = { 20, 20 };
		int[] bottles = { 5, 8 };
		int[] fromId = { 0 };
		int[] toId = { 1 };
		int[] Returns = null;

		KiwiJuiceEasy kk = new KiwiJuiceEasy();
		

		Returns = kk.thePouring(capacities, bottles, fromId, toId);

		System.out.println(capacities[0]);
		System.out.println(Returns[0]);
		System.out.println(Returns[1]);
	}
}
