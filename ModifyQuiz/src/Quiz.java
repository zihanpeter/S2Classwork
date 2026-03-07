import java.util.ArrayList;

public class Quiz {
    private ArrayList<MCQ> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(MCQ mcq) {
        questions.add(mcq);
    }

    /* adjust this method so that all questions with the given topic are correctly removed */
    public void removeQuestionsByTopic(String topic) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getTopic().equals(topic)) {
                questions.remove(i);
                i--;
            }
        }
    }

    public ArrayList<MCQ> getQuestions() {
        return questions;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        MCQ q1 = new MCQ("Are private members inherited?", "Inheritance");
        MCQ q2 = new MCQ("What is the definition of procedural abstraction?", "Class Design");
        MCQ q3 = new MCQ("How can the reliability of a system be improved?", "Class Design");
        MCQ q4 = new MCQ("What is the difference between System.out.print and println?", "Using Objects and Methods");
        MCQ q5 = new MCQ("What is method overriding?", "Inheritance");
        MCQ q6 = new MCQ("What is an interface?", "Inheritance");
        MCQ q7 = new MCQ("Why might a system behave differently for different users?", "Class Design");

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);
        quiz.addQuestion(q5);
        quiz.addQuestion(q6);
        quiz.addQuestion(q7);

        quiz.removeQuestionsByTopic("Inheritance");

        System.out.println(quiz.getQuestions());
    }
}
