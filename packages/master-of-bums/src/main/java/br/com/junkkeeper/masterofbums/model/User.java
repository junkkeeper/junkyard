package br.com.junkkeeper.masterofbums.model;

public class User {

  private String message;
  private String name;

  public User (String message, String name) {
    this.message = message;
    this.name = name;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User(message='" + message + "', name='" + name + "')";
  }
}
