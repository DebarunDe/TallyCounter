import java.util.*;
public class TallyCounterMain {

	public static void main(String[] args) {
		
		TallyCounter counter1 = new TallyCounter();
		TallyCounter counter2 = new TallyCounter();
	
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		counter1.reset();
		System.out.println(counter1.getCount());

}
}

