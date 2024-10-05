public class Accident {

	private static int identificateurs = 0; // identificateurs est le dernier identifiant
	private int id;                     // id est l'identifiant de l'accident
	private String cause;                     // cause est la cause d'un accident
	private int horodatage;                   // horodatage est la timestamp d'un accident

	// Constructeur
	public Accident(int temps, String c) {
		id = prochainID(); // Appelle la méthode pour obtenir le prochain identifiant
		horodatage = temps;
		cause = c;
	}

	// La méthode getHorodatage() retourne le temps de l’accident
	public int getHorodatage() {return horodatage;}

	// La méthode setHorodatage(int horodatage) permet de modifier manuellement
	// le temps de l’accident.
	public void setHorodatage(int horodatage) {this.horodatage = horodatage;}

	// La méthode getId() retourne l’identificateur de l’accident
	public int getId() {return id;}

	// La méthode prochainID() génère et retourne un nouvel identifiant
	// incrémenté de 1 pour chaque instance de la classe
	private static int prochainID() {return identificateurs++;}

	// La méthode getNombreDesAccidents() retourne le nombre total d’accidents
	public static int getNombreDesAccidents() {return identificateurs;}

	// La méthode setNombreDesAccidents(int n) permet de modifier manuellement
	// le nombre total d’accidents
	public static void setNombreDesAccidents(int n) {identificateurs = n;}

	// La méthode getCause() retourne la cause de l’accident
	public String getCause() {return cause;}

	// La méthode setCause(String c) permet de modifier la cause
	// de l’accident.
	public void setCause(String c) {this.cause = c;}
}
