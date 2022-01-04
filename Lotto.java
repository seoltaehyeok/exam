package mc.ys.s1309.test;
import java.util.Random;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto co = new Lotto();
		co.test();
	}
	
	public void test() {
		System.out.println("test");
		Random r = new Random();
		for(int k=0;k<10;k++) {
		// 1~45까지의 수 6개를 생성하는 코드를 작성하시오
		for(int i=0;i<6;i++) {
		int rnd = r.nextInt(45)+1;	//0<=rnd<45
		System.out.printf("%2d ", rnd); // format에서 %2d는 2칸 띄어라.
		}
		System.out.println();
	}
}
}