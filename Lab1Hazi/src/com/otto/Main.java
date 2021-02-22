package com.otto;

public class Main {

    public static void main(String[] args) {
		System.out.println("Itt kiírom a saját nevem, ékezetekkel");
		String nev = "Kis Pista";
		for (int i=0; i<nev.length(); ++i) {
			System.out.println(nev.charAt(i));
			}

		String monogram = "KP";
		String vezetekNev = "Kis";
		String keresztNev = "Pista";
		System.out.println(vezetekNev.charAt(0) + keresztNev.charAt(0)); //ez miért dolgozik számokkat karakterek helyett?

		String alma = "Almafa";
		for (int i=0; i<alma.length(); ++i) {
				System.out.println(alma.substring(0,i+1));//comments
		}

    }
}
