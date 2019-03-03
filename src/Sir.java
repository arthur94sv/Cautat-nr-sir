
public class Sir {
	private int a[] = { 2, 3, 69, 7, 9, 46, 3, 12, 35, 67, 8, 90 };
	private int x;

	public void setNumar(int x) {
		this.x = x;
	}

	public void cautare() {
		for (int i = 0; i <= a.length; i++) {
			if (x == a[i]) {
				System.out.println("Valuarea este prezenta in sir");
				break;
			} else {
				System.out.println("Valuarea nu este prezenta in sir");
				break;
			}

		}

	}

	public void sortare() {
		int aux;
		boolean sortat = false;

		while (sortat == false) {
			sortat = true;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					aux = a[i + 1];
					a[i + 1] = a[i];
					a[i] = aux;
					sortat = false;
				}
			}
		}

	}

	public void afisare() {
		for (int i = 0; i <= a.length; i++)
			System.out.println(a[i]);

	}
}
