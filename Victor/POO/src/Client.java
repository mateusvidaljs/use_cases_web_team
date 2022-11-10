public class Client {
  private String name;
  private String lastName;
  private String cpf;

  public Client(String name, String lastName, String cpf) {
    setName(name);
    setLastName(lastName);
    setCpf(cpf);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
