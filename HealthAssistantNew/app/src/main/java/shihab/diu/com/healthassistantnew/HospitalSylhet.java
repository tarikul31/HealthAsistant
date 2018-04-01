package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalSylhet extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"Al-Banna General Hospital","Al-Nur Eye Clinic ","Burhan Uddin Hospital","Health Care Hospital & Trauma Centre","Ibn Sina Hospital Sylhet Ltd","Jalalabad Ragib-Rabeya Medical College & Hospital","Nurjahan Hospital","Royal Hospital and Research Center"};
    String [] LOCATION = {"Dorgah Gate, Amborkhana, Sylhet","House-7, Road-8, Block-A Uposhahar, Sylhet","Chowkidekhi, Sylhet","98 Kazalshah, New Medical Road, Sylhet","Subhanighat Point, Sylhet","Sunamgonj Road, Pathantula, Sylhet","Dorgah Gate, Sylhet","Zindabazar, Sylhet"};
    String [] CONTACTINFO = {"Phone: +880821725441","Phone: +88 0821715620, +88 01716753657","Phone: +88 0821724424","Phone: +88 08212830792","Phone:  +88 08212832735","Phone: +88 0821719096","Phone:  +88 0821714123","Phone: +88 0821723362, +88 0821714850"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Sylhet)");
        setContentView(R.layout.activity_hospital_sylhet);


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

