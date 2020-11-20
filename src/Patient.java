/*
 Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */

import java.util.Arrays;

public class Patient {

    private static int countPatients;
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String phoneNumber;
    private long medCard;
    private String diagnosis;


    public Patient() {
//        this.id = 0;
//        this.name = "";
//        this.surname = "";
//        this.middleName = "";
//        this.address = "";
//        this.phoneNumber = "";
//        this.medCard = 0;
//        this.diagnosis = "";

    }
    public Patient(int id, String surname, String name, String middleName, String address, String phoneNumber, long medCard, String diagnosis) {
        countPatients++;
        this.id = countPatients;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.medCard = medCard;
        this.phoneNumber = phoneNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedCard() {
        return medCard;
    }
    public void setMedCard(long medCard) {
        if (medCard > 0) {
            this.medCard = medCard;
        } else System.out.println("Номер медицинской карты не может быть отрицательным или нулевым!");

    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Пациент --- " +
                "id=" + id +
                " Фамилия=" + surname +
                " Имя=" + name +
                " Отчество=" + middleName +
                " Адрес=" + address +
                " Номер телефона=" + phoneNumber +
                " Номер медицинской карты=" + medCard +
                " Диагноз=" + diagnosis ;
    }

    public void showInfo() {
        System.out.println(this.getSurname() + "   " + this.getName() + "   " + this.getMiddleName() + ":   Address: " + this.getAddress() + ";   PhoneNumber: " + this.getPhoneNumber() + "; Diagnosis: " + this.getDiagnosis() + ";  id: " + this.getId() + ";  #medCard: " + this.getMedCard());
    }
}

