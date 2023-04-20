# Kartenspiel

## Mischen der Karten

### Anforderungen
Diese Methode soll das Kartenspiel mischen. Dazu sollen 32 Mal zwei zufällig ausgewählte Karten ihren Platz tauschen.

### Visualisierung
![OIP](https://user-images.githubusercontent.com/110174069/233306776-e2e8705f-c38a-49d5-9b18-487609015900.jpg)

### Teilprobleme
Das Problem ist in zwei Teilprobleme zu unterteilen:
<ol>
<li>
<b>Auswählen zweier Karten nach dem Zufallsprinzip:</b>
Hierfür bietet sich das Java-Eigene Math.random an, welches einen Double Wert zwischnen null und eins erzeugt. Diesen kann man nun mit 31 multiplizieren und zu einem Integer casten, und somit einen gültigen Index für ein 32 Karten Deck zurückbekommen.
</li>
<li>
<b>Das tauschen zweier Karten:</b>
Hierfür wird eine Hilfskarte verwendet, welche die erste Karte zwischenspeichert. Anschließend wird die zweite Karte an die erste Karte gesetzt und die Hilfskarte an die zweite Karte gesetzt. Im folgenden habe ich die Methode <i>tauschen</i> implementiert, welche die beiden Karten tauscht.
</li>
</ol>

### Implementation
<i>Noch nicht hinzugefügt</i>


## Karten überprüfen

### Anforderungen
![img](https://user-images.githubusercontent.com/110174069/233300418-01f5e091-7299-4dc1-9dbe-8ef1f401f800.png)

Diese Methode soll überprüfen ob eine bestimmte Karte nach Farbe und Bild vorhanden ist. Es wird ein boolean zurückgegeben, welcher angibt ob die Karte vorhanden ist oder nicht.

### Visualisierung
<i>Noch nicht hinzugefügt</i>

### Implementation
<i>Noch nicht hinzugefügt</i>


## Aussortieren

### Anforderungen
![img_2](https://user-images.githubusercontent.com/110174069/233300509-fd32bbc7-ee2f-4aba-b7ec-7de2ba5866b2.png)

Diese Methode soll alle Karten einer gegebenen Farbe aussortieren.

### Visualisierung
<i>Noch nicht hinzugefügt</i>

### Teilprobleme
Um eine Karte entfernen zu können müssen wir zum einen durch das Array iterieren können. Hierzu mache ich Nutzen der for-each Schleife in Java, da ein Array ein iterierbarer Datentyp ist.
Anschließend muss die Aktuelle Karte abgefragt werden um die Farbe dieser festzustellen.
Ist die Farbe der Karte gleich der auszusortierenden Farbe, so wird diese mit einem Null-Pointer ersetzt.

### Implementation
<i>Noch nicht hinzugefügt</i>
