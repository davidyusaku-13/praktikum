public class Cards {
	enum Mark {
		Heart,
		Diamond,
		Spades,
		Cloves
	}

	static void showCard() {
		String[] num = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "Jack", "Queen", "King" };
		System.out.println(num[(int) (Math.random() * 13)] + " of " + Mark.values()[(int) (Math.random() * 4)]);
	}

	public static void main(String[] args) {
		showCard();
	}
}