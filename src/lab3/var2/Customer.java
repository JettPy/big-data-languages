package lab3.var2;

// Лабораторная работа 3
// Вариант 2
// Задание 2
public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private String card_number;
    private String account_number;

    public int getId() {
        return id;
    }

    public Customer(int id, String name, String surname, String patronymic, String address, String card_number, String account_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.card_number = card_number;
        this.account_number = account_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Customer " + id + ": " +
                surname + " " + name + " " + patronymic +
                ", card: " + card_number + ", account: " + account_number +
                ", " + address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    @Override
    public int compareTo(Customer o) {
        return (this.surname + this.name + this.patronymic).compareTo(o.surname + o.name + o.patronymic);
    }
}
