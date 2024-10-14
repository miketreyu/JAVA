package HolaMundo;

public class buclefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 0; i<=50;i++) {
			if(i%3==0 && i%5==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
