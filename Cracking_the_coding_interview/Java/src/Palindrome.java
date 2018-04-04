
public class Palindrome {

	//ref: the book
	public static boolean isPermutationOfPalindrom(String phrase) {
		int bitVector = createBitVector(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}
	
	//���ڿ��� ���� ��Ʈ ���͸� �����.
	//���� i�� ���ڰ� �����ϸ� i��° ��Ʈ���� �ٲ۴�.
	public static int createBitVector(String phrase)
	{
		int bitVector = 0;
		for (char c: phrase.toCharArray()){
			int x = getCharNumber(c);
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}
	
	//������ i��° ��Ʈ���� �ٲ۴�.
	public static int toggle(int bitVector, int index) {
		if (index < 0) return bitVector;
		int mask = 1 << index;
		if ((bitVector & mask) == 0){
			bitVector |= mask;
		}else {
			bitVector &= ~mask;
		}
		return bitVector;
	}
	
	public static boolean checkExactlyOneBitSet(int bitVector){
		return (bitVector & (bitVector -1)) == 0;
	}
	
	public static boolean isPermutationOfPalindrome(String phrase){
		int bitVector = createBitVector(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}
	
	public static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}	
	
	public static void main (String[] args) {
		String pali = "Rats live onnnfg no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}
}

