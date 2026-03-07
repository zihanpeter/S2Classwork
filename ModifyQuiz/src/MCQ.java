public class MCQ {
    private String questionText;
    private String topic;

    /* other instance variables and methods may exist but are not shown */

    public MCQ(String questionText, String topic) {
        this.questionText = questionText;
        this.topic = topic;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getTopic() {
        return topic;
    }

    public String toString() {
        return questionText + " (" + topic + ")\n";
    }
}
