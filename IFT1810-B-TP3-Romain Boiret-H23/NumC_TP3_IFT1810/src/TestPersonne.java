/* Fichier : TestPersonne
   Auteur : Romain Boiret
   Cours : IFT 1810 section B
   Trimestre : Hiver 2023
   But : Ce programme permet de faire appel et d'éxécuter les différentes fontions de la class "Personne".
   		 Ces fonctions permettent d'afficher des tableaux et de faire des opérations tel que de déterminer par exemple
   		 le nombre de personne qui sont nées au mois de mai.
   Derniere mise a jour : 14 Avril 2023

*/

public class TestPersonne {

    // � adapter cette m�thode pour une des questions demand�es
	static int combien(Personne[] pers, int nbPers, int anneeVoulue)
	{
		int compteur = 0;
		for(int i = 0; i < nbPers; i++)
			if (pers[i].getAnnee() == anneeVoulue)
				   compteur++;

        return compteur;

	}

	public static void main(String[] args) {


		 //Personne  pers1 = new Personne ("19/05/1997", 4),
      	           //pers2 = new Personne ("31/12/1990"), // par défaut 1 tasse de caf�
		           //pers3 = new Personne ("08/05/1994", 2);
		 		

		 //pers2.afficher("Infos de la deuxi�me personne");

         Personne[] pers  = {
        		              new Personne("16/07/2001", 2),
                              new Personne("02/05/1990"),
	                          new Personne("23/11/1996", 5),
	                          new Personne("19/05/2000" , 0),
	                          new Personne("30/05/1991" , 2),

	                        };
         
	     int nbPers = pers.length;
	     
	     System.out.printf("1. afficher le contenu du tableau pers au début \n\n");
	     System.out.printf("	Indice	Tableau pers \n");
	     System.out.printf("---------------------------------------------------- \n");	     
	     for(int i = 0; i < nbPers ; i++)
	    	 pers[i].affichertableau(i);
	     
	     System.out.printf("\n2. déterminer et afficher les informations de la personne qui consomme le plus de café \n\n");
	     pers[0].nbcafemax(pers);
	     
	     System.out.printf("\n3. réduire de 1 tasse de moins pour les personnes qui consomment de café");
	     System.out.printf("\n4. réafficher le tableau \n\n");
	     System.out.printf("	Indice	Tableau pers \n");
	     System.out.printf("---------------------------------------------------- \n");
	     for(int i = 0; i < nbPers ; i++)
	    	 pers[i].modifier(i);     
	     
	     System.out.printf("\n5. compter et afficher le nombre de personnes qui sont nées au mois de mai \n\n");
	     pers[0].moisdemai(pers);
	}

}
/* Execution :
1. afficher le contenu du tableau pers au début 

	Indice	Tableau pers 
---------------------------------------------------- 
	0	"16/07/2001"	2 tasses 
	1	"02/05/1990"	1 tasse (par défaut) 
	2	"23/11/1996"	5 tasses 
	3	"19/05/2000"	0 tasse 
	4	"30/05/1991"	2 tasses 

2. déterminer et afficher les informations de la personne qui consomme le plus de café 

La personne née le "23/11/1996" consomme le plus de café : 5 tasse(s) 

3. réduire de 1 tasse de moins pour les personnes qui consomment de café
4. réafficher le tableau 

	Indice	Tableau pers 
---------------------------------------------------- 
	0	"16/07/2001"	1 tasse (par défaut) 
	1	"02/05/1990"	0 tasse 
	2	"23/11/1996"	4 tasses 
	3	"19/05/2000"	0 tasse 
	4	"30/05/1991"	1 tasse (par défaut) 

5. compter et afficher le nombre de personnes qui sont nées au mois de mai 

Il y a 3 personnes qui sont nées au mois de mai
*/