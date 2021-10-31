package com.pb.bendarskiy.hw5;

public class Reader {
    private String fio;
    private String numberTiket;
    private String faculty;
    private int yearBorn;
    private String numberPhone;

    public Reader(String fio, String numberTiket, String faculty, int yearBorn, String numberPhone) {
        this.fio = fio;
        this.numberTiket = numberTiket;
        this.faculty = faculty;
        this.yearBorn = yearBorn;
        this.numberPhone = numberPhone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumberTiket() {
        return numberTiket;
    }

    public void setNumberTiket(String numberTiket) {
        this.numberTiket = numberTiket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void takeBook(String nameReader, int count) {
            System.out.println(nameReader + " взял " + count + " книги" );
        }
    public void takeBook(String nameReader, String nameBook) {
        System.out.println(nameReader + " взял книги: " + nameBook);
    }
    public void takeBook(String nameReader) {
        System.out.print(nameReader + " взял книги: ");
    }
    public void returnBook(String nameReader, int count1) {
        System.out.println(nameReader + " вернул " + count1 + " книги" );
    }
    public void returnBook(String nameReader, String nameBook) {
        System.out.println(nameReader + " вернул книги: " + nameBook);
    }
    public void returnBook(String nameReader) {
        System.out.print(nameReader + " вернул книги: ");
    }
        String getInfo() {
            return "ФИО: " + fio + ", номер читательского билета: " + numberTiket + ", факультет: "
                    + faculty + ", дата рождения: " + yearBorn + ", телефон: " + numberPhone;
    }
}