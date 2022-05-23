package sg.edu.rp.c346.id21001078.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import org.w3c.dom.Text;

public class Page2 extends AppCompatActivity {

    TextView v1;
    TextView v2;
    TextView v3;
    TextView v4;
    TextView v5;
    TextView v6;
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        v1 = findViewById(R.id.s1);
        v2 = findViewById(R.id.s2);
        v3 = findViewById(R.id.s3);
        v4 = findViewById(R.id.s4);
        v5 = findViewById(R.id.s5);
        v6 = findViewById(R.id.s6);
        back = findViewById(R.id.B);

        Intent intentReceived = getIntent();
        String RC = intentReceived.getStringExtra("Code");
        String RN = intentReceived.getStringExtra("Name");
        String RY = intentReceived.getStringExtra("Year");
        String RS = intentReceived.getStringExtra("Semester");
        String RCR = intentReceived.getStringExtra("Credit");
        String RV = intentReceived.getStringExtra("Venue");
        v1.setText("Module Code: " + RC );
        v2.setText("Module Name: " + RN);
        v3.setText("Year: " + RY);
        v4.setText("Semester: " + RS);
        v5.setText("Module Credit: " + RCR);
        v6.setText("Module Venue: " + RV);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Page2.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }
}