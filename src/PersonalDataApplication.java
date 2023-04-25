import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

class PersonalData {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate dateOfBirth;
    private final long phoneNumber;
    private final char gender;

    public PersonalData(String surname, String name, String patronymic, LocalDate dateOfBirth, long phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    public String toString() {
        return surname + name + patronymic + " " + dateOfBirth.toString() + " " + phoneNumber + gender;
    }
}

//class InvalidDataFormatException extends Exception {
//    public InvalidDataFormatException(String message) {
//        super(message);
//    }
//}

public class PersonalDataApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String[] values = scanner.nextLine().split(" ");

        if (values.length != 6) {
            System.err.println("Ошибка: неверное количество данных");
            return;

        }
        String surname;
        String name;
        String patronymic;
        LocalDate dateOfBirth;
        short phoneNumber;
        char gender;
        try {
            surname = values[0];
            name = values[1];
            patronymic = values[2];
            dateOfBirth = LocalDate.parse(values[3], java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            phoneNumber = Short.parseShort(values[4]);
            gender = values[5].charAt(0);
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка: неверный формат даты");
            return;
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Ошибка: неверный формат номера телефона");
            return;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Ошибка: неверное количество данных");
            return;
        }
        if (gender != 'f' && gender != 'm') {
            System.err.println("Ошибка: неверное значение пола");
            return;
        }

        PersonalData personalData = new PersonalData(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
        String fileName = surname + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(personalData.toString());
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}