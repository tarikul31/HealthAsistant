package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalBarisal extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"Ambia Memorial Hospital","BAVS Maternity Hospital","Dr. Captain Najib Uddin Clinic","Eden Nursing Home","Fair Health Clinic"};
    String [] LOCATION = {"West Bogra Road, Barisal-8200","Hospital Road, Barisal","45, Sader Road, Barisal","Bogra Road, Barisal","Kalibari Road, Barisal"};
    String [] CONTACTINFO = {"Phone: +880 431 2176017, PABX-63668-9","Phone: +880 431 63868","Phone: +880-431-2173234","Phone: +880-431-64879","Phone: +880-431-64412"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Barisal)");
        setContentView(R.layout.activity_hospital_barisal);


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

