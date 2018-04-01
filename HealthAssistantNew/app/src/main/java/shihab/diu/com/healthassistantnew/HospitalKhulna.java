package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalKhulna extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"City Nursing Home","Gorib Newaj Clinic & Diagnostic Centre","Khalishpur Clinic","Khulna Clinic","Nargis Memorial Clinic","Khulna Medical College and Hospital","Khulna BNSB Eye Hospital","Sheikh Abu Naser Specialised Hospital"};
    String [] LOCATION = {"Hazi Mohsin Road, Khulna","Khanjahan Ali Road, Islampur, Khulna","Khalishpur, Khulna","Tutpara, Khulna","TB Cross Road, Khulna","Sadar, Khulna","Sadar, Khulna","New Staff Quarters, Khulna"};
    String [] CONTACTINFO = {"Phone: +880-41-724329","Phone: +880-41-720081","Phone: +880-41-761637","Phone: +880-41-2830269","Phone: 0721-774354","Phone: 041-761535","Phone: 01714-028139","Phone: 041-760390"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Khulna)");
        setContentView(R.layout.activity_hospital_khulna);


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

