package com.otto;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

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
		String monogram = "";
		monogram = vezetekNev.charAt(0) + keresztNev.charAt(0) + "";
		System.out.println(monogram); //ez miért dolgozik számokkal karakterek helyett? //tegyél hozzá még egy üres stringet

		//3. feladat
		String alma = "Almafa";
		for (int i=0; i<alma.length(); ++i) {
			System.out.println(alma.substring(0,i+1));
		}

		//4. feladat
		monogram = ""; //redeclaration, bc the code above is commented out //no redeclaration anymore
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

		//4es feladat
		//double[] array = {};
		double[] array = {6.0,2.0,3.0, 1.0};
		System.out.printf("A tömb átlaga: %.2f\n", mean(array)); //az f az nem float? mi a jelölés a double -re?

		//5ös feladat
		//double[] arrayForDeviation = {6.0,2.0,3.0, 1.0};
		double[] arrayForDeviation = {1.0,4.0,7.0, 2.0, 6.0};
		System.out.printf("A tömb szórása: %.2f\n", stddev(arrayForDeviation) );


		//6os feladat
		double[] arrayForMax2 = {1.0,2.0,3.0,4.0,5.0,6.0};
		System.out.println("A 2 legnagyobb elem: " + Arrays.toString(max2(array)));
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

	//4es feladat
	public static double mean(double[] array) {
		if (array.length == 0) {
			return Double.NaN;
		}
		double average=0;
		for (Double i : array) {
			average += i;
		}
		average /= array.length;
    	return average;
	}

	//5ös feladat
	public static double stddev(double[] array) {
		double arrayAverage = mean(array);  //function from 4es feladat

		double distance;
		ArrayList<Double> distanceArray = new ArrayList<Double>();
		for (double i : array) {
			distance = distance(i, arrayAverage);
			distanceArray.add(distance);
			System.out.printf("%f ", distance);

		}

		double sumOfDistance = sumOfDistance(distanceArray);
		System.out.printf("Összeg: %f ", sumOfDistance);
		double finding = finding(array.length, sumOfDistance);
		double result = Math.sqrt(finding);
		//System.out.printf("A tömb szórása: ", result);

		return result;
	}

	//számoljuk ki két szám távolságát
	public static double distance (double number, double average) {
		double distance = Math.pow( (number - average), 2);
		return distance;
	}

	//számoljuk ki a távolságok összegét
	public static double sumOfDistance (ArrayList<Double> array) {
    	double sumOfNumbers = 0;
    	for (Double i : array) {
    		sumOfNumbers += i;
		}
    	return sumOfNumbers;
	}

	//osszuk el az összeget az elemek számával
	public static double finding (int length, double sumOfNumbers) {
    	return (sumOfNumbers/length);
	}



	//6os feladat
	public static double[] max2 (double[] array){
		double[] max ={Double.NEGATIVE_INFINITY,
				Double.NEGATIVE_INFINITY};
		if( array.length == 0 ){
			return max;
		}

		if (array.length == 1) {
			double[] maxOf1 = {array[0], array[0]};
			return maxOf1;
		}

		double max1 = array[0];
		double max2 = array[1];
		for (int i=2; i<array.length-1; i++) {
			if (max1 < array[i]) { max1 = array[i]; };
			if (max2 < array[i+1]) { max2 = array[i+1]; };
		}

		if (max1 > max2) {
			double temp = max1;
			max1 = max2;
			max2 = temp;
		}
		//System.out.println("Max1: " + max1);
		//System.out.println("Max2: " + max2);
		return new double[]{max1, max2};

	}
}
