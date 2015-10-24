
public class KiwiJuiceEasy {

	// int[] capacities = { 20, 20 };
	// int[] bottles = { 5, 8 };
	// int[] fromId = { 0 };
	// int[] toId = { 1 };
	// int[] Returns = null;

	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

		for (int i = 0; i < fromId.length; i++) {
			
			int f=fromId[i];
			int t=toId[i];
			int space = capacities[i] - bottles[i];
			
			if(space>fromId[i]){
				int val = bottles[f];
				bottles[f] = 0;
				bottles[t] += val;
			}
			if(space<=fromId[i]){
				int val = bottles[f];
				bottles[f] = val - space;
				bottles[t] = capacities[i];
			}
		}

		
		return bottles;
	}
}
