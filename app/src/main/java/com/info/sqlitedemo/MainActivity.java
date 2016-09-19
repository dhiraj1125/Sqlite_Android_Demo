package com.info.sqlitedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
        /**
         * CRUD Operations
         * */
        //inserting contacts
        Log.d("Insert", "Inserting...");
        db.addContact(new Contact("Raj", "91000045124"));
        db.addContact(new Contact("nivas", "919425635"));
        db.addContact(new Contact("Tom", "9522222222"));
        db.addContact(new Contact("Karnik", "9533258963"));

        // Reading all contacts
        Log.d("Reading:", "Reading all contacts");
        List<Contact> contacts = db.getAllContacts();
        for (Contact cn: contacts){
            String log = "Id: " +cn.getId()+  ", Name:" +cn.getName()+ ", Phone:" +cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name:", log);
        }
    }
}
