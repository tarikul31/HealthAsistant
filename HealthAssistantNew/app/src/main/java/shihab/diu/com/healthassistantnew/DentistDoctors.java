package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DentistDoctors extends AppCompatActivity {
    ListView listView;

    int[] IMAGES = {R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips, R.drawable.teeth_tips};

    String [] NAMES = {"ProfDr. Md. Shamsul Alam", "Prof Dr. Khandaker Abdul Azim", "Dr. Mohammed Shafi Ullah", "Dr. Nurul Amin" , "Dr. Sk. Nazrul Islam","Dr. Salahuddin (Swapan)", "Dr.Debashis Dey", "Dr. Barkat Ullah","Dr. M. A. Sikder"};
    String [] DESIGNATION = {"BDS, DCD(USSR), FADI(USA)", "BDS, Dip, OMS (Australia)","MBBS, MS, BDS, MCPS", "BDS, PhD ( Japan )","DS(DU), PGT(BK), FAES(USA), MCPS(BD)","B.D.S, FCPS","BDS(DU) MPH, PGT(OMFS)","BDS, FAES ( USA ), MAES ( USA )","BDS, Ph.D ( Japan )"};
    String [] ACTIVITY = {"Life Hospital Limited)", "Ibn Sina Dental Center", "Sapora Dental College & Hospital, Uttara","Smile Specialised Dental & Research Center","Endo Dental","Anannya Shopping Complex (3rd Floor)","Bangabandhu Sheikh Mujib Medical University ( BSMMU )","APON Dental  Care Dhaka","Ibn Sina Dental Center","Smile Specialised Dental & Research Center"};
    String [] CONTACTINFO = {"Phone: +880-2-9612345-54, 9615412, 8628820-1", "Phone: +880-2-91296625-6, 9128835-7","Phone: Cell: +880 1914553088 ", "Phone: Cell: +8801711528345","Phone: +880-2-9126625-6, 9128835-7","Phone: +880 1711958143 ","mobile 01920130000 ,  01865555260","Phone: +880-2-9126625-6, 9128835-7","Phone: +880 1914553088"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Dentist Doctors");
        setContentView(R.layout.activity_dentist_doctors);
        listView=(ListView)findViewById(R.id.list_doctor_dentist);
        DentistDoctors.CustomAdapter customAdapter=new DentistDoctors.CustomAdapter();
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
