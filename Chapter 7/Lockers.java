/*
Author: Cat Smith
Assign: 7-23, Locker Game
Date: Dec 11
*/

class Lockers {
	public static void main(String[] args) {
		boolean[] isOpen = new boolean[100];
		
		for (int i = 0; i < isOpen.length; i++){
			for(int j = 0; j < isOpen.length; j++){
				if((j + 1) % (i + 1) == 0){
					isOpen[j] = !isOpen[j];
				}
			}
		}
		
		
		//Display the open lockers
		for (int i = 0; i < isOpen.length; i++){
			if(isOpen[i] == true){
				System.out.print("Locker " + (i + 1) + " is Open. ");
			}
		}
	}
}