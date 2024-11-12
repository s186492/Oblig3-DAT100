package no.hvl.dat100.oppgave4;

import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        java.io.File fil = new java.io.File(mappe, filnavn);

        try {
            
            java.io.FileWriter fileWriter = new java.io.FileWriter(fil);
            java.io.PrintWriter writer = new java.io.PrintWriter(fileWriter);

            writer.print(samling.toString());

            writer.close();
            return true; 

        } catch (java.io.IOException e) {
            
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
            return false; 
        }
		
	}
}
