import java.util.Date;
import java.io.File;
import java.io.FileWriter;

public class User {
  private int id;
  private String firstName;
  private String lastName;
  private Date dob;
  private char gender;
  private String location;
  private String profession;
  private Post[] posts;

  public User(int id, String firstName, String lastName, Date dob, char gender) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.gender = gender;
  }

  public int getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getDob() {
    return this.dob.toString();
  }

  public char getGender() {
    return this.gender;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation( String location ) {
    this.location = location;
  }

  public String getProfession() {
    return this.profession;
  }

  public void SetProfession( String profession ) {
    this.profession = profession;
  }

  public Post[] getPosts() {
    return this.posts;
  }

  public void addPost( String message ) {
    // TODO implement
    Post post = new Post(message);
    writePostToUserFile( post );
  }

  public void addPost( String message, int authorId ) {
    // TODO implement for EC, temporary implementation:
    addPost( message );
  }

  public int age() {
    // TODO implement
    return -1;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();

    buffer.append( String.format( "[%d] %s %s - %s\n", this.id, this.firstName, this.lastName, this.gender ) );
    buffer.append( String.format( "%d years old (Born %s)\n", this.age(), this.dob.toString() ));
    buffer.append( String.format( "%s in %s\n", this.profession, this.location ) );
    for( int i = 0; posts != null && i < posts.length; i++ )
      buffer.append( this.posts[i].toString() + "\n" );
    buffer.append("\n");

    return buffer.toString();
  }

  public static void main(String[] args) {
    User user = new User(1, "Jrob", "Roberts", new Date(1977, 7, 5), 'M');
    System.out.println( user );

    user.addPost( "Testing the post save thingie." );
    user.addPost( "Another test..." );
    System.out.println( user );
  }

  private void writePostToUserFile( Post post ) {
    // Check that we have valid input
    File file = new File( String.format( "users/%d.user", this.getId() ) );
    if( post == null || ! file.exists() )
      return;

    // This would normally be automatically handled by DB...
    post.setId( posts == null ? 0 : posts.length );

    try {
      FileWriter writer = new FileWriter( file, true );
      writer.append( post.serialize() );
      writer.flush();
      writer.close();
    } catch( Exception ex ) {
      System.out.println( "Failed to store post. " );
      ex.printStackTrace();
    }

    // Update the current user object, you're welcome
    Post[] tempPosts = new Post[ posts == null ? 1 : posts.length + 1 ];
    if( posts != null )
      System.arraycopy( posts, 0, tempPosts, 0, posts.length );

    posts = tempPosts;
    posts[ posts.length - 1 ] = post;
  }
}
