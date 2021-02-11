package homework.task1;

import java.time.LocalDate;

public class Hero extends Person {

    public Hero(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override

    public String toString() {
        String date = birthDate.toString();
        String[] split = date.split("-");
        String[] reversedBirthDate = new String[split.length];
        String reversedDate = "";
        for (int i = 0; i < split.length; i++) {
            reversedDate += split[split.length - 1 - i].toString();
            if (i < 2) {
                reversedDate += "-";
            }

        }
        return "Bohater " +
                name + " urodzony w " + reversedDate;
    }
}
