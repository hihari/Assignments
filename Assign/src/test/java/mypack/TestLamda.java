package mypack;


interface Interf{
	public int addition(int i, int j);
}

public class TestLamda {

	public static void main(String[] args) {
		Interf inter = ((i,j)->{
			int k = i+j;
			System.out.println("hello "+k);
			return k;
		});
		inter.addition(2,3);
	}

}









