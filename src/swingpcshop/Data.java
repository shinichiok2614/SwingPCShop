/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingpcshop;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author TUAN
 */
public class Data implements Serializable {

//    List<Phone> list=new ArrayList<>();
    private ArrayList<Phone> list;

    public void setList(ArrayList<Phone> list) {
        this.list = list;
    }

    public Data() {
        this.list = new ArrayList<>();
    }

    public List<Phone> getList() {
        return list;
    }

    public void add(Phone phone) {
        this.list.add(phone);
    }

    public void delete(int i) {
    }

}
