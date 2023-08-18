/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class Appointment {
    
    //instance variables
    private String patientCode;
    private String patientName;
    private String patientPhoneNumber;
    private String patientSymptoms;
    private String patientDiagnosis;
    
    //constructor

    public Appointment(String patientCode, String patientName, String patientPhoneNumber, String patientSymptoms, String patientDiagnosis) {
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientSymptoms = patientSymptoms;
        this.patientDiagnosis = patientDiagnosis;
    }

    public Appointment() {
    }
    
    
    //getters and setters

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientSymptoms() {
        return patientSymptoms;
    }

    public void setPatientSymptoms(String patientSymptoms) {
        this.patientSymptoms = patientSymptoms;
    }

    public String getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(String patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }
    
    //toString

    @Override
    public String toString() {
        return "Appointment{" + "patientCode=" + patientCode + ", patientName=" + patientName + ", patientPhoneNumber=" + patientPhoneNumber + ", patientSymptoms=" + patientSymptoms + ", patientDiagnosis=" + patientDiagnosis + '}';
    }
    
}
