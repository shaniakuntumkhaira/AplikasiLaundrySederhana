package com.shania.aplikasiminuman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class Detail2 implements Parcelable {
    private String name;
    private int price;
    private String size;

    public Detail2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    protected Detail2(Parcel in) {
        name = in.readString();
        price = in.readInt();
        size = in.readString();
    }

    public static final Creator<Detail2> CREATOR = new Creator<Detail2>() {
        @Override
        public Detail2 createFromParcel(Parcel in) {
            return new Detail2(in);
        }

        @Override
        public Detail2[] newArray(int size) {
            return new Detail2[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(price);
        parcel.writeString(size);
    }
}
