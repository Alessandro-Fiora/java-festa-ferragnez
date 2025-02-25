package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
public static void main(String[] args) {

    // ^ Creare array nomi invitati
    String[] invitedGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

    // ? Chiedere nome utente
    System.out.println("Inserisci il tuo nome:");
    Scanner scanner = new Scanner(System.in);
    String userName = scanner.nextLine();
    scanner.close();

    // ! Verificare se nome utente è presente nell'array
    boolean isInvited = false;

    for(int i = 0; i<invitedGuests.length; i++) {
            if (userName.toLowerCase().replaceAll("\\s","").equals(invitedGuests[i].toLowerCase().replaceAll("\\s",""))) {

                // * Se presente uscire dal ciclo
                isInvited = true;
                break;
            }
        }

        
        String result = isInvited ? "Benvenuto " + userName + "!" : "Mi dispiace " + userName + ", non sei stato invitato.";
        System.out.println(result);
    }
}
