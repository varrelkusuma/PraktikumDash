import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Praktikan extends Mahasiswa {
  private static int count = 0;
  private char logo = '1';
  private Queue<Question> q = new LinkedList<>();


  private Praktikan(Builder builder) {
    this.pos = builder.pos;
    this.nama = builder.nama;
    count++;
    logo += count - 1;
  }

  // Builder Praktikan
  
  public static class Builder {
    private Position pos;
    private String nama;

    public Builder pos(Position _pos) {
      this.pos = _pos;
      return this;
    }

    public Builder nama(String _nama) {
      this.nama = _nama;
      return this;
    }


    public Praktikan create() {
      return new Praktikan(this);
    }

  }

  public char getLogo(){
		return logo;
	}

  public void addQuestion(Question[] question) {
    Random rand = new Random();
    int n = rand.nextInt(3) + 1;

    for (int i = 0; i < n; i ++ ) {
      int questionIndex = rand.nextInt(question.length);
      q.add(question[questionIndex]);
    }
  }

  public Queue<Question> getQueue() {
    return q;
  }

  public Question getQuestion() {
    Question head = q.poll();
    return head;
  }

  public boolean hasQuestion() {
    return (this.q.size() > 0);
  }

  public void move(Position p) {
    this.pos = p;
  }

}