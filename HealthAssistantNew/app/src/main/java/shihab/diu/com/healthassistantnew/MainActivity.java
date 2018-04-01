package shihab.diu.com.healthassistantnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btn_disease;
    public Button btn_doctor;
    public Button btn_hospital;
    public Button btn_health;
    public Button btn_about;
    public Button btn_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Health Assistant");
        setContentView(R.layout.activity_main);

        init();

        btn_disease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, DiseasePrediction.class);
                startActivity(intent);

            }
        });

        btn_doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, DoctorsInfo.class);
                startActivity(intent);

            }
        });

        btn_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, HospitalInfo.class);
                startActivity(intent);

            }
        });

        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, HealthTips.class);
                startActivity(intent);

            }
        });


        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, About.class);
                startActivity(intent);

            }
        });


        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Help.class);
                startActivity(intent);

            }
        });



}

    private void init() {
        btn_disease=(Button) findViewById(R.id.btn_disease_Prediction);
        btn_doctor=(Button) findViewById(R.id.btn_doctor_info);
        btn_hospital=(Button) findViewById(R.id.btn_hospital_info);
        btn_health=(Button) findViewById(R.id.btn_healthtips);
        btn_about=(Button) findViewById(R.id.btn_about);
        btn_help=(Button) findViewById(R.id.btn_help);
    }

}
