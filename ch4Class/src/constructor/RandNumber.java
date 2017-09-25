package constructor;
import java.util.Random;

public class RandNumber {
		
		
		public static void main(String[] args)
		{
			
			Random rand = new Random();
			for(int i=0; i<10; i++)
				System.out.println(rand.nextInt(20));
		}
}
