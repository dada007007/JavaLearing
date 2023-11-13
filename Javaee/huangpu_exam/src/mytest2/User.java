package mytest2;

import java.time.LocalDate;

public class User {
    private Long id;
    private String gender;
    private LocalDate birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public User() {
    }

    public User(Long id, String gender, LocalDate birthday) {
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
    }
}
