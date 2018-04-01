package shihab.diu.com.healthassistantnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthTips extends AppCompatActivity {

    Button btn_head,btn_chest,btn_eye,btn_teeth,btn_nose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Health Tips");
        setContentView(R.layout.activity_health_tips);
        onHead();
        onChest();
        onEye();
        onTeeth();
        onNose();

    }
    public void onHead()
    {
        btn_head=(Button) findViewById(R.id.btn_healthtips_head);
        btn_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HealthTips.this, HeadHealthtips.class);
                startActivity(intent);

            }
        });

    }

    public void onChest()
    {
        btn_chest=(Button) findViewById(R.id.btn_healthtips_chest);
        btn_chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HealthTips.this, ChestHealthTips.class);
                startActivity(intent);

            }
        });

    }

    public void onEye()
    {
        btn_eye=(Button) findViewById(R.id.btn_healthtips_eye);
        btn_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HealthTips.this, EyeHealthTips.class);
                startActivity(intent);

            }
        });

    }
    public void onTeeth()
    {
        btn_teeth=(Button) findViewById(R.id.btn_healthtips_teeth);
        btn_teeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HealthTips.this, TeethHealthTips.class);
                startActivity(intent);

            }
        });

    }
    public void onNose()
    {
        btn_nose=(Button) findViewById(R.id.btn_healthtips_nose);
        btn_nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HealthTips.this, NoseHealthTips.class);
                startActivity(intent);

            }
        });

    }

}
