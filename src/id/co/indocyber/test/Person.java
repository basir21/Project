/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class Person extends CalculateKreditAnalysis{
 
    private String nama;
    private String gender;
    private String married;
    private int age;
    private int jumlahTanggungan;
    private double penghasilan;
    private double jumlahPinjaman;
    private double dp;
    private double sukuBunga;
    private int lamaPinjaman;
    private String alamat;
    
    public Person() {
    }

    public Person(String nama, String gender, String married, int age, int jumlahTanggungan, double penghasilan, double jumlahPinjaman, double dp, double sukuBunga, int lamaPinjaman, String alamat) {
     
        this.nama = nama;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.jumlahTanggungan = jumlahTanggungan;
        this.penghasilan = penghasilan;
        this.jumlahPinjaman = jumlahPinjaman;
        this.dp = dp;
        this.sukuBunga = sukuBunga;
        this.lamaPinjaman = lamaPinjaman;
        this.alamat = alamat;
        
    }

    
    public Person(String nama, String gender, String married, int age) {
        this.nama = nama;
        this.gender = gender;
        this.married = married;
        this.age = age;
    }
    
    public double HitungPokokPinjaman(){
        double pokokCicilan = jumlahPinjaman-dp;
        return pokokCicilan;
    }
    
    public double HitungBungaCicilan(){
        double bungaKredit = HitungPokokPinjaman()*sukuBunga*(lamaPinjaman/12.0);
        return bungaKredit;
    }
    
    public double HitungTotalKredit(){
        double totalKredit = HitungPokokPinjaman()+HitungBungaCicilan();
        return totalKredit;
    }
    
    public double HitungCicilanPerBulan(){
        double cicilanPerBulan = HitungTotalKredit()/lamaPinjaman;
        return cicilanPerBulan;
    }
    
    public double HitungLimitPinjaman(){
        double limitPinjaman = penghasilan/(jumlahTanggungan+1.0);
        return limitPinjaman;
    }
    
    public String CekAnalisaKredit(){
        String hasil = "";
        if(HitungLimitPinjaman() > HitungCicilanPerBulan()){
            hasil = "Oke... Pinjaman Anda Di Setujui";
        }else{
            hasil = "Maaf... Pinjaman Anda Di Tolak";
        }
        return hasil;
    }
    
    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * @param married the married to set
     */
    public void setMarried(String married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

   
    /**
     * @return the jumlahTanggungan
     */
    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    /**
     * @return the penghasilan
     */
    public double getPenghasilan() {
        return penghasilan;
    }

    /**
     * @param penghasilan the penghasilan to set
     */
    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    /**
     * @return the jumlahPinjaman
     */
    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    /**
     * @param jumlahPinjaman the jumlahPinjaman to set
     */
    public void setJumlahPinjaman(double jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    /**
     * @return the dp
     */
    public double getDp() {
        return dp;
    }

    /**
     * @param dp the dp to set
     */
    public void setDp(double dp) {
        this.dp = dp;
    }

    /**
     * @return the sukuBunga
     */
    public double getSukuBunga() {
        return sukuBunga;
    }

    /**
     * @param sukuBunga the sukuBunga to set
     */
    public void setSukuBunga(double sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    /**
     * @return the lamaPinjaman
     */
    public int getLamaPinjaman() {
        return lamaPinjaman;
    }

    /**
     * @param lamaPinjaman the lamaPinjaman to set
     */
    public void setLamaPinjaman(int lamaPinjaman) {
        this.lamaPinjaman = lamaPinjaman;
    }

    /**
     * @return the married
     */
    public String getMarried() {
        return married;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
