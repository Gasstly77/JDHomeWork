package extra_home_work_collections.dto;

import extra_home_work_collections.api.NameGenerator;
import extra_home_work_collections.utils.GenerateName;
import extra_home_work_collections.utils.GenerateNick;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String nick;
    private String password;
    private String name;

    public String createNick() throws Exception {
        NameGenerator newNick = new GenerateNick();
        return newNick.randomNameFormFile();
    }

    public String createPassword() {
        NameGenerator newName = new GenerateName();
        return newName.randomNameLatter();
    }

    public String createName() throws Exception {
        NameGenerator newName = new GenerateName();
        return newName.randomNameFormFile();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    public Person() throws Exception {
        this.nick = createNick();
        this.password = createPassword();
        this.name = createName();
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public int compareTo(Person o) {
        for (int i = 0; i < this.nick.length() && i < o.getName().length(); i++) {
            if ((int) this.nick.charAt(i) == (int) o.getName().charAt(i)) {
                continue;
            } else {
                return (int) this.nick.charAt(i) - (int) o.getName().charAt(i);
            }
        }

        if (this.nick.length() < o.getName().length()) {
            return (this.nick.length() - o.getName().length());
        } else if (this.nick.length() > o.getName().length()) {
            return (this.nick.length() - o.getName().length());
        } else {
            return 0;
        }
    }
}
