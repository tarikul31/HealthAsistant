package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NoseDoctors extends AppCompatActivity {
    ListView listView;

    int[] IMAGES = {R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips, R.drawable.nose_tips};

    String [] NAMES = {"Prof Dr. A.F. Mohiuddin Khan", "Prof Dr. Abdullah A. Harron", "Prof Dr. Mahmudul Hasan", "Dr. A. F. Mohiuddin Khan" , "Dr. A.B.M. Khorshed Alam","Dr. A.K.M.A Sobhan", "Major Dr. Sk Habibur Rahman", "Dr. Saket Aggarwal","Dr. Delowar Hossain"};
    String [] DESIGNATION = {"MBBS, DLO, MS(ENT)", "FRCS( Gasgow ), FCPS","MBBS, FCPS (ENT)", "MBBS, DLO(DU), MS (ENT)","MBBS, FCPS","MBBS, FRCP","MBBS, FRSH(London), DLO, MS","MBBS, MS, DND(ENT)","MBBS, FCPS ( ENT )"};
    String [] ACTIVITY = {"Dhaka Medical College & Hospital, Dhaka", "United Hospital Limited", "Universal Medical Collage Hospital"," City Hospital Ltd","Monowara Hospital (pvt) Ltd","Popular Diagnostic Centre Ltd"," Marks Medical Collage Hospital","Apollo Hospitals Dhaka","Bangabandhu Sheikh Mujib Medical University"};
    String [] CONTACTINFO = {"Phone: +880-2-9672277, 9676161", "Phone: +880 2 8836000, 8836444","Phone: 09606 111 222", "Phone: +880-2-8143312, 8143437, 8143166","Phone: +880 831-8135, 831-9802 ","Phone: +880-2- 9111911, Mobile-01552347874, 01717062732","Phone: +880-2-9126625-6, 9128835-7","Phone: +880-2-8401661, 8845242","Phone: +880-2-9145786, 9137076"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Ear, Nose & Throat Specialist");
        setContentView(R.layout.activity_nose_doctors);
        listView=(ListView)findViewById(R.id.list_doctor_nose);
        NoseDoctors.CustomAdapter customAdapter=new NoseDoctors.CustomAdapter();
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