//Author: Cat Smith
//assignment: 5-11



class division {
	public static void main(String[] args) {
		int count = 0;
		int x = 100;
		
		System.out.println("Counting from 100 - 200");
		System.out.println("Divisible by 5 or 6, but not both.");
		System.out.println("---------------------------");
		
		while(x<= 200 ){

		//if x % is equal to 0 OR x % 6 equals 0 
			if(x % 5 == 0 ^ x % 6 == 0){
				System.out.print(x + " ");
				count++;
			}
			
			if( count == 10){
				System.out.println(" ");
				count = 0;
			}
			
			x++;
		}
	}
}