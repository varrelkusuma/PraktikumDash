public class Question {
  private String question;
  private String answer;

  public Question(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  public String getQuestion() {
    return this.question;
  }

  public String getAnswer() {
    return this.answer;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String toString() {
    String hasil;
    hasil = "Pertanyaannya adalah : " + this.question;
    return hasil;
  }
}
