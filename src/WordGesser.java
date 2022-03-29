
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordGesser {
    private static final ArrayList<String> names = new ArrayList<>();
    private final String WordData = "src/words.txt";
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<String> SortedNames = new ArrayList<>();
    private String actualWord;
    boolean[] played;
    int counter;
    int randomInt;
    static int wordListSize;

    public static void main(String[] args) {
        WordGesser ns = new WordGesser();
        ns.loadNames();
        ns.AddWords();
        wordListSize = SortedNames.size();
        ns.createPlayedArray(wordListSize);
        ns.GAME();
    }

    public void print(String a) {
        System.out.println(a);
    }

    public void GAME() {

        createGesserWord();
        if (played[randomInt]) {
            if (counter < SortedNames.size()) GAME();
            else System.exit(22);
        } else {
            played[randomInt] = true;
            print("Hier ist dein Wort");
            print(actualWord);
            GessWord();
        }
    }

    public void GessWord() {
        print("Bitte gib die Lösung ein: ");
        String input = scanner.nextLine();
        if (Objects.equals(input, names.get(randomInt))) {
            counter += 1;
            print("Du hast das Word erraten!");
            GAME();
        } else GessWord();
    }

    public void createGesserWord() {
        Random random = new Random();
        randomInt = random.nextInt(wordListSize);
        actualWord = SortedNames.get(randomInt);
    }

    public void createPlayedArray(int size) {
        played = new boolean[size];
        for (int i = 0; i < size; i++) played[i] = false;
    }

    public void AddWords() {
        for (String name : names) {
            char[] tempChar = name.toCharArray();
            Arrays.sort(tempChar);
            SortedNames.add(String.valueOf(tempChar));
        }
    }

    public void loadNames() {
        BufferedReader reader;
        String zeile;

        try {
            reader = new BufferedReader(new FileReader(WordData));
            zeile = reader.readLine();

            ArrayList<String[]> values = new ArrayList<>();

            while (zeile != null) {
                values.add(zeile.split("\n"));
                zeile = reader.readLine();
            }
            //System.out.println(values.size());
            //System.out.println(zeile);
            for (String[] value : values) {
                //System.out.println((Arrays.toString(value)));
                names.add(Arrays.toString(value).replace("[", "").replace("]", ""));
                //String.substring(1,strLen-1)
            }

        } catch (IOException e) {
            System.err.println("Error2 :" + e);
        }
    }
}
