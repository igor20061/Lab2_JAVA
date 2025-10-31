
public class Name {
    private String Surname;     // Фамилия
    private String Name;        // Личное имя
    private String MiddleName;  // Отчество

    // Конструктор для всех трех параметров
    public Name(String Surname, String Name, String MiddleName) {
        this.Surname = Surname;
        this.Name = Name;
        this.MiddleName = MiddleName;
    }

    public Name(String Surname, String Name) {
        this(Surname, Name, null);
    }

    public Name(String Name) {
        this(null, Name, null);
    }

    // Метод для приведения к строковому виду
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (Surname != null && !Surname.isEmpty()) {
            fullName.append(Surname);
        }

        if (Name != null && !Name.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(Name);
        }

        if (MiddleName != null && !MiddleName.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(MiddleName);
        }

        return fullName.toString();
    }

    // Переопределение метода toString() для удобного вывода
    @Override
    public String toString() {
        return getFullName();
    }
}
