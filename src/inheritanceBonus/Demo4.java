package inheritanceBonus;

import java.util.Scanner;

public class Demo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");
        first.presentQuestion();
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        second.presentQuestion();
    }
}
