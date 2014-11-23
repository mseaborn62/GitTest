
public class GitTest {
	public static void main(String[] args){
		System.out.println("Hello World");
		test1();
		test2();
		test3();
	}
	
	public static void test1(){
		for (int i=0; i<19; i++){
			System.out.println("Test 1 " + i);
		}
	}
	
	public static void test2(){
		for(int i=0; i<2; i++){
			System.out.println("Test 2 " + i);
		}
	}
	
	public static void test3(){
		System.out.println("Test 3");
	}
}
