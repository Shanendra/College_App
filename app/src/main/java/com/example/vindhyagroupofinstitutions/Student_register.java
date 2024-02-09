package com.example.vindhyagroupofinstitutions;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Student_register extends AppCompatActivity {

    EditText firstName,lastName, email, password, con_password, phone , rollNumber , enrollmentNumber;
    Button register;
    FirebaseAuth fAuth;
    FirebaseFirestore fireStore;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Full-screen settings
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.register_student);

        // Initialize UI elements
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        con_password = findViewById(R.id.confirmPassword);
        phone = findViewById(R.id.phone);
        enrollmentNumber = findViewById(R.id.enrollmentNumber);
        rollNumber = findViewById(R.id.rollNumber);
        register = findViewById(R.id.register);

        // Initialize Firebase
        fAuth = FirebaseAuth.getInstance();
        fireStore = FirebaseFirestore.getInstance();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String FirstName = firstName.getText().toString();
                String LastName = lastName.getText().toString();
                String mEmail = email.getText().toString().trim();
                String mPassword = password.getText().toString().trim();
                String conPassword = con_password.getText().toString().trim();
//                String mYear = spinnerYear.getSelectedItem().toString();
//                String mDepartment = spinnerDepart.getSelectedItem().toString();
                String mPhone = phone.getText().toString().trim();
                String mEnrollment = enrollmentNumber.getText().toString().trim();
                String mRollNumber = rollNumber.getText().toString().trim();
                String countryCode = "91";

//                if (TextUtils.isEmpty(mName) || TextUtils.isEmpty(mEmail) || TextUtils.isEmpty(mPassword) ||
//                        TextUtils.isEmpty(conPassword) || TextUtils.isEmpty(mPhone)) {
//                    Toast.makeText(Register_Activity.this, "All fields are required!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if (mPassword.length() < 6) {
//                    password.setError("Password must be 6 letters or more!");
//                    password.requestFocus();
//                    return;
//                }
//
//                if (!mPassword.equals(conPassword)) {
//                    con_password.setError("Password does not match!");
//                    password.requestFocus();
//                    return;
//                }
//
//                if (!PhoneNumberValidator.isValidPhoneNumber(mPhone, countryCode)) {
//                    // The phone number is not valid, show an error message
//                    phone.setError("Enter a valid phone number for India!");
//                    phone.requestFocus();
//                    return;
//                }
//                if(mRollNumber.length() != 10){
//                    rollNumber.setError("Enter Correct RollNumber!");
//                    rollNumber.requestFocus();
//                    return;
//                }
//                if(mEnrollment.length() != 12){
//                    rollNumber.setError("Enter Correct EnrollmentNumber!");
//                    rollNumber.requestFocus();
//                    return;
//                }
//
//
//
//
           }
        });






    }
}
