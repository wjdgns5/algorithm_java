package _1st_week;

import java.util.ArrayList;
import java.util.List;

public class _01_06_find_prime_list_under_number {
	
	public static List<Integer> find_prime_list_under_number(int number) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 2; i <= number; i++) {
			 boolean is_prime = true;
			 
			 for(int j=2; j< i; j++) {
				 
				 if(i%j == 0) {
					 is_prime = false;
					 break;
				 }
			 }
				
			     if (is_prime) {
			    	 list.add(i);
			     }
		}
		
		return list;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( find_prime_list_under_number(20) );

	}

}

