public class Kartenspiel {

    // Deklariere eine neue List fuer die Karten
    private List<Karte> karten;

    public void Kartenspiel() {

        // Initialisiere die Liste
        karten = new List<Karte>();

        // Erstelle ein neues Kartenspiel und fuege es der Liste hinzu
        String[] farben = {"Karo", "Herz", "Pik", "Kreuz"};
        String[] bilder = {"7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};

        for(String farbe : farben) {
            for(String bild : bilder) {
                karten.append(new Karte(farbe, bild));
            }
        }

    }

}
