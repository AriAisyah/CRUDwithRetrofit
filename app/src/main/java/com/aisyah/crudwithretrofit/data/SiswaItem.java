package com.aisyah.crudwithretrofit.data;

import com.google.gson.annotations.SerializedName;

public class SiswaItem {

    @SerializedName("nama")
    private String nama;

    @SerializedName("hp")
    private String hp;

    @SerializedName("id")
    private String id;

    @SerializedName("alamat")
    private String alamat;

    public SiswaItem(String id, String nama, String alamat, String hp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.hp = hp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHp() {
        return hp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    @Override
    public String toString() {
        return
                "SiswaItem{" +
                        "nama = '" + nama + '\'' +
                        ",hp = '" + hp + '\'' +
                        ",id = '" + id + '\'' +
                        ",alamat = '" + alamat + '\'' +
                        "}";
    }
}