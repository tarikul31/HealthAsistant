package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ChildrenDoctors extends AppCompatActivity {

    ListView listView;

    int[] IMAGES = {R.drawable.children, R.drawable.children, R.drawable.children, R.drawable.children, R.drawable.children, R.drawable.children, R.drawable.children, R.drawable.children};

    String [] NAMES = {"Prof Dr. Ekhlasur Rahman", "Prof Golam Maeen Uddin", "Prof Dr. karim Khan", "Prof Dr. Shafiqul Hoque" , "Prof.Dr.M Zahid Hussain","Prof Dr. Golam Mainuddin", "Prof Dr. M. A. Jaigirdar","Prof Dr. Mohammad Hanif"};
    String [] DESIGNATION = {"MBBS, FCPS, FRCS(Edin)", "MBBS, FCPS (Child),FRCP (Edin)","MBBS,S.Paed(Vienna), MCPS(Child)", "MBBS,FCPS,FICS, FACS(USA)","MBBS, FCPS(Paediatrics)","MBBS, FCPS (Child), FRCP (Edin)","MBBS, DCH, MRCP (UK)","MBBS, FCPS,FRC(Edin)"};
    String [] ACTIVITY = {"Dhaka Medical College & Hospital", "(BSMMU)& (PG Hospital)","Community Based Medical College", "Central Hospital Limited","Central Hospital Limited","BSMMU","Bangladesh Medical College Hospital","Dhaka Shihu(Children)Hospital"};
    String [] CONTACTINFO = {"Phone: +880-2-9661213,9670295", "phone : 8121172, 9133563-4","Phone: +880-2-8626899, 9664930", "Phone: 9660015-19, 8624514-9","Phone: 9660015-19, 8624514-9","Phone: +880-2-8121172, 9133563-4","Phone: +880-2-9669480, 9661491-3","Phone: +880-2-9669480, 9661491-3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Children Doctors");
        setContentView(R.layout.activity_children_doctors);

        listView=(ListView)findViewById(R.id.list_doctor_children);
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
