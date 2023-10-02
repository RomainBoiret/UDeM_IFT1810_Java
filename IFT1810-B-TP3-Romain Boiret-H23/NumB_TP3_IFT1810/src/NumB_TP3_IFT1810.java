/* Fichier : Numero B du TP3
   Auteur : Romain Boiret
   Cours : IFT 1810 section B
   Trimestre : Hiver 2023
   But : Ce programme permet répertorier et d'afficher dans la console deux numéros de téléphone (celui de Jean et de l'UdM dans le cas présent),
   		 Et de faire fonctionner différentes fonctions qui permettent de faire différentes opérations avec ces deux numéros tel que de déterminer 
   		 (par exemple combien il y a de 3 dans le numéro de tel de l'UdM, ou d'afficher les chiffres impairs communs de ces 2 numéros).
   Derniere mise a jour : 14 Avril 2023

*/

public class NumB_TP3_IFT1810 {

	static void afficher(String tele, String nom)
	{
	  System.out.printf("Le téléphone %s :", nom);
	  System.out.printf(" (%s) %s-%s\n",
			  tele.substring(0, 3),
			  tele.substring(3, 6),
			  tele.substring(6));
	}
	
	static int nombre(String tele, char chiffreVoulu)
	{
	  int n = 0;
	  for(int i = 0; i < tele.length(); i++)
		  if (tele.charAt(i) == chiffreVoulu)
			  n++;
	  
	  return n;
		
	}
	
	static int impairs(String tele, String deQui)
	{
		int nbrimpairs = 0;
		String impairs = "13579";
    			
		for(int i = 0; i < tele.length(); i++)
		{
			char chiffre = tele.charAt(i);
			if (impairs.indexOf(chiffre) >= 0)
				nbrimpairs++;
			
		}
		return nbrimpairs;

	}

	static int pairs(String tele, String deQui)
	{
		int nbrpairs = 0;
		String pairs = "02468";
    			
		for(int i = 0; i < tele.length(); i++)
		{
			char chiffre = tele.charAt(i);
			if (pairs.indexOf(chiffre) >= 0)
				nbrpairs++;
			
		}
		return nbrpairs;

	}
    		
    		
	static void afficher2Impairs(String tele, String deQui)
	{
		System.out.printf("Les chiffres impairs pr�sents successivement dans %s : ", deQui);
		String impairs = "13579";
		
		for(int i = 0; i < tele.length(); i++)
		{
			char chiffre = tele.charAt(i);
			if (impairs.indexOf(chiffre) >= 0)
				System.out.printf(" %c ", chiffre);
			
		}
		System.out.printf("\n");
	}
    
	static void impairscommuns(String teleUdM, String teleJean)
	{
		String impairs = "13579";
    	String valeurs = ""; 		
		for(int i = 0; i < teleUdM.length(); i++)
		{
			char chiffre1 = teleUdM.charAt(i);
			int nbrimpairs = 0;
			if (impairs.indexOf(chiffre1) >= 0)
				if (teleJean.indexOf(chiffre1) >= 0)
					nbrimpairs++;

			if (nbrimpairs > 0 && valeurs.indexOf(chiffre1) == -1)
				valeurs = valeurs + chiffre1 + " ";
		}
		System.out.printf("Les chiffres impairs communs de ces 2 numéros de téléphone : %s\n", valeurs);

	}
    		
    		public static void main(String[] args) {
    			
    	       String telUdM = "5143436111",
					  telJean = "4501897654";

    	       /* afficher :
    	        * Le téléphone d'UdM : (514) 343-6111
    	        * Le téléphone de Jean : (450) 189-7654
    	        */
				afficher(telUdM,"d'UdM");   	       
				afficher(telJean, "de Jean");


    	       /* compter puis afficher :
				* Il y a 2 fois le chiffre '3' dans le numéro de téléphone de d'UdM
				* Il y a 4 fois le chiffre '1' dans le numéro de téléphone de d'UdM
				* Il y a 0 fois le chiffre '2' dans le numéro de téléphone de Jean
    	        */
				System.out.printf("Il y a %d fois le chiffre '3' dans le numéro de téléphone de d\'UdM\n",
				nombre(telUdM,'3'));
				System.out.printf("Il y a %d fois le chiffre '1' dans le numéro de téléphone de d\'UdM\n",
				nombre(telUdM,'1'));	       
				System.out.printf("Il y a %d fois le chiffre '2' dans le numéro de téléphone de Jean\n",
    	    	nombre(telJean,'2'));


				/* compter puis afficher :
                 * Il y a 7 fois les chiffres impairs dans le numéro de téléphone d’UdM.
                 * Il y a 5 fois les chiffres pairs dans le numéro de téléphone de Jean.
    	         */
				System.out.printf("Il y a %d fois les chiffres impairs dans le numéro de téléphone de d\'UdM\n",
				impairs(telUdM, "d'UdM"));
				System.out.printf("Il y a %d fois les chiffres pairs dans le numéro de téléphone de Jean\n",
				pairs(telJean, "de Jean"));
				
				
				/* déterminer et afficher :
                 * les chiffres impairs communs de ces 2 numéros de téléphone :  5    1
    	         */	
				impairscommuns(telUdM, telJean);

    		}


}
/* Execution :
Le téléphone d'UdM : (514) 343-6111
Le téléphone de Jean : (450) 189-7654
Il y a 2 fois le chiffre '3' dans le numéro de téléphone de d'UdM
Il y a 4 fois le chiffre '1' dans le numéro de téléphone de d'UdM
Il y a 0 fois le chiffre '2' dans le numéro de téléphone de Jean
Il y a 7 fois les chiffres impairs dans le numéro de téléphone de d'UdM
Il y a 5 fois les chiffres pairs dans le numéro de téléphone de Jean
Les chiffres impairs communs de ces 2 numéros de téléphone : 5 1
*/ 