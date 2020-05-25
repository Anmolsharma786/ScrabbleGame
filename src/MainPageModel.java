import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class MainPageModel {
    static int totalPoints;
    static HashMap<Character, Integer> hash1 = new HashMap<Character, Integer>();
    static String errors="";
    private static Button m;
    static ArrayList<Boolean> booleans = new ArrayList<>();
    static ArrayList<String> lastWord = new ArrayList<>();

    public static boolean currentWords( String currentWord, String totalPoints, boolean evaluator){
        int MAXPOINTS = Integer.parseInt(totalPoints);
        Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(currentWord);
        if(MAXPOINTS<=186) {
            if (currentWord.length() != 0) {
                if (currentWord.length() != 1) {
                    if (currentWord.length() <= 8) {
                        if (m.find()) {
                            if (!booleans.contains(false)) {
                                    return true;
                            } else {
                                errors=("Word contains letter that is no longer available “in bag” ");
                                return false;
                            }
                        } else {
                            errors=("Word does not include vowel ");
                            return false;
                        }
                    } else {
                        errors=("Word is too long (more than 8 characters)  ");
                        return false;
                    }
                } else {
                    errors=("Word is too short (only 1 character) ");
                    return false;
                }
            } else {
                errors=("Word is blank ");
                return false;
            }
        }
        else{
            errors=("GAME OVER YOU PLAYED WELL");
        }
        return false;
    }

    public static  String previousWord(String previousWord, String currentWord,int comm){
        //Keeping the structure of last word in ArrayList
        lastWord.add(currentWord);
        if (comm == 0) {
            previousWord= currentWord;
        }
        else{
            previousWord = previousWord+", "+currentWord;
        }

        return previousWord;
    }
    public static int totalScore(String currentWord){
        hash1.put(' ',0);
        hash1.put(',',0);
        hash1.put('A',1);
        hash1.put('B',3);
        hash1.put('C',3);
        hash1.put('D',2);
        hash1.put('E',1);
        hash1.put('F',4);
        hash1.put('G',2);
        hash1.put('H',4);
        hash1.put('I',1);
        hash1.put('J',8);
        hash1.put('K',5);
        hash1.put('L',1);
        hash1.put('M',3);
        hash1.put('N',1);
        hash1.put('O',1);
        hash1.put('P',3);
        hash1.put('Q',10);
        hash1.put('R',1);
        hash1.put('S',1);
        hash1.put('T',1);
        hash1.put('U',1);
        hash1.put('V',4);
        hash1.put('W',4);
        hash1.put('X',8);
        hash1.put('Y',4);
        hash1.put('Z',10);


        char[] d = currentWord.toUpperCase().toCharArray();
        for (Character c : d) {
            totalPoints += hash1.get(c);
        }
        return totalPoints;
    }
    public static String error(){
        return errors;
    }
    public static boolean textChange(ArrayList<Label> abc, String code, ArrayList<Button> btns){
        Label z = new Label("label"+code.toUpperCase());
        m= new Button("btn"+code.toUpperCase());
        boolean evaluator = true;

        for (int i = 0; i <abc.size() ; i++) {
            if(abc.get(i).getId().equals(z.getText())){
                z=abc.get(i);
                int q = Integer.parseInt(abc.get(i).getText());
                if(q>0) {
                    abc.get(i).setText(valueOf(q - 1));

                    if(booleans.contains(false)==true){
                        booleans.remove(i-1+1);
                    }
                }
                if(q == 0) {
                    evaluator = false;
                    booleans.add(false);
                    for (int j = 0; j <btns.size() ; j++) {
                        if(btns.get(i).getId().equals(m.getText())){
                            m = btns.get(i);
                            m.setOpacity(0);
                        }
                    }
                    return evaluator;
                }
                break;
            }
            else{continue;}
        }
        return true;
        }
}
