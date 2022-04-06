package tech.zypka.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.editFname);
        lastName = findViewById(R.id.Lname);
        editEmail = findViewById(R.id.editEmail);
    }

    public void setUserNames(View view) {
        TextView f_name = findViewById(R.id.firstName);
        f_name.setText(firstName.getText().toString());
        TextView l_name = findViewById(R.id.lastName);
        l_name.setText(lastName.getText().toString());
        TextView email = findViewById(R.id.email);
        email.setText(editEmail.getText().toString());
    }
}