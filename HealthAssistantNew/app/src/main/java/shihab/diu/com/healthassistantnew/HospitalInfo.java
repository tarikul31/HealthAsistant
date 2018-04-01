package shihab.diu.com.healthassistantnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HospitalInfo extends AppCompatActivity {

    Button btnDhaka;
    Button btnRajshahi;
    Button btnBarisal;
    Button btnMymensingh;
    Button btnSylhet;
    Button btnChittagong;
    Button btnKhulna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information");
        setContentView(R.layout.activity_hospital_info);
        init();


        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalDhaka.class);
                startActivity(intent);
            }
        });

        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalRajshahi.class);
                startActivity(intent);
            }
        });
        btnBarisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalBarisal.class);
                startActivity(intent);
            }
        });
        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalMymensingh.class);
                startActivity(intent);
            }
        });
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalSylhet.class);
                startActivity(intent);
            }
        });
        btnChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalChittagong.class);
                startActivity(intent);
            }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HospitalInfo.this, HospitalKhulna.class);
                startActivity(intent);
            }
        });

    }

    private void init() {

        btnDhaka = (Button) findViewById(R.id.btn_hospital_dhaka);
        btnRajshahi =(Button)findViewById(R.id.btn_hospital_rajshahi);
        btnBarisal =(Button)findViewById(R.id.btn_hospital_barisal);
        btnSylhet =(Button)findViewById(R.id.btn_hospital_sylhet);
        btnMymensingh = (Button) findViewById(R.id.btn_hospital_mymensingh);
        btnKhulna =(Button)findViewById(R.id.btn_hospital_khulna);
        btnChittagong =(Button)findViewById(R.id.btn_hospital_chittagong);
    }
}
