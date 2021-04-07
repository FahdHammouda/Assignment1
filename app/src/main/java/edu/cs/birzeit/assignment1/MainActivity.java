package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }
    private void setupView(){
        editText = findViewById(R.id.editText);
        textView2 = findViewById(R.id.textView2);
    }
    public void on_clickAddHobbies(View view) {
        String hobbies = editText.getText().toString();
        textView2.setText(hobbies);
        textView2.setVisibility(View.VISIBLE);
    }
}