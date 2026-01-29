import java.util.Scanner;
public class MovieRecommendation 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String[] action = {"KGF", "Pushpa", "Salaar"};
        String[] comedy = {"The Mask", "Superbad", "The Hangover"};
        String[] scifi = {"Kalki 2898AD", "Karthikeya 2", "Anthariksham" };
        String[] horror = {"The Conjuring", "Insidious", "It"};
		String[] thriller = {"Hit 3", "Zebra" , "Thandel" , "Major" , "U-Turn" , "Por Thozhil"};
		String[] devotional = {"Mahavatar Narsimha", "Kantara - Chapter 1" , "Swetha Naagu" , "Sai Baba" , "Ramayanam"};
        System.out.println("=== MOVIE RECOMMENDATION ENGINE ===");
        System.out.println("Choose a genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Sci-Fi");
        System.out.println("4. Horror");
		System.out.println("5. Thriller");
		System.out.println("6. Devotional");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();
        System.out.println("\nRecommended Movies:");
        switch (choice) {
            case 1:
                printMovies(action);
                break;
            case 2:
                printMovies(comedy);
                break;
            case 3:
                printMovies(scifi);
                break;
            case 4:
                printMovies(horror);
                break;
			case 5:
                printMovies(thriller);
                break;
			case 6:
                printMovies(devotional);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
    public static void printMovies(String[] movies) {
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
    }
}
