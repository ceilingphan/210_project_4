import java.util.Date;

public class Post {
  private int id;
  private Date timestamp;
  private String message;
  private int authorId;
  private int likes;

  public Post( String message ) {
    // TODO implement, set default values for timestamp, likes, authorId
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();

    buffer.append( "Post ID: " + this.id + " (" + this.likes + ") like this \n" );
    buffer.append( message );
    buffer.append( "Created at: " + this.timestamp.toString() );

    return buffer.toString();
  }

  public void like() {
    // TODO implement
  }

  public void dislike() {
    // TODO implementation
  }
}
