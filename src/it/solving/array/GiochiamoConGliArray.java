package it.solving.array;

import java.util.*;  

public class GiochiamoConGliArray{
	
	public static void main(String []args){
		
		int num = 2;
		int []numeri1 = {2,5,3,7,8};
		int []numeri2 = {6,2,9,3};
		int []numeri3 = {5,4,3,2,1}; 
		int prodottoScalare = 0;
		int []arrayUnito = GiochiamoConGliArray.creaUnione(numeri1,numeri2);
		
		prodottoScalare = GiochiamoConGliArray.calcolaScalare(num , numeri2);
		
		System.out.println(prodottoScalare);
		if(GiochiamoConGliArray.verificaMaggioreSuccessivo(numeri3))
		System.out.println("L'array è ordinato in maniera decrescente");
		System.out.println(Arrays.toString(aggiungiInCoda(numeri1, num)));
		System.out.println(Arrays.toString(arrayUnito));
		
	}
	
	//il metodo creaUnione prende in ingresso due array e te ne restituisce l'unione 	
	public static int[] creaUnione(int []a, int[]b){
		int length = (a.length + b.length);
		int []arrayUnito = new int[length];
		for(int i = 0 ; i < arrayUnito.length ; i++){
			if(i<a.length){
				arrayUnito[i] = a[i];
			}
			else
				arrayUnito[i] = b[i-a.length];
		}	
		return arrayUnito;
	}
	
	//il metodo calcolaScalare fa il prodotto scalare tra l'array e il numero in ingresso e restituisce il risutlato
	public static int calcolaScalare(int num, int[]a){
		int risultato = 0;
		for (int i = 0 ; i < a.length ; i++)
			risultato += num * a[i];
			
		return risultato ;
	}
	
	//il medoto verificaMaggioreSuccessivo verifica se l'array è ordinato in modo decrescente 
	public static boolean verificaMaggioreSuccessivo(int [] a){
		for(int i = 0 ; i < a.length -1  ; i++){
			if(a[i] < a[i+1])
				return false;
		}
		return true;
	}
	
	//il metodoto aggiungiInCoda aggiunge un intero alla fine dell'array che gli viene passato 
	public static int[] aggiungiInCoda(int []a, int num){
		
		int []arrayPiuLungo = new int[a.length + 1];
		
		for (int i = 0 ; i <= a.length ; i++){
			if(i<a.length){
				arrayPiuLungo[i] = a[i];
			}
			else
				arrayPiuLungo[i] = num ;
		}
		return arrayPiuLungo;
	}
}