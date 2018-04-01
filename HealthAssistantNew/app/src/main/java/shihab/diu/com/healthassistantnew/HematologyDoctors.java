package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HematologyDoctors extends AppCompatActivity {

    ListView listView;

    int[] IMAGES = {R.drawable.hematology, R.drawable.hematology, R.drawable.hematology, R.drawable.hematology, R.drawable.hematology, R.drawable.hematology, R.drawable.hematology,};

    String [] NAMES = {"Prof Dr. M A Khan", "Prof Dr. Md. Moniruzzaman", "Prof Dr. Manzur morshed", "Prof Dr. A. B. M. Yunus" , "Prof Dr. Alamgir kabir","Dr. Md. Anowarul Karim", "Dr. Md. Abdul Aziz","Dr. Md. Belayet Hossain"};
    String [] DESIGNATION = {"MBBS,FCPS(Hematology),FRCP(Edin)", "MBBS,GC(Pathology),MCPS(Clinical Pathology)","MBBS, FCPS, MRCP(UK)", "MBBS (India),MPhil Path(Hons),FCPS(Hematology)","MBBS, FCPS(Hematology)","FCPS(Ped.),MD(Ped.)","MBBS, FCPS","MBBS, FCPS(Hematology)"};
    String [] ACTIVITY= {"Labaid Cardiac Hospital", "Apollo Hospitals Dhaka","Bangabandhu Sheikh Mujib Medical University", "Bangabandhu Sheikh Mujib Medical University","Ibn Sina Diagnostic & Imaging Center","Bangabandhu Sheikh Mujib Medical University","Bangabandhu Sheikh Mujib Medical Univeristy","Dhaka Shishu Hospital"};
    String [] CONTACTINFO= {"Phone: +880-2-8610793-8, 9670210-3", "Phone: +880-2-8401661,8845242","Phone:+880-2-8610793-8,9670210-3", "Phone: +880-2-8610313, 9661410","Phone: +880-2-9128835-7, 9126625-6","Phone: +880-2-9145786, 9137076","Phone: +880-1712463976","Phone: +880-2-9350383, 9351237"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hematology Doctors");
        setContentView(R.layout.activity_hematology_doctors);

        listView=(ListView)findViewById(R.id.list_doctor_hematology);
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
