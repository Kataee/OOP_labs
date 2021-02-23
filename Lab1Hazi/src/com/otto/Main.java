package com.otto;

public class Main {

    public static void main(String[] args) {

    	//2. feladat

		System.out.println("Itt kiírom a saját nevem, ékezetekkel");
		String nev = "Kis Pista";
		for (int i=0; i<nev.length(); ++i) {
			System.out.println(nev.charAt(i));
			}

		String vezetekNev = "Kis";
		String keresztNev = "Pista";

		//I NEED HALP
		//String monogram = vezetekNev.charAt(0) + keresztNev.charAt(0);
		//System.out.println(monogram); //ez miért dolgozik számokkal karakterek helyett?

		//3. feladat
		String alma = "Almafa";
		for (int i=0; i<alma.length(); ++i) {
			System.out.println(alma.substring(0,i+1));
		}

		//4. feladat
		String monogram = ""; //redeclaration, bc the code above is commented out
		String name = "Kis Pista Babos Panna";
		String[] nameSplit = name.split(" ");
		for (String a : nameSplit) {
			System.out.println(a.charAt(0));
			monogram += a.charAt(0);

		}
		System.out.println(monogram);

		//==========Függvények

		//1es feladat
		double x[] ={7, 1, -3, 45, 9};
		System.out.printf("MAX: %6.2f\n", maxElement( x ));

		//2es feladat
		System.out.println(getBit(13,1));

		//3as feladat
		for (int i=0; i<=31; ++i) {
			System.out.println(countBits((i)));
		}


	}

	//----------------------------------------
	//FÜGGVÉNYEK
	//1es feladat
	public static double maxElement( double array[] ){
		double max = Double.NEGATIVE_INFINITY;
		for( int i=0; i<array.length; ++i ){
			if( array[i] > max){
				max = array[ i ];
			}
		}
		return max;
	}

	//2es feladat
	public static byte getBit(int number, int order) {
    	String bin = Integer.toBinaryString(number);
    	//System.out.println("Length = " + bin.length());
    	if (bin.length() <= order) {
			return -1;
		}
		return (byte) ((number >> order) & 1);
	}

	//3as feladat
	public static int countBits(int number){
    	String binNumber = Integer.toBinaryString(number);
    	int count = 0;
    	for (int i=0; i<binNumber.length(); ++i) {
    		if (binNumber.charAt(i) == '1') {
    			count++;
			}
		}
    	return count;
	}
}
