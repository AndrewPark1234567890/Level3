
public class Diamonds {
	int sets = 1;

	public static void main(String[] args) {
		pND(9);
	}

	public static void pND(int dCenter) {
		int x = dCenter;
		int totalLines = dCenter * 2 + 1;
		int numSpaces;
		numSpaces = (int) Math.floor(totalLines / 2);
		int numNumbers = 1;
		int middle = numSpaces + 1;
		int counter = 0;
		for (int i = 0; i < totalLines; i++) {
			System.out.println();
			for (int q = 0; q < numSpaces; q++) {
				System.out.print(" ");
			}
			for (int j = 0; j < numNumbers; j++) {
				int reps = (int) Math.floor(numNumbers / 2);
				// System.out.print("j = " +j);
				if (j <= reps) {
					System.out.print(reps + j - counter);
				} else {
					System.out.print(reps - j + counter);
				}
			}
			for (int q = 0; q < numSpaces; q++) {
				System.out.print(" ");
			}
			if (i >= middle - 1) {
				// System.out.print("snaller " + counter);
				counter--;
			} else {
				// System.out.print("bigger " + counter);
				counter++;
			}
			if (i >= middle - 1) {
				// System.out.print("snaller " + numNumbers);
				numNumbers -= 2;
			} else {
				// System.out.print("bigger " + numNumbers);
				numNumbers += 2;
			}
			if (i >= middle - 1) {
				numSpaces++;
				// System.out.print("bigger " + numSpaces);
			} else {
				numSpaces--;
				// System.out.print("smaller " + numSpaces);
			}
		}
	}
}
