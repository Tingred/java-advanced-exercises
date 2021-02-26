package homework.task6;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {

    private final String peselNumber;
    private final int checkNumber;
    private final LocalDate birthDate;
    private final boolean sex;

    private Pesel(String peselNumber) {
        this.peselNumber = peselNumber;
        String[] peselNumberInArray = peselNumber.split("");
        this.checkNumber = Integer.parseInt(peselNumberInArray[10]);
        sex = Integer.parseInt(peselNumberInArray[9]) % 2 == 0;
        int year = 1900;
        int year2 = 2000;

        int month = Integer.parseInt(peselNumberInArray[2]) * 10 + Integer.parseInt(peselNumberInArray[3]);

        int day = Integer.parseInt(peselNumberInArray[4]) * 10 + Integer.parseInt(peselNumberInArray[5]);
        if (day < 10) {
            String dayString = Integer.toString(day);
            dayString = "0" + dayString;
            day = Integer.parseInt(dayString);
        }
        if (Integer.parseInt(peselNumberInArray[0]) > 2 && Integer.parseInt(peselNumberInArray[1]) > 1) {
            year += Integer.parseInt(peselNumberInArray[0]) * 10 + Integer.parseInt(peselNumberInArray[1]);
             if (month < 10 && day < 10) {
                String date = year + "-0" + month + "-0" + day;
                this.birthDate = LocalDate.parse(date);
            }
            else if (day < 10) {
                String date = year + "-" + month + "-0" + day;
                this.birthDate = LocalDate.parse(date);
            } else if (month < 10) {
                String date = year + "-0" + month + "-" + day;
                this.birthDate = LocalDate.parse(date);
            }  else {
                String date = year + "-" + month + "-" + day;
                this.birthDate = LocalDate.parse(date);
            }
        } else {
            year2 += Integer.parseInt(peselNumberInArray[0]) * 10 + Integer.parseInt(peselNumberInArray[1]);
            if (month < 10 && day < 10) {
                String date = year + "-0" + month + "-0" + day;
                this.birthDate = LocalDate.parse(date);
            }
            else if (day < 10) {
                String date = year + "-" + month + "-0" + day;
                this.birthDate = LocalDate.parse(date);
            } else if (month < 10) {
                String date = year + "-0" + month + "-" + day;
                this.birthDate = LocalDate.parse(date);
            }  else {
                String date = year + "-" + month + "-" + day;
                this.birthDate = LocalDate.parse(date);
            }
        }


    }

    public static Pesel of(String peselNumber) {
        if (checkPesel(peselNumber)) {
            return new Pesel(peselNumber);
        }
        return null;

    }

    public static boolean checkPesel(String peselNumber) {
        boolean controlDigit = false;
        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(peselNumber);
        if (matcher.matches()) {
            String[] peselArray = peselNumber.split("");
            int sum = 0;
            int[] numbers = {1, 3, 7, 9};
            int counter = 0;

            //checkCheckNumber
            for (int i = 0; i < peselArray.length - 1; i++) {
                if (counter == 4) {
                    counter = 0;
                }
                int lastDigit;
                if (Integer.parseInt(peselArray[i]) * numbers[counter] > 9) {
                    lastDigit = Integer.parseInt(peselArray[i]) * numbers[counter] % 10;
                } else lastDigit = Integer.parseInt(peselArray[i]) * numbers[counter];
                sum += lastDigit;
                counter++;
            }
            int lastSumDigit = sum % 10;
            if (10 - lastSumDigit == Integer.parseInt(peselArray[10]))
                controlDigit = true;
            return controlDigit;
        }
        return false;
    }

    public LocalDate birthDate() {
        return this.birthDate;
    }

    public String get() {
        return this.peselNumber;
    }

    public boolean isMale() {
        return !this.sex;
    }

    public boolean isFemale() {
        return this.sex;
    }


}
