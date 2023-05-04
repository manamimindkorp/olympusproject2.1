package olympusproject2;

import java.util.ArrayList;
import java.util.List;

public class SkyScrapper {

	public static void main(String[] args) {
		System.out.println("SkyScrapper");
		List<Integer> floorSizes = new ArrayList<>();
		floorSizes.add(4);
		floorSizes.add(5);
		floorSizes.add(1);
		floorSizes.add(2);
		floorSizes.add(3);
		
		/*floorSizes.add(1);
		floorSizes.add(2);
		floorSizes.add(3);
		floorSizes.add(8);
		floorSizes.add(9);
		
		floorSizes.add(10);
		floorSizes.add(4);
		floorSizes.add(5);
		floorSizes.add(7);
		floorSizes.add(6);*/
		
		int highest = floorSizes.size();
		int current = 0;
		
		for(int i=0; i<floorSizes.size();i++) {
			String floors = "";
			if(floorSizes.get(i) == highest) {
				current = i;
				floors = floors + floorSizes.get(i);
				highest = highest-1;
				for(int j=0; j<current;) {
					boolean change = false;
					if(floorSizes.get(j) ==highest) {
						floors = floors + "," + floorSizes.get(j);
						change =true;
						j=0;
						highest = highest-1;
					}
					if(!change){
						j++;
					}
				}
				System.out.println("Day: "+(i+1)+": " + floors);
			}else{
				System.out.println("Day: "+(i+1)+": ");
			}
		}
		

	}

}

