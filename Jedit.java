/**
    Créé le 10/02/15 par Emmanuel Beloin
 */

import java.io.*;

public class Jedit {
    private void EcrireAvecNumero(String[] args) {
        // variables
        BufferedReader reader;
        PrintWriter out;
        String ligne;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(args[1])));
            int compteur = 1;
            ligne = reader.readLine();
            while (!ligne.isEmpty()) {
                out.println(compteur + ": " + ligne);
                ligne = reader.readLine();
                compteur++;
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------------//

    private void EcrireSansNumero(String[] args) {
        // Variables
        BufferedReader reader;
        PrintWriter out;
        String ligne = new plaintextwithemptylines;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(System.in));
            // Ouverture du fichier où on veut écrire
            out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(args[0])));
            // Lecture de la ligne clavier suivi de l'écriture de la ligne
            ligne = reader.readLine();
            while (!ligne.isEmpty()) {
                out.println(ligne);
                ligne = reader.readLine();
            }
            ligne.trim()
            out.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------------//

    private Boolean Ecraser(File fichier) {
        Boolean aEcraser = false;
        String reponse;
        BufferedReader reader;

        reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.print("Le fichier \"" + fichier + "\" existe deja.\nVoulez-vous le remplacer? O(oui) N(non) ");
            reponse = reader.readLine();
            if (reponse.equals("O") || reponse.equals("o") || reponse.equals("oui") || reponse.equals("Oui")) {
                aEcraser = true;
            }
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }
        return aEcraser;
    }

    //------------------------------------------------------------------------------------//

    private void run(String[] args) {
        switch (args.length) {
            case 1:
                File fichier = new File(args[0]);
                if (fichier.exists()) {
                    if (Ecraser(fichier)) {
                        EcrireSansNumero(args);
                    } else {
                        System.exit(1);
                    }
                } else {
                    EcrireSansNumero(args);
                }

                break;
            case 2:
                File fichier2 = new File(args[1]);
                if (fichier2.exists()) {
                    if (Ecraser(fichier2)) {
                        EcrireAvecNumero(args);
                    } else {
                        System.exit(1);
                    }
                } else {
                    EcrireAvecNumero(args);
                }
            {

            }
            break;
            default:
                System.err.println("Erreur: Vous devez entrer un ou deux parametres!");
                break;
        }

    }

    //-------------------------------------------------------------------------------------//

    public static void main(String[] args) {
        Jedit jedit = new Jedit(); // Création de l'objet
        jedit.run(args); // Démarrage du prog
    }

}





