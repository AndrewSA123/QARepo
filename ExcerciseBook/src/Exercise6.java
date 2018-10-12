import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		List<Integer> StartingList = new ArrayList<Integer>();
		
		StartingList.add(0, 1);
		StartingList.add(1, 1);
		StartingList.add(2, 2);
		int FirstPrev = 0;
		int SecondPrev = 0;

		for (int i : StartingList) {
			if (i == FirstPrev || i == SecondPrev) {
				StartingList.remove(i);
			}
			SecondPrev = FirstPrev;
			FirstPrev = i;
		}
		for (int i : StartingList) {
			System.out.println(i);
		}
		StartingList.stream().distinct();
		
	}

}
