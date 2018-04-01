package shihab.diu.com.healthassistantnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorsInfo extends AppCompatActivity {

    public Button btn_orthopedix;
    public Button btn_medicine;
    public Button btn_eye;
    public Button btn_dentist;
    public Button btn_nose;
    public Button btn_hematology;
    public Button btn_psychology;
    public Button btn_neurology;
    public Button btn_children;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Doctors Information");
        setContentView(R.layout.activity_doctors_info);

        init();


        btn_orthopedix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, OrthopedixDoctors.class);
                startActivity(intent);

            }
        });

        btn_medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, MedicineDoctors.class);
                startActivity(intent);

            }
        });
        btn_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(DoctorsInfo.this, EyeDoctors.class);
                startActivity(intent);
            }
        });

        btn_nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(DoctorsInfo.this, NoseDoctors.class);
                startActivity(intent);
            }
        });
        btn_dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(DoctorsInfo.this, DentistDoctors.class);
                startActivity(intent);
            }
        });


        btn_hematology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, HematologyDoctors.class);
                startActivity(intent);

            }
        });


        btn_psychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, PsychologyDoctors.class);
                startActivity(intent);

            }
        });


        btn_neurology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, NeurologyDoctors.class);
                startActivity(intent);

            }
        });


        btn_children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsInfo.this, ChildrenDoctors.class);
                startActivity(intent);

            }
        });
    }


    private void init() {
        btn_orthopedix=(Button) findViewById(R.id.btn_doctor_orthopedix);
        btn_medicine=(Button) findViewById(R.id.btn_doctor_medicine);
        btn_eye=(Button) findViewById(R.id.btn_doctor_eye);
        btn_nose=(Button) findViewById(R.id.btn_doctor_nose);
        btn_dentist=(Button) findViewById(R.id.btn_doctor_dentist);
        btn_hematology=(Button) findViewById(R.id.btn_doctor_hematology);
        btn_psychology=(Button) findViewById(R.id.btn_doctor_psychology);
        btn_neurology=(Button) findViewById(R.id.btn_doctor_neurology);
        btn_children=(Button) findViewById(R.id.btn_doctor_Child);
    }


}
