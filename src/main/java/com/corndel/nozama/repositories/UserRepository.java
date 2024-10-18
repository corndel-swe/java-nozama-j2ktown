package com.corndel.nozama.repositories;

import com.corndel.nozama.DB;
import com.corndel.nozama.models.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  public static List<User> findAll() throws SQLException {
    var query = "SELECT id, username, firstName, lastName, email, avatar FROM users";

    try (var con = DB.getConnection();
        var stmt = con.createStatement();
        var rs = stmt.executeQuery(query);) {

      var users = new ArrayList<User>();
      while (rs.next()) {
        var id = rs.getInt("id");
        var username = rs.getString("username");
        var firstName = rs.getString("firstName");
        var lastName = rs.getString("lastName");
        var email = rs.getString("email");
        var avatar = rs.getString("avatar");

        users.add(new User(id, username, firstName, lastName, email, avatar));
      }

      return users;
    }
  }

  public static User findById(int id) throws SQLException {
    // TODO: finish this method
    // query i want to write
    var query =  "SELECT * FROM users WHERE users.id = ?";

    // get sql database connection and create statement
    try(var connection = DB.getConnection();
        var statement = connection.prepareStatement(query)) { // if connection and statement prepared then

      statement.setInt(1, id); // replace first ? with variable to stop sql injection

      try(var resultSet = statement.executeQuery()){ // if we get a result set from db than
        if (!resultSet.next()){ // make sure there is a result
          return null;
        }

        var userId = resultSet.getInt("id");
        var username = resultSet.getString("username");
        var firstName = resultSet.getString("username");
        var lastName = resultSet.getString("username");
        var email = resultSet.getString("username");
        var avatar = resultSet.getString("username");

        return new User(userId,username,firstName,lastName,email,avatar);

      }
    }
  }


  public static User createUser(User user){

    // get user details
    String username = user.getUsername();
    String firstName = user.getFirstName();
    String lastName = user.getLastName();
    String email = user.getEmail();
    String avatar = user.getAvatar();
    return user;




  }
}
