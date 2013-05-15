import java.util.Date;

public class Post {
  private int id;
  private Date timestamp;
  private String message;
  private int authorId;
  private int likes;

  public Post( String message ) {
    // TODO implement, set default values for timestamp, likes, authorId
    this.message = message;
    this.timestamp = new Date();
  }

  public void setId( int id ) {
    this.id = id;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();

    buffer.append( String.format("[Post %d] %d likes, created %s\n", this.id, this.likes, this.timestamp.toString() ) );
    buffer.append( message );

    return buffer.toString();
  }

  public void like() {
    // TODO implement
  }

  public void dislike() {
    // TODO implementation
  }

  public String serialize() {
    return String.format( "%d,%d,%s,%d,%d\n",
      this.id,
      this.timestamp.getTime(),
      this.message,
      this.likes,
      this.authorId
    );
  }
}
