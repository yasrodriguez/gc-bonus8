import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prompts the user to select a movie category from a list. It returns all
 * movies associated with that category.
 * 
 * @author Yasmin
 *
 */
public class MovieApp {

	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;

		populateInventory(movieList);

		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are " + movieList.size() + " movies in this list.");
		System.out.println();

		while (keepGoing) {
			MovieCategories userCategory = processMenuOptions(scan);
			displayMovies(movieList, userCategory);
			keepGoing = Validator.getYOrN(scan, "Continue? (y/n): ");
		}
		scan.close();
		System.out.println("Goodbye!");
	}

	/**
	 * Adds movies to the movie inventory.
	 * 
	 * @param movieList
	 *            the movie list to be populated
	 */
	private static void populateInventory(ArrayList<Movie> movieList) {
		movieList.add(new Movie("Thor: Ragnarok", MovieCategories.SCIFI));
		movieList.add(new Movie("Blade Runner 2049", MovieCategories.SCIFI));
		movieList.add(new Movie("Geostorm", MovieCategories.SCIFI));
		movieList.add(new Movie("Despicable Me 3", MovieCategories.ANIMATED));
		movieList.add(new Movie("Emojie Movie", MovieCategories.ANIMATED));
		movieList.add(new Movie("LBJ", MovieCategories.DRAMA));
		movieList.add(new Movie("Nobody's Watching", MovieCategories.DRAMA));
		movieList.add(new Movie("Victoria & Abdul", MovieCategories.DRAMA));
		movieList.add(new Movie("IT", MovieCategories.HORROR));
		movieList.add(new Movie("Happy Death Day", MovieCategories.HORROR));
	}

	/**
	 * Prints the movie categories and processes the user selection.
	 * 
	 * @param scan
	 *            Scanner to use
	 * @return Movie category selected by the user
	 */
	private static MovieCategories processMenuOptions(Scanner scan) {
		MovieCategories[] categories = MovieCategories.values();

		System.out.println("What category are you interested in? ");

		for (int i = 0; i < categories.length; i++) {
			System.out.println((i + 1) + ". " + categories[i].toString());
		}

		int selection = Validator.getInt(scan, "", 1, categories.length);
		return categories[selection - 1];
	}

	/**
	 * Display all movies in the category entered by the user.
	 * 
	 * @param movieList
	 *            movie inventory
	 * @param userCategory
	 *            movie category entered by user
	 */
	private static void displayMovies(ArrayList<Movie> movieList, MovieCategories userCategory) {
		for (Movie m : movieList) {
			if (m.getCategory() == userCategory) {
				System.out.println(m.toString());
			}
		}
		System.out.println();
	}
}
