/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingpcshop;

import java.io.Serializable;

/**
 *
 * @author TUAN
 */
public class Phone implements Serializable{
    private String[] phone;
    private String pic;
    private String id;
    private String brand;
    private String model;
    private String price;
    private String kichthuoc;
    private String trongluong;
    private String cpu;
    private String ram;
    private String kichthuocmanhinh;
    private String dophangiai;
    private String gpu;
    private String bonhotrong;
    private String dophangiaicamsau;
    private String dungluongpin;
    private String os;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public String getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(String trongluong) {
        this.trongluong = trongluong;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKichthuocmanhinh() {
        return kichthuocmanhinh;
    }

    public void setKichthuocmanhinh(String kichthuocmanhinh) {
        this.kichthuocmanhinh = kichthuocmanhinh;
    }

    public String getDophangiai() {
        return dophangiai;
    }

    public void setDophangiai(String dophangiai) {
        this.dophangiai = dophangiai;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getBonhotrong() {
        return bonhotrong;
    }

    public void setBonhotrong(String bonhotrong) {
        this.bonhotrong = bonhotrong;
    }

    public String getDophangiaicamsau() {
        return dophangiaicamsau;
    }

    public void setDophangiaicamsau(String dophangiaicamsau) {
        this.dophangiaicamsau = dophangiaicamsau;
    }

    public String getDungluongpin() {
        return dungluongpin;
    }

    public void setDungluongpin(String dungluongpin) {
        this.dungluongpin = dungluongpin;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public Phone(){
        this.phone=new String[15];
    }
    public Phone(String id, String brand,String model){
        this.id=id;
        this.brand=brand;
        this.model=model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    
}
