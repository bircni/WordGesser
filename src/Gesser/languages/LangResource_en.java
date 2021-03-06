package Gesser.languages;

import java.util.ListResourceBundle;

public class LangResource_en extends ListResourceBundle {

    /**
     * @return words for the selected language
     */
    @Override
    protected Object[][] getContents()
    {
        return new Object[][]{{"solutionQuestion", "Please insert your solution: "}, {"solutionText", "You got the word!"}, {"mode", """
                Which mode do you want to play?
                 1 : Easy
                 2 : Hard
                 3 : Ultra Hard"""}, {"easyMode", "Your choice: 'Easy'"}, {"hardMode", "Your choice: 'Hard'"}, {"ultrahardMode", "Your choice: 'Ultra Hard'"}, {"noSelect", "You can't select this!"}, {"finish", "You got all words right!"}, {"wordReq", "Here is your word:"}, {"resource", "GameResource/words_en.txt"}, {"NoSelect", "This is not existing!"}, {"Trys", "You needed "}, {"Trys2", " trys."}, {"Saves", "resources/ShuffelWords.txt"}};
    }
}