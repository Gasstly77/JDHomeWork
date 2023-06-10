package extra_home_work_collections.dto;

import extra_home_work_collections.api.NameGenerator;
import extra_home_work_collections.utils.GenerateAlias;

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private int age;
    private String nick;

    public Animal() throws Exception {
        this.age = createAge();
        this.nick = createNick();
    }

    public int createAge () {
        return (1 + (int) (Math.random() * 15));
    }

    public String createNick() throws Exception {
        NameGenerator newNick = new GenerateAlias();
        return newNick.randomNameFormFile();
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public int compareTo(Animal o) {
        for (int i = 0; i < this.nick.length() && i < o.getNick().length(); i++) {
            if ((int) this.nick.charAt(i) == (int) o.getNick().charAt(i)) {
                continue;
            } else {
                return (int) this.nick.charAt(i) - (int) o.getNick().charAt(i);
            }
        }

        if (this.nick.length() < o.getNick().length()) {
            return (this.nick.length() - o.getNick().length());
        } else if (this.nick.length() > o.getNick().length()) {
            return (this.nick.length() - o.getNick().length());
        } else {
            return 0;
        }
    }
}
