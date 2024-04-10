package exercice5;

/** Classe repr�sentant quelquechose mais on ne sait pas quoi!! 
 *  <B> son unique but est d'illustrer Javadoc  </B>
 *  @version 0.0 
 *	
 *  @author  Personne en particulier
 */

public class QuelqueChose {
	  /** Identifiant d�un � QuelqueChose �  
	   * Sert � le d�signer
	   */
	public int id;
	  /** Secret d�un � QuelqueChose � 
	   * On ne sait pas vraiment ce que cela repr�sente
	   */
 	public int secret ;

	  /** Constructeur d'un quelqueChose 
	   * @param i Indique le <b>fameux</b> id
	     @param s Indique un nombre servant au calcul de secret*/
	  public QuelqueChose(int i, int s)
	    {
	      id = i;
	      secret=s *15;
	    }

	  /**Reponse à une question métaphysique sur un quelquechose �*/
	  public boolean  existe()
	    {
	      return true;
	    }
}

