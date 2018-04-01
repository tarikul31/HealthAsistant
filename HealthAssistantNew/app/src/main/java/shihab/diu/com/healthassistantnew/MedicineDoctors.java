package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MedicineDoctors extends AppCompatActivity {

    ListView listView;

    int[] IMAGES = {R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine, R.drawable.medicine};

    String [] NAMES = {"Prof. Dr. Fazlul Hoque","Prof. Dr. Sheikh Nesaruddin Ahmed","Prof Dr. Syed Atiqul Haq","Prof Dr.H A M Nazmul Ahsan","Prof Dr. N.I. Khan","Prof Dr. Md. Johurul Haque","Prof Dr. Md. Manjur Rahman (Galib)","Prof Dr. Abul Kashem Khandaker"};
    String [] DESIGNATION = {"MBBS, FCPS,FRCP( Edinburgh)FRCP(Glasgow)", "MBBS, DTM&H, MRCP(Edin),FRCP (Edin),FCPS","MBBS, FRCP, FCPS, MD","MBBS,FCPS, FRCP(Glasgow)FRCP(Edin),FACP (USA)","MBBS, MRCP(U.K), FRCP, FACP(USA)","MBBS,MPhil,FWHO(India),BCS","MBBS, FCPS ( Medicine )","MBBS, Ph.D, FCPS, FACP, FRCP"};
    String [] ACTIVITY = {"Ex Principal Dhaka Medical College & Hospital","Ex Pro & Head Dhaka Medical Collage Hospital ","Pro & Chairman Department of Medicine","Dhaka Medical College & Hospital","Pro & Head of the Departnment of Medicine","Pro Delta Medical College","Labaid Specialized Hospital, Dhanmondi","Shaheed Suhrawardy Medical College"};
    String [] CONTACTINFO = {"Phone: +880-2-8156914, 8156839, 9133505","Phone: + 880-2-8610793-8, 9670210-3","Phone: +880-2-9612345,8628820-1","Phone: +880-2-9669480, 9661491-3","Phone: +880-2-831-8135,831-9802","Phone: +880-2-9015122-23","Phone: +880-2-9676356,8610793-8","Phone: +880-2-9350383, 9351237"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Medicine Doctors");
        setContentView(R.layout.activity_medicine_doctors);


        listView=(ListView)findViewById(R.id.list_doctor_medicine);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_layout_doctors,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.img1);
            TextView textView1=(TextView)view.findViewById(R.id.tv_name);
            TextView textView2=(TextView)view.findViewById(R.id.tv_designation);
            TextView textView3=(TextView)view.findViewById(R.id.tv_activity);
            TextView textView4=(TextView)view.findViewById(R.id.tv_contactinfo);

            imageView.setImageResource(IMAGES[i]);
            textView1.setText(NAMES[i]);
            textView2.setText(DESIGNATION[i]);
            textView3.setText(ACTIVITY[i]);
            textView4.setText(CONTACTINFO[i]);
            return view;

        }
    }

}
