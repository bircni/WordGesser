package Gesser.languages;

import java.util.ListResourceBundle;

public class LangResource_de extends ListResourceBundle {

    /**
     * @return words for the selected language
     */
    @Override
    protected Object[][] getContents()
    {
        return new Object[][]{{"solutionQuestion", "Bitte gib die Lösung ein: "}, {"solutionText", "Du hast das Word erraten!"}, {"mode", """
                Welchen Modus willst du spielen?
                 1 : Einfach
                 2 : Schwer
                 3 : Sehr Schwer"""}, {"easyMode", "Du hast 'einfach' ausgewählt"}, {"hardMode", "Du hast 'schwer' ausgewählt"}, {"ultrahardMode", "Du hast 'sehr schwer' ausgewählt"}, {"noSelect", "Das kannst du nicht auswählen!"}, {"finish", "Du hast alle Wörter erraten"}, {"wordReq", "Hier ist dein Wort"}, {"resource", "GameResource/words_de.txt"}, {"NoSelect", "Das gibt es nicht!"}, {"Trys", "Du hast "}, {"Trys2", " Versuche gebraucht."}, {"Saves", "resources/ShuffelWords.txt"}};
    }
}