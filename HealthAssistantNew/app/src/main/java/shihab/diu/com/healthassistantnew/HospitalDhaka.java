package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalDhaka extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos,R.drawable.hos,R.drawable.hos,R.drawable.hos,R.drawable.hos,R.drawable.hos};

    String [] NAMES = {"Apollo Hospital","Bangladesh Medical College","Bangabandhu Shiekh Mujib Medical University","Dhaka Medical College and Hospital","Ibn Sina Hospital","General Hospital Ltd","Chandshi Medical Centre","National Heart Foundation Hospital","Centre For Health And Development Medical Complex","China-Bangla Hospital (Jv) Ltd.","Meriland Hospital","Parkway Healthcare Information Centre","Modern Clinic Of Surgery & Midwifery"};
    String [] LOCATION = {"Bashundhara r/a, Dhaka","House # 35, Road # 14/A, Dhanmondi","Shahbag, Dhaka-1000","Address : 100 Ramna, Bakshi Bazar, Dhaka-1000","House #47, Road #9/A, Satmasjid Road, Dhanmondi","House #60, Road #8/A,Dhanmondi, R/A, Dhaka","House # 9, Road # 27, Block # K, Banani","7/2 Mirpur Rd, Dhaka 1216","House #16, Road #16, Sector #4, Uttara Model Town","Plot #1, Road #7, Sector #1, Uttara","Sector #1, Road #13, House #4, Uttara","Suite –B3, Level -10, Road #53, Gulshan –2","House #5, Road #11, Gulshan –1"};
    String [] CONTACTINFO = {"PABX :(02) 8401661-5,Duty Manager:01713-064563 Web : www.apollodhaka.com","phone- 9118202, 8115843","Phone : +880-2-8626812-16 web: www.bsmmu.edu.bd","phone- 8614001-9,8614545","ph- 9128835-7,9126625-5","ph- 9116851,91137181,9137182","phone- 8821875, 9554571","Phone: 02-9033442","phone - 8920670","phone - 8913674, 8913606","phone- 8919481","phone- 8850422, 8850423","phone- 8821578"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Dhaka)");
        setContentView(R.layout.activity_hospital_dhaka);


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

