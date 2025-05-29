public class User{
  private String username;
  private String password;
  private String email;
  private String phoneNumber;
  private String address;
  public User() {
      this.username = "defaultUser";
      this.password = "defaultPass";
      this.email = "defaultEmail@example.com";
      this.phoneNumber = "123-456-7890";
      this.address = "123 Default St, Default City, DC 12345";
  }
  public User(String username, String password, String email, String phoneNumber, String address) {
      this.username = username;
      this.password = password;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.address = address;
  }
  public String getUsername() {
      return username;
  }
  public String getPassword() {
      return password;
  }
  public String getEmail() {
      return email;
  }
  public String getPhoneNumber() {
      return phoneNumber;
  }
  public String getAddress() {
      return address;
  }
  public void setUsername(String username) {
      this.username = username;
  }
  public void setPassword(String password) {
      this.password = password;
  }
  public void setEmail(String email) {
      this.email = email;
  }
  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }
  public void setAddress(String address) {
      this.address = address;
  }
  
}