import java.util.Scanner;
public class BinaryConverter {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number you would like to convert into binary: ");
		int num= in.nextInt();
		convertBinary(num);

	}
	public static void convertBinary(int num){
		int store[]=new int[100];
		int i =0;
        while (num > 0){
        	store[i] = num%2;
            i++;
            num = num/2;
	}
        for (int j = i - 1 ; j >= 0 ; j--){
            System.out.print(store[j]);

}
}
}