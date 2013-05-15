import java.util.Date;

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

    buffer.append( "User ID: " + this.id + "\n" );
    buffer.append( "Name: " + this.firstName + " " + this.lastName );
    // TODO implement unless I'm nice and I do it
    return buffer.toString();
  }

  public static void main(String[] args) {
    User user = new User(1, "Jrob", "Roberts", new Date(1977, 8, 5), 'M');
    System.out.println( user );
  }
}
