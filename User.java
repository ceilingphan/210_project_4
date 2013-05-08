public class User {
  private int id;

  public User() {
    this.id = 0;
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
