package rk.diraj.celebguess;

public class QuestionLibrary {
    final int[] mQuestions = {
            R.drawable.tom_cruise, R.drawable.charlie_day, R.drawable.bill_burr, R.drawable.gal_gadot
    };


    private String mChoices [][] = {
            {"Ben Affleck", "Tom Cruise", "Morgan Freeman"},
            {"Mike Tyson", "Hugo Weaving", "Charlie Day"},
            {"Kevin Spacey", "Hugh Laurie", "Bill Burr"},
            {"Gal Gadot", "Scarlett Johansson", "Taylor Swift"}
    };



    private String mCorrectAnswers[] = {"Tom Cruise", "Charlie Day", "Bill Burr", "Gal Gadot"};

    public int getQuestion(int a) {
        int question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
