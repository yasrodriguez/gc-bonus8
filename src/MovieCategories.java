/**
 * Valid movie categories.
 * 
 * @author Yasmin
 *
 */
public enum MovieCategories {

	ANIMATED, DRAMA, HORROR, SCIFI;

	public String toString() {
		return this.name().toLowerCase();
	}
}
