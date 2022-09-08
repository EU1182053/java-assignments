package pattern;

public class Trickey3 {
    public static void main(String[] args) {
// 5
// 54
// 543
// 5432
// 54321

for(int i = 1; i <= 5; i++){
	int k = 5;
	for(int j = 1; j <= i; j++){
		
        System.out.print(k--);

	}
	System.out.println();
}
    }
}
