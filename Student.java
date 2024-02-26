class Student {

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getAdress() {
        return ("Страна Россия, Республика Крым, Кировский район, село " + adress);
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public Student(String surname, String name, String patronymic, String dateofbirth, String adress, String phonenumber, String faculty, int course) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateofbirth = dateofbirth;
        this.adress = adress;
        this.phonenumber = phonenumber;
        this.faculty = faculty;
        this.course = course;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Студент - " +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + patronymic + '\'' +
                ", ДатаРожд='" + dateofbirth + '\'' +
                ", Адрес='" + adress + '\'' +
                ", Телефон='" + phonenumber + '\'' +
                ", Факультет='" + faculty + '\'' +
                ", курс=" + course +
                '}';
    }

    String surname, name, patronymic, dateofbirth, adress, phonenumber, faculty;
    int course;

    public void LearningJava() {
        System.out.println("Студент " + name + " учит язык программирования Java");
    }

    public void LearningPython() {
        System.out.println("Студент " + name + " учит язык программирования Python");
    }

}