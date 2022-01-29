package RSplit.java;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcel;

public class Bill implements Parcelable{
    //data variables for monetary balance and tax percentage
    private double balance = 0.0;
    private double taxP = 0.0;
    //creating arraylist <type> Person class object for user profiles (names)
    private ArrayList<Person> Users;

    protected Bill(Parcel in) {
        balance = in.readDouble();
        taxP = in.readDouble();
        Users = in.createTypedArrayList(Person.CREATOR);
    }

    public static final Creator<Bill> CREATOR = new Creator<Bill>() {
        @Override
        public Bill createFromParcel(Parcel in) {
            return new Bill(in);
        }

        @Override
        public Bill[] newArray(int size) {
            return new Bill[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(balance);
        parcel.writeDouble(taxP);
        parcel.writeTypedList(Users);
    }
}
