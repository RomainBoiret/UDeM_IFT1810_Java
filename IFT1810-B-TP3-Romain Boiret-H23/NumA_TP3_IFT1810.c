/* Fichier : Numero A du TP3
   Auteur : Romain Boiret
   Cours : IFT 1810 section B
   Trimestre : Hiver 2023
   But : Ce programme permet d'afficher le contenu de trois tableaux chacun regroupant les donnees differentes d'une entreprise (postes, nombre de cafes consommes par personne, age de chaque employe) a l'aide d'une fonction de type void.
   		 Puis, d'effectuer des analyses comme par exemple de compter et d'afficher le nombre de programmeurs ou encore de determiner et d'afficher l'age maximal de tous les employes, tout ça à l'aide de fonctions de type return.
   		 A la fin, le programme tri toutes les donnees en fonction de l'age des employes du plus jeune au plus vielle employe a l'aide d'une nouvelle fonction de type void.
   Derniere mise a jour : 10 Avril 2023

*/

#include <stdio.h>
#include <limits.h>
#include <float.h>
  
/* Fonction void ayant pour but d'afficher le contenu des 3 tableaux avant le tri */		     
   void afficher(char poste[], int nbCafe[], int age[], 
       int nbPers, char quand[])
   {
      printf("Contenu de 3 tableaux %s:\n", quand);
	  printf("Rang	nbCafe	Age	Poste\n");    
  	  for ( int i = 0; i < nbPers; i++)
  	  {
    	printf("%d	%d	%d", i, nbCafe[i], age[i]);
    	switch (poste[i])
    	{
        	case 'P' : printf("	programmeur\n"); break;
        	case 'O' : printf("	operateur\n"); break;
       		case 'A' : printf("	analyste\n"); break;
		}
  	  }	       	       	
   }

/* Fonction return ayant pour but de compter le nombre de programmeur */
  int programmeurs(char poste[], int nbPers)
  {
  	int nbProgrammeurs = 0;
	    	
  	for( int i = 0 ; i < nbPers ; i++ )
    if (poste[i] == 'P')
        nbProgrammeurs++;
        	 
  return nbProgrammeurs;    
  }
/* Fonction return ayant pour but de compter le nombre d'analystes */
  int annalystes(char poste[], int nbPers)
  {
  	int nbAnalystes = 0;
	    	
  	for( int i = 0 ; i < nbPers ; i++ )
    if (poste[i] == 'A')
        nbAnalystes++;
        	 
  return nbAnalystes;    
  }
/* Fonction return ayant pour but de compter le nombre d'operateurs */
  int operateurs(char poste[], int nbPers)
  {
  	int nbOperateurs = 0;
	    	
  	for( int i = 0 ; i < nbPers ; i++ )
    if (poste[i] == 'O')
        nbOperateurs++;
        	 
  return nbOperateurs;    
  }
/* Fonction return ayant pour but de compter le nombre d'employes ayant plus de 30 ans */
  int plusdetrente(int age[], int nbPers)
  {
  	int nbplusdetrente = 0;
	    	
  	for( int i = 0 ; i < nbPers ; i++ )
    if (age[i] >= 30)
        nbplusdetrente++;
        	 
  return nbplusdetrente;    
  }
/* Fonction return ayant pour but de compter le nombre d'employes consommant 3 tasses de cafe ou plus par jour */
  int plusdetroiscafe(int nbCafe[], int nbPers)
  {
  	int nbplusdetroiscafe = 0;
	    	
  	for( int i = 0 ; i < nbPers ; i++ )
    if (nbCafe[i] >= 3)
        nbplusdetroiscafe++;
        	 
  return nbplusdetroiscafe;    
  }
/* Fonction return ayant pour but de determiner consommation maximale de cafe de tous les employes */
  int consomaxcafeEMP(int nbCafe[], int nbPers)
  {
  	int nbconsomaxcafeEMP = -INT_MAX;
	    	
	for(int i = 0; i < nbPers; i++)
	    if (nbCafe[i] > nbconsomaxcafeEMP)
	        nbconsomaxcafeEMP = nbCafe[i];
        	 
  return nbconsomaxcafeEMP;    
  }
/* Fonction return ayant pour but de determiner l'age maximal de tous les employes */
  int agemaxEMP(int age[], int nbPers)
  {
  	int nbagemaxEMP = -INT_MAX;
	    	
	for(int i = 0; i < nbPers; i++)
	    if (age[i] > nbagemaxEMP)
	        nbagemaxEMP = age[i];
        	 
  return nbagemaxEMP;    
  }
  
  
/* Fonction void ayant pour but de trier les 3 trableaux selon les ages */
  void trier(char poste[], int nbCafe[], int age[], int nbPers)
  {
   for (int i = 0; i < nbPers-1 ; i++)
  {
    int indMin = i ;
    for (int j = i+1; j < nbPers; j++)
        if (age[j] < age[indMin])
                indMin = j;
    if(indMin != i)
    {
        int tempo = age[i];
        age[i] = age[indMin];
        age[indMin] = tempo;
            
        int tempoPoste = poste[i];
        poste[i] = poste[indMin];
        poste[indMin] = tempoPoste;
        
        int temponbCafe = nbCafe[i];
        nbCafe[i] = nbCafe[indMin];
        nbCafe[indMin] = temponbCafe;
    }             
        
  }

  }

int main()
{
  char poste[] = { 'P', 'P', 'O', 'A', 'P', 'A', 'P', 'P' };
  int nbCafe[]= { 3, 1, 5, 0, 3, 4, 0, 3 },
        age[] = { 25, 19, 27, 30, 65, 24, 56, 29  } ;
  int nbPers = sizeof(poste) / sizeof(char);
            
  /* affichage des tableaux avant le tri*/
  afficher(poste, nbCafe, age, nbPers, "avant le tri");
  
  /* Rendus des differentes fonctions */  
  printf("Nombre de programmeurs : %d\n"
  		 , programmeurs(poste, nbPers));
  		 
  printf("Nombre d'analystes : %d\n"
  		 , annalystes(poste, nbPers));

  printf("Nombre d'operateurs : %d\n"
  		 , operateurs(poste, nbPers));

  printf("Nombre d'employes ayant plus de trente ans : %d\n"
  		 , plusdetrente(age, nbPers));

  printf("Nombre d'employes consommant 3 tasses de cafe ou plus par jour : %d\n"
  		 , plusdetroiscafe(nbCafe, nbPers));
      
  printf("Consommation maximale de cafe de tous les employes : %d\n"
  		 , consomaxcafeEMP(nbCafe, nbPers));
  		 
  printf("Age maximal de tous les employes : %d\n"
  		 , agemaxEMP(age, nbPers));
              
  /* tri par selection selon les ages : */
  trier(poste, nbCafe, age, nbPers) ;
  
  // affichage des tableaux apres le tri selon les ages
  afficher(poste, nbCafe, age, nbPers, "apres le tri");
  
 return 0 ; 
}
/* Execution :
Contenu de 3 tableaux avant le tri:
Rang    nbCafe  Age     Poste
0       3       25      programmeur
1       1       19      programmeur
2       5       27      operateur
3       0       30      analyste
4       3       65      programmeur
5       4       24      analyste
6       0       56      programmeur
7       3       29      programmeur
Nombre de programmeurs : 5
Nombre d'analystes : 2
Nombre d'operateurs : 1
Nombre d'employes ayant plus de trente ans : 3
Nombre d'employes consommant 3 tasses de cafe ou plus par jour : 5
Consommation maximale de cafe de tous les employes : 5
Age maximal de tous les employes : 65
Contenu de 3 tableaux apres le tri:
Rang    nbCafe  Age     Poste
0       1       19      programmeur
1       4       24      analyste
2       3       25      programmeur
3       5       27      operateur
4       3       29      programmeur
5       0       30      analyste
6       0       56      programmeur
7       3       65      programmeur

--------------------------------
Process exited after 0.05976 seconds with return value 0
Appuyez sur une touche pour continuer...
*/ 
