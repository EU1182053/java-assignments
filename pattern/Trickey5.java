package pattern;

public class Trickey5 {
    public static void main(String[] args) {
// 54321
// 5432
// 543
// 54
// 5

for(int i = 5; i >= 1; i--){
    int k = 5;
	for(int j = i; j >= 1; j--){
        System.out.print(k--);

	}
	System.out.println();
}
    }
}
