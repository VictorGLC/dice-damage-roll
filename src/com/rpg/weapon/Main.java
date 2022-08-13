package com.rpg.weapon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
    	// Exemplos para serem inseridos no input:
    	// 2d6+1d4+6
    	// 2d8+1d6+1d3
    	// 1d12
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dano da arma: ");
        String damageWeaponInput = sc.next();
    	int totalDamage=0;
        
    	try {
	        if(damageWeaponInput.contains("+")) {
	        	String[] separateEachDiceDamage = damageWeaponInput.split("\\+");
	 
	        	for(String dice : separateEachDiceDamage) {
	        		if(dice.contains("d")) {
	        			totalDamage+=rollDiceDamage(dice);
	        		} else {
	        			System.out.println("Dano bônus: "+dice);
		        		totalDamage+=Integer.parseInt(dice);
		        	}
	        	}
	        } else {
	        	totalDamage=rollDiceDamage(damageWeaponInput);
	        }
	        System.out.println();
	        System.out.println("Dano total: " + totalDamage);
    	} catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Valor invalido");
    	} finally {
    		sc.close();
    	}
    }
    
    public static int rollDiceDamage(String weaponDamage) {
        String[] separated = weaponDamage.split("d");
        int quantityToRoll = Integer.parseInt(separated[0]);
        int diceFace = Integer.parseInt(separated[1]);
        int total=0;
        
        for(int i=1; i<=quantityToRoll; i++) {
             int rand = (int)(Math.random() * diceFace) + 1;
             System.out.println(i+ "º dado d"+diceFace+": "+rand);
             total+=rand;
        }
        return total;
    }
}
