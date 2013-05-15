public class User {
  private int id;
  private String firstName;
  private String lastName;
  private Date dob;
  private char gender;
  private String location;
  private String profession;
  private Post[] posts;

  public User() {
    this.id = 0;
    this.firstName = "Unknown";
    this.lastName = "Unknown";
    this.dob = null;
    this.gender = '?';
    this.location = "Unknown";
    this.profession = "Unknown";
    this.posts = null;
  }

  public User(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public static void main(String[] args) {
    User test_user = new User();
    System.out.println("Test User's id is " + test_user.getId());
    test_user.setId(42);
    System.out.println("Test User's id is " + test_user.getId());
  }
}
