/* Fichier : Personne
   Auteur : Romain Boiret
   Cours : IFT 1810 section B
   Trimestre : Hiver 2023
   But : Ce programme permet de répertorier et de programmer différentes fonctions qui permettent d'éffectuer des opérations pour la class "TestPersonne".
   Derniere mise a jour : 14 Avril 2023

*/

public class Personne {


	private String naissance;
	private int nbCafe;

	// 1er constructeur
	public Personne(String nais, int cafe)
	{
		naissance = nais;
		nbCafe = cafe;
	}

	// 2ième constructeur
	public Personne(String nais)
	{
		naissance = nais;
		nbCafe = 1; // par défaut
	}

	// quelques méthodes d'accès :

	public int getJour()
	{
		return Integer.parseInt(naissance.substring(0,2));
	}

	public int getAnnee()
	{
		return Integer.parseInt(naissance.substring(6));
	}


	public int getRangMois()
	{
		return Integer.parseInt(naissance.substring(3,5));
	}


    public String getMois()
    {
    	String[] nomMois = { "janvier", "f�vrier", "mars", "avril",
    	                     "mai", "juin", "juillet", "ao�t",
    	                     "septembre", "octobre", "novembre", "d�cembre"};
    	return nomMois[getRangMois()-1];
    }


	public void afficher(String en_tete)
	{
		System.out.printf("%s :\n", en_tete);

		System.out.printf(" Naissance : %d %s % d \n",
				getJour(), getMois(), getAnnee());

		System.out.printf(" Caf�      : %d tasse(s) par jour\n",
				                nbCafe);
	}
	
	
	public void affichertableau(int ind) {
		String tasse;
		if (nbCafe == 0)
			tasse = "tasse";
		else if(nbCafe == 1)
			tasse = "tasse (par défaut)";
		else
			tasse = "tasses";
	
		System.out.printf("	%d	\"%s\"	%d %s \n", ind, naissance, nbCafe, tasse);
		
	}
	
	public void nbcafemax(Personne[] p) {
		int maxc = 0;
		String maxn = "";
		for(int i = 0; i < p.length ; i++)
	    	 if (p[i].nbCafe > maxc) {
	    		 maxc = p[i].nbCafe;
	    		 maxn = p[i].naissance;
	    	 }
		System.out.printf("La personne née le \"%s\" consomme le plus de café : %d tasse(s) \n", maxn, maxc);

	}
	
    public void modifier(int ind) {
    	String tasse = "";
    	int somme = -1;
		 
    	if (this.nbCafe + somme >= 0)
    		this.nbCafe = this.nbCafe + somme;
    	
    	if (nbCafe == 0)
			tasse = "tasse";
		else if(nbCafe == 1)
			tasse = "tasse (par défaut)";
		else
			tasse = "tasses";
    			
    	System.out.printf("	%d	\"%s\"	%d %s \n", ind, naissance, nbCafe, tasse);
    	
    }
    
    public void moisdemai(Personne[] p) {
    	int compteur = 0;
    	for(int i = 0; i < p.length ; i++)
    		if(p[i].getRangMois() == 5)
    			compteur++;
    	
    	System.out.printf("Il y a %d personnes qui sont nées au mois de mai\n", compteur);
    	
    }
	

}
