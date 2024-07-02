package ex04;

/*
 * 
 *  사과를 담는데 필요한 바구니 수를 구하는 코드이다. 사과의 수는 123개
 *  한 바구니에는 10개가 담김. 13개가 필요할것, (1)에 맞는걸 넣으시오
 * 
 */
public class exam01 {
	public static void main(String[] args) {
		int numOFApples = 123;
		int sizeOFBucket = 10;
		int numOFBucket = (numOFApples) / (sizeOFBucket);

		if (numOFApples % sizeOFBucket > 0) {
			System.out.println("필요한 바구니의 수" + (numOFBucket + 1));
		} else {
			System.out.println("필요한 바구니의 수" + numOFBucket);
		}

	}

}
