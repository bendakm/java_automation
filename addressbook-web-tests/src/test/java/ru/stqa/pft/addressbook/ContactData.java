package ru.stqa.pft.addressbook;

public class ContactData {
  private final String first_name;
  private final String last_name;
  private final String address;
  private final String home_telephone;
  private final String email;

  public ContactData(String first_name, String last_name, String address, String home_telephone, String email) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.address = address;
    this.home_telephone = home_telephone;
    this.email = email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getAddress() {
    return address;
  }

  public String getHome_telephone() {
    return home_telephone;
  }

  public String getEmail() {
    return email;
  }
}
