import java.util.*;
public class searchinQuery {
	public static void main(String[] args) {
		//3. Terdapat dua buah array yaitu array INPUT dan array QUERY, 
		//silahkan tentukan berapa kali kata dalam QUERY terdapat pada array INPUT
		Scanner in = new Scanner(System.in);
		String [] inputArray;
		String [] queryArray;
		int inASize, quASize;
		int [] quACount;
		
		System.out.print("Masukan Jumlah Barisan Teks yang ingin dimasukan: ");
		inASize = in.nextInt();
		inputArray = new String[inASize];
		for (int i = 0; i < inASize; i++) {
			System.out.print("Masukan Teks["+(i+1)+"]: ");
			inputArray[i] = in.next();
		}
		for(String d:inputArray) {System.out.print(d+" ");}
		
		System.out.println("\n");
		
		System.out.print("Masukan Jumlah Barisan Teks Query: ");
		quASize = in.nextInt();
		queryArray = new String[quASize];
		for (int i = 0; i < quASize; i++) {
			System.out.print("Masukan Teks["+(i+1)+"]: ");
			queryArray[i] = in.next();
		}
		for(String d:queryArray) {System.out.print(d+" ");}
		
		System.out.println("\n\n");
		System.out.println("Mencari jumlah teks QUERY dalam input BARIS TEKS...");
		quACount = new int[quASize];
		
		for (int i = 0; i < quASize; i++) {
			int count = 0;
			for(String d:inputArray){
				if(queryArray[i].equals(d)) { count++; }
			}
			quACount[i] = count;
		}
		
		for (int i = 0; i < quASize; i++) {
			System.out.println(queryArray[i]+" muncul sebanyak "+quACount[i]);
		}
	}
}