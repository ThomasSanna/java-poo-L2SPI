/**
 * SANNA THOMAS L2SPI
 * Cette classe représente un robot avec des attributs tels que sa référence, son nom, ses coordonnées x et y,
 * et son orientation. Elle permet de créer des robots, de les déplacer et d'afficher leurs informations.
 * 
 * @version 1.0.0
 * @author Sanna Thomas
 */
package exercice4;

public class Robot {
	
	// ATTRIBUTS
	
	private String refRobot;
	private String nomRobot;
	private int x, y; 
	private int orientationRobot;
	private static int totalRobotCree = 0;
	
	// CONSTRUCTEUR
	
	/**
	 * Constructeur qui crée un robot avec un nom, des coordonnées et une orientation spécifiés.
	 * Incrémente le compteur de robots créés.
	 * 
	 * @param nomRobot Le nom du robot.
	 * @param x Coordonnée x du robot.
	 * @param y Coordonnée y du robot.
	 * @param orientationRobot L'orientation du robot (1 pour NORD, 2 pour EST, 3 pour SUD, 4 pour OUEST).
	 */
	public Robot(String nomRobot, int x, int y, int orientationRobot) {
		totalRobotCree++;
		setRefRobot("ROB" + totalRobotCree);
		setNomRobot(nomRobot);
		setX(x);
		setY(y);
		setOrientationRobot(orientationRobot);
	}
	
	/**
	 * Constructeur qui crée un robot avec un nom par défaut ("ROB" suivi du numéro de création),
	 * des coordonnées par défaut (0, 0) et une orientation par défaut (NORD).
	 * Incrémente le compteur de robots créés.
	 * 
	 * @param nomRobot Le nom du robot.
	 */
	public Robot(String nomRobot) {
		this(nomRobot, 0, 0, 1);
	}
	
	// METHODES
	
	/**
	 * Retourne une représentation textuelle des informations du robot, y compris son nom, sa référence,
	 * ses coordonnées et son orientation.
	 * 
	 * @return Une chaîne de caractères représentant les informations du robot.
	 */
	public String toString() {
		return "Nom du robot : " + nomRobot + "\nRéférence du robot : " + refRobot + "\nCoordonnées du robot : (" + x + "," + y + ")" + "\nDirection du robot : " + this.chaineOrientation();
	}
	
	/**
	 * Déplace le robot d'une unité dans la direction actuelle (NORD, EST, SUD ou OUEST).
	 * Affiche un message d'erreur si le déplacement conduit à des coordonnées négatives.
	 */
	public void deplacer() {
		if ((x == 0 && orientationRobot==4) || (y == 0 && orientationRobot==3)) {
			System.out.println("Erreur : On ne peut pas aller à des coordonnées négatives.");
		}
		else {
			switch(orientationRobot) {
			case 1:
				y++;
				break;
			case 2:
				x++;
				break;
			case 3:
				y--;
				break;
			case 4:
				x--;
				break;
			}
		}
	}
	
	/**
	 * Retourne une chaîne de caractères représentant l'orientation du robot.
	 * 
	 * @return Une chaîne de caractères représentant l'orientation du robot.
	 */
	public String chaineOrientation() {
		switch(orientationRobot) {
		case 1:
			return "NORD";
		case 2:
			return "EST";
		case 3:
			return "SUD";
		case 4:
			return "OUEST";
		default :
			return "Erreur : Mauvaise orientation du robot.";
		}
	}
	
	/**
	 * Affiche les informations du robot sur la console, y compris son nom, sa référence, ses coordonnées et son orientation.
	 */
	public void afficheToi() {
		System.out.println(
				"Nom du robot : " + nomRobot +
				"\nRéférence du robot : " + refRobot +
				"\nCoordonnées du robot : (" + x + "," + y + ")" +
				"\nDirection du robot : " + this.chaineOrientation()
				);
	}
	
	// GETTERS & SETTERS
	
	/**
	 * Retourne la référence du robot.
	 * 
	 * @return La référence du robot.
	 */
	public String getRefRobot() {
		return refRobot;
	}

	/**
	 * Définit la référence du robot.
	 * 
	 * @param refRobot La nouvelle référence du robot.
	 */
	public void setRefRobot(String refRobot) {
		this.refRobot = refRobot;
	}

	/**
	 * Retourne le nom du robot.
	 * 
	 * @return Le nom du robot.
	 */
	public String getNomRobot() {
		return nomRobot;
	}

	/**
	 * Définit le nom du robot.
	 * 
	 * @param nomRobot Le nouveau nom du robot.
	 */
	public void setNomRobot(String nomRobot) {
		this.nomRobot = nomRobot;
	}

	/**
	 * Retourne l'orientation du robot.
	 * 
	 * @return L'orientation du robot.
	 */
	public int getOrientationRobot() {
		return orientationRobot;
	}

	/**
	 * Définit l'orientation du robot, mais uniquement si elle est dans la plage de 1 à 4.
	 * 
	 * @param orientationRobot La nouvelle orientation du robot.
	 */
	public void setOrientationRobot(int orientationRobot) {
		if (orientationRobot >= 1 && orientationRobot <= 4) {
			this.orientationRobot = orientationRobot;
		}
		else {
			System.out.println("Erreur : Impossible de mettre des orientations autres que 1, 2, 3 ou 4.");
		}
	}

	/**
	 * Retourne la coordonnée y du robot.
	 * 
	 * @return La coordonnée y du robot.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Définit la coordonnée y du robot, mais uniquement si elle est supérieure ou égale à 0.
	 * 
	 * @param y La nouvelle coordonnée y du robot.
	 */
	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
		else {
			System.out.println("Impossible de mettre une coordonnée (y) négative !");
		}
	}

	/**
	 * Retourne la coordonnée x du robot.
	 * 
	 * @return La coordonnée x du robot.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Définit la coordonnée x du robot, mais uniquement si elle est supérieure ou égale à 0.
	 * 
	 * @param x La nouvelle coordonnée x du robot.
	 */
	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
		else {
			System.out.println("Impossible de mettre une coordonnée négative !");
		}
	}

	/**
	 * Retourne le nombre total de robots créés.
	 * 
	 * @return Le nombre total de robots créés.
	 */
	public static int getTotalRobotCree() {
		return totalRobotCree;
	}

	/**
	 * Définit le nombre total de robots créés.
	 * 
	 * @param totalRobotCree Le nouveau nombre total de robots créés.
	 */
	public static void setTotalRobotCree(int totalRobotCree) {
		Robot.totalRobotCree = totalRobotCree;
	}
	
}
