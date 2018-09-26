
public class TallyCounter {
		
		// Instance Variables
		
		private int count;
		
		
		// Constructor
		
		public TallyCounter() {
			
			count = 0;
		}
		
		public TallyCounter(int startNum) {
			
			count = startNum;
		}
		
		public void click() {
			
			count = count + 1;
			//count++; = count + 1
			//count+=1;
		}

	}


