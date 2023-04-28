package utils;

import java.util.Map;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashMap;

public class ConvertionService {

	public static Map<Integer , String> mapChiffreRomain = new HashMap<Integer , String>();
	public static Map<Integer , Integer> mapChiffreQuatre = new HashMap<Integer , Integer>();
	public static Map<Integer , Integer> mapChiffreNeuf = new HashMap<Integer , Integer>();
	
	
	public ConvertionService()
	{
		initMap();
	}
	
	void initMap()
	{
		if(mapChiffreRomain.isEmpty())
		{
			mapChiffreRomain.put(1000 , "M");
			mapChiffreRomain.put(500 , "D");
			mapChiffreRomain.put(100 , "C");
			mapChiffreRomain.put(50 , "L");
			mapChiffreRomain.put(10 , "X");
			mapChiffreRomain.put(5 , "V");
			mapChiffreRomain.put(1 , "I");
			
			
			mapChiffreQuatre.put(4 , 1);
			mapChiffreQuatre.put(40 , 10);
			mapChiffreQuatre.put(400 , 100);
			
			mapChiffreNeuf.put(10,9);
			mapChiffreNeuf.put(100,90);
			mapChiffreNeuf.put(1000,900);
		}
	}
			
	public String convertChiffreToRomain(int chiffre)
	{
		String resultat = "" ;
		
		for (Integer key : new TreeSet<Integer>(mapChiffreRomain.keySet()).descendingSet())
		{
			int quotient = chiffre/key ;
			
			if(mapChiffreQuatre.containsKey( quotient * key))
			{
				resultat += mapChiffreRomain.get(key) 
							+ 
							mapChiffreRomain.get(key * 5 );
			}
			else
			{
				for(int i = 1;i<=quotient ; i++)
				{
					resultat += mapChiffreRomain.get(key);
				}
			}
			
			chiffre = chiffre%key ;
			
			//pour les cas des neuf,on les traite ici pour ne pas entrer dans la boucle for globale qui va induire a la division par 5,50 ...
			if( mapChiffreNeuf.containsKey(key)  && chiffre >= mapChiffreNeuf.get(key) )
			{
				resultat += mapChiffreRomain.get(key/10) 
						+ 
						mapChiffreRomain.get(key);
				
				chiffre -= mapChiffreNeuf.get(key) ;
			}
			
			
		}
		return resultat ;
	}
		
	
}
