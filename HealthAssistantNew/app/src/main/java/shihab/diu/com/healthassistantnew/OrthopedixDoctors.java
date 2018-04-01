package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class OrthopedixDoctors extends AppCompatActivity {

ListView lvD;

    int[] IMAGES = {R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix, R.drawable.orthopedix};

    String [] NAMES = {"Prof.Dr. Md. Abdus Samad", "Prof.Dr.Kh. Abdul Awal Rizvi", "Prof. Dr. A.K.M. Ishaque", "Prof.Dr.SK. Nurul Alam" , "Prof.Dr. Seraj Uddin","Prof.Dr.M.Hafizur Rahman", "Prof.Dr.A F Masood", "Prof.Dr.Md.Nurul Kabir"};
    String [] DESIGNATION = {"MBBS, MS(Ortho),BCTF(London) ", "MBBS, MS, FICS","MBBS,D-Ortho,MS(Ortho),FPOA", "MBBS,MS (Ortho),D-Ortho","MBBS, MS(Ortho)","MBBS, MS","MBBS,FRCS(England),FICS","MBBS, FRCS"};
    String [] ACTIVITY = {"Pro.& Head DOS at NIOT", "Pro & Director NIOTOR","Pro & Dir Bangabandhu Sheikh Mujib Medical University", "Pro & Dir Popular Diagnostic Centre Ltd","Pro & Dir Bangabandhu Sheikh Mujib Medical Univeristy","Delta Medical College & Hospital","Pro.Ibn Sina Hospital","Pro.Ibn Sina D.Lab.& Consultation Center"};
    String [] CONTACTINFO = {"Phone: +880-2-8143312, 8143437", "32 Green Road,Dhanmondi","Phone: +880-2-8318135, 8318529", "Phone: +880-2-9669480, 96614913","Phone: +880-2-9111911","Phone: +880-8031378-79","Phone: +880-2-9126625, 9128835-7","Phone: +880-2-9126625, 91288357"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Orthopedix Doctors");
        setContentView(R.layout.activity_orthopedix_doctors);

        lvD = (ListView)findViewById(R.id.lvOD);
        CustomAdapter customAdapter=new CustomAdapter();
        lvD.setAdapter(customAdapter);


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
            view = getLayoutInflater().inflate(R.layout.custom_layout_doctors, null);

            ImageView imageView = (ImageView) view.findViewById(R.id.img1);
            TextView textView1 = (TextView) view.findViewById(R.id.tv_name);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_designation);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_activity);
            TextView textView4 = (TextView) view.findViewById(R.id.tv_contactinfo);

            imageView.setImageResource(IMAGES[i]);
            textView1.setText(NAMES[i]);
            textView2.setText(DESIGNATION[i]);
            textView3.setText(ACTIVITY[i]);
            textView4.setText(CONTACTINFO[i]);
            return view;

        }


    }
}
