package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class EyeDoctors extends AppCompatActivity {
    ListView listView;

    int[] IMAGES = {R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips, R.drawable.eye_tips};

    String [] NAMES = {"Prof Dr. Anisul Haque", "Prof Dr. Mansur Habib", "Prof Dr. A.K.M. Anwar Ullah", "Prof Dr.Firoz Ahmed Quaraishi" , "Prof Dr. Md. Abdul Hai","Prof Dr. M. A. Mannan", "Prof Dr. Md. Amirul Haque", "Prof Dr. M A Hannan","Dr. Sehelly Jahan"};
    String [] DESIGNATION = {"MBBS,Ph.D.FCPS, FRCP(Edin)", "MBBS, FCPS, MD(Neurology), MRCP, FRCP","MBBS, FCPS, FRCP(Adin)", "MBBS (Dhaka), FCPS (Med), MD (Neurology)","MBBS, FCPS (Medicine),PhD (India)","MBBS, FRCP","MBBS, FCPS, FACP(USA), DCN(London)","MBBS,FCPS(Medicine),MD(Neurology)","MBBS, MD(Neorology )"};
    String [] ACTIVITY = {"Head Dept.of Neuro Medicine(BSMMU)", "Dhaka Medical College & Hospital", "Bangabandhu Sheikh Mujib Medical University","Sir Salimullah Medical College & Mitford Hospital","Ibn Sina Diagnostic & Imaging Center","Neurology Foundation Hospital","Ibn Sina Diagnostic & Imaging Center","BSMMU & Labaid Specialized Hospital","Bangladesh Medical College & Hospital"};
    String [] CONTACTINFO = {"Phone: +880-2-9669480, 9661491-3", "Phone: + 880-2-8610793-8, 9670210-3","Phone: +880 2 8620353-6, 9663022", "Phone: +880-2-8143312, 8143437","Phone: +880-2-9126625-6, 9128835-7","Phone: +880-2-8114846","Phone: +880-2-9126625-6, 9128835-7","Phone: +880-2-9676356","Phone: +880-2-9669480, 9661491-3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Eye Doctors");
        setContentView(R.layout.activity_eye_doctors);
        listView=(ListView)findViewById(R.id.list_doctor_eye);
        EyeDoctors.CustomAdapter customAdapter=new EyeDoctors.CustomAdapter();
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