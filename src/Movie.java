/**
 * Movie can have a title and category.
 * 
 * @author Yasmin
 *
 */
public class Movie {
	private String title;
	private MovieCategories category;

	public Movie(String title, MovieCategories category) {
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MovieCategories getCategory() {
		return category;
	}

	public void setCategory(MovieCategories category) {
		this.category = category;
	}

	public String toString() {
		return title;
	}

}
