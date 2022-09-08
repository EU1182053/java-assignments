package pattern;

public class Trickey4 {
    public static void main(String[] args) {
// 12345
// 1234
// 123
// 12
// 1

for(int i = 5; i >= 1; i--){
    int k = 1;
	for(int j = 1; j <= i; j++){
        System.out.print(k++);	

	}
	System.out.println();
}
    }
}
