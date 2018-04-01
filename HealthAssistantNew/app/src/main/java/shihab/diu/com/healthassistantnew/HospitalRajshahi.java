package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
public class HospitalRajshahi extends AppCompatActivity {

    int[] IMAGES = {R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos, R.drawable.hos};

    String [] NAMES = {"Amana Hospital Limited","Al-Arafa Clinic","Christian Mission Hospital","Islami Bank Hospital","Rajshahi Medical College","Mukti Clinic","Popular Diagnostic Center Ltd","TB Hospital"};
    String [] LOCATION = {"Laxmipur Jhautola Mor, Rajshahi","Bornali More, Rajshahi","Kazihata, Rajshahi","Laxmipur, Rajshahi","Greater Road, Laxmipur, Rajshahi","Laxmipur, Rajshahi","Laxmipur, Rajshahi","T.B Hospital Rd, Rajshahi"};
    String [] CONTACTINFO = {"Phone: 0721-772686","Phone: 01713-702838","Phone: 721776180","Phone: 0721-774975-76","Phone: 0721-774354","Phone: 0721-775447","Phone: 0721-812117","Phone: 0721-779133"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Hospital Information (Rajshahi)");
        setContentView(R.layout.activity_hospital_rajshahi);


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

