package shihab.diu.com.healthassistantnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiseasePrediction extends AppCompatActivity {


    Button btnHead, btnEye,btnNose,btnStomach,btnTeeth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Disease Prediction");
        setContentView(R.layout.activity_disease_prediction);

        init();


        btnHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiseasePrediction.this, HeadSymptomsInput.class);
                startActivity(intent);
            }
        });


        btnEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiseasePrediction.this, EyeSymptomsInput.class);
                startActivity(intent);
            }
        });

        btnStomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiseasePrediction.this, StomachSymptomsInput.class);
                startActivity(intent);
            }
        });

        btnTeeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiseasePrediction.this, TeethSymptomsInput.class);
                startActivity(intent);
            }
        });

        btnNose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiseasePrediction.this, NoseSymptomsInput.class);
                startActivity(intent);
            }
        });



    }

    private void init() {

        btnHead = (Button) findViewById(R.id.btn_head_disease_prediction);
        btnEye = (Button) findViewById(R.id.btn_eye_disease_prediction);
        btnNose = (Button) findViewById(R.id.btn_nose_disease_prediction);
        btnStomach = (Button) findViewById(R.id.btn_stomach_disease_prediction);
        btnTeeth = (Button) findViewById(R.id.btn_teeth_disease_prediction);
    }
}
