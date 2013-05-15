public class CscBook {
  public static User[] users;

  public static void main( String[] args ) {
    // EC: Prompt for the ID of the user using your program
    getCurrentUser();

    // 0. Load users from the Users directory
    //   a. Figure out how many users there are
    //   b. Store each user in an array
    loadUsers();

    int selection = -1;

    while( selection != 0 ) {
      // 1. List Users in the user directory
      //   ID: User Name
      listUsers();

      // 2. Prompt user to enter user ID or 0 to quit
      selection = getUserSelection();

      // 3. Get response
      //   a. If the user enters 0, exit program
      if( selection == 0 )
        break;
      //   b. Find the user we're interested in
      //     1) Display an error message if user not found
      User selectedUser = findUser( selection );
      if( selectedUser == null ) {
        System.out.println( "User " + selection + "not found." );
        continue;
      }

      //   c. Display the user
      System.out.println( selectedUser );

      // 4. Enter 1 to add a post, 2 to like a post, 3 to dislike
      //   a. ADD A POST
      //     1) Prompt for message
      //     2) Call add post on user (EC: supply author ID)
      //   b. LIKE A POST
      //     1) Prompt to enter post ID
      //     2) Find post
      //     3) Call like method on Post
      //   c. DISLIKE A POST - Same as b) only call dislike
      performAction( selectedUser );
    }
  }

  public static void getCurrentUser() {
    // EC: Get and store current user ID
  }

  public static void loadUsers() {
    // TODO Implement: Users directory, user files
  }

  public static void listUsers() {
    // TODO Implement
  }

  public static int getUserSelection() {
    // TODO Implement
    return 0;
  }

  public static User findUser( int selection ) {
    // TODO Implement
    // Iterate over user array, looking for the user with ID == selection
    // If a user is not found, return null
    return null;
  }

  public static void performAction( User user ) {
    // TODO: Prompt 1, 2, 3
    // If 1, do some add post stuff
    addPost( user );
    // IF 2, do some like post stuff
    likePost( user );
    // If 3, do some dislike post stuff
    dislikePost( user );
  }

  public static void addPost( User user ) {
    // TODO: implement
  }

  public static void likePost( User user ) {
    // TODO: Implement
  }

  public static void dislikePost( User user ) {
    // TODO: Implement
  }

  public static Post findPost( User user, int postId ) {
    // TODO: implement
    // Iterate over the user's posts,
    // return matching post or null if we don't find a matching post
    return null;
  }
}
