package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalMymensingh extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"Al-Baraka Hospital","Jahangir Health Complex","Mymensingh BNSB Eye Hospital","Mymensingh Medical College Hospital","Mymensingh Union Specialized Hospital","Nexus Cardiac Hospital & Research Center","Shanti Hospital","SIDDIQIA Eye Hospital & Phaco Centre"};
    String [] LOCATION = {"Charpara, Mymensingh","Brammopolli, Mymensingh","193 Shehora Dhopakhola Road, Mymensingh","Medical Road, Mymensingh"," Dhaka-Mymensingh Road, Mymensingh"," Shehora Bara Bari Rd, Mymensingh","62/a Baghmara Road, Mymensingh","25/A Sehora Dhopakhola, Dhaka-Mymensingh Rd, Mymensingh"};
    String [] CONTACTINFO = {"Phone: +880-091-61765","Phone: +880-091-63400","Phone: +880 91 66982, 67180, Web: www.bnsbmym.org","Phone: 01768-027115","Phone: 01845-973549","Phone: 091-51705","Phone: 01720-538921","Phone: 01742-220351"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Mymensingh)");
        setContentView(R.layout.activity_hospital_mymensingh);


        ListView listView=(ListView)findViewById(R.id.list_hospitals);
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
            view = getLayoutInflater().inflate(R.layout.custom_layout_hospitals,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.img1);
            TextView textView1=(TextView)view.findViewById(R.id.tv_hospitalName);
            TextView textView2=(TextView)view.findViewById(R.id.tv_location);
            TextView textView3=(TextView)view.findViewById(R.id.tv_contactinfo);

            imageView.setImageResource(IMAGES[i]);
            textView1.setText(NAMES[i]);
            textView2.setText(LOCATION[i]);
            textView3.setText(CONTACTINFO[i]);
            return view;

        }
    }
}

