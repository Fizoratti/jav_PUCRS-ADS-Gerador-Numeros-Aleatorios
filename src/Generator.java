import java.util.*;

public class Generator {
 
    public static double generate() {
			return Math.random();
		}

		public static ArrayList<Double> generate(int value) {
			ArrayList values = new ArrayList();
			for(int i = 0; i < value; i++){
				values.add(i, generate());	
			}
			return values;
		}
}