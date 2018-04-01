package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalChittagong extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"Al-Zahar Hospital Ltd.","Centre Point Hospital Ltd.","Chattagram Metropoliton Hospital Ltd.","Chittagong General Hospital","Chittagong Maa-O-Shishu Hospital","Chittagong Medical College & Hospital","Holy Crescent Hospital Ltd.","National Hospital Ctittagong"};
    String [] LOCATION = {"1062, Love Lane (1st Floor)","100 Momin Road, Chittagong–4000","948, O.R. Nizam Road","Andarkillah, Chittagong","Agrabad, Chittagong","Fazlul Kader Road, Chittagong","500/A, Zakir Hossain Road, Khulshi, Chittagong","30, Mehdibagh, Chittagong"};
    String [] CONTACTINFO = {"Phone: 619378, 624494","Phone: 639025 – 7","Phone: 031-651242","Phone: 611407","Phone: 711236, 500063","Phone: 619597","Phone: 620025-8","Phone: 623713, 623753"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Chittagong)");
        setContentView(R.layout.activity_hospital_chittagong);


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

