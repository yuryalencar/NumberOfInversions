/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.edu.br;

/**
 *
 * @author YURY
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileAnalyzer analyzer = new FileAnalyzer(args[0]);
            System.out.println(new InversionAnalyzer().getNumberOfInversions(analyzer.readArchive()));
        } catch (Exception e) {
            System.out.println("Oops! An error has occurred:\n* " + e.getMessage());
        }
    }

}
