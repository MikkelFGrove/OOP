package Module1_1.Variables;

import java.sql.SQLOutput;

public class AvgAge {
    public static void main(String[] args) {
        int ada_lovelace = 36;
        int dennis_ritchie = 70;
        int grace_hopper = 85;
        int hedy_lamarr = 85;
        int edsger_dijkstra = 72;
        int douglas_engelbart = 88;

        float male_avg = (float)(dennis_ritchie + edsger_dijkstra + douglas_engelbart)/3;
        float female_avg = (float)(ada_lovelace + grace_hopper + hedy_lamarr)/3;
        float avg = (male_avg + female_avg)/2;
        float diff = male_avg - female_avg;

        System.out.println("Average lifespan of male computer scientist: " + male_avg);
        System.out.println("Average lifespan of female computer scientist: " + female_avg);
        System.out.println("Average lifespan of computer scientist: " + avg);
        System.out.println("Males lives this much longer than female: " + diff);
    }
}

//Skriv nu en tekst på dansk hvor I ved hjælp af fagtermer forklarer hvad der sker.
//Sørg for at denne tekst er grundig nok til at en programmør kan genkonstruere
//ovenstående kode.
//          Denne kode erklærer en række int variabler ved navnene af berømte computer scientists
//          koden sætter disse variabler til at være alderen af hvad alderen på disse var da de døde
//          Dernæst udregner den gennemsittet af de mænd der er konstateret. Det samme gør den for kvinderne
//          Den udregner gennemsnittet af dem alle tilsammen. Og forskellen mellem gennemsnitslevealderen
//          af kvinder og mænd. ALle disse espressions bliver gemt i sine egne variabler.
//          Til sidst udprinter den alle disse værdier samt en beskrivelse af dem i terminalen.
