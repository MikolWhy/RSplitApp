package RSplit.java;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Person implements Parcelable, Serializable {


    //auto-from Parcelable implementation
    protected Person(Parcel in) {
    }

    //auto-from Parcelable implementation
    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        //auto-from Parcelable implementation
        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    //auto-from Parcelable implementation
    @Override
    public int describeContents() {
        return 0;
    }

    //auto-from Parcelable implementation
    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
