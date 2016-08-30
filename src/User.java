/**
 * Created by danielmcbryde on 8/29/16.
 */

// this creates a user for the website


public class User {
    String name;
    boolean isAdmin = false;
    String[] participatedInTheseHunts;
    boolean hasWonAHunt;
    int moneyWon;
    int rank = 1;

  public User(String name, boolean isAdmin) {
      this.name = name;
      this.isAdmin = isAdmin;

  }

  public void setName(String n) {
      this.name =n;
  }

  public String getName() {
      return name;
  }

  public void increaseRank() {
      rank = rank + 1;
  }

  public void increaseRank(int rankBump) {
      rank = rank + rankBump;
  }

}
