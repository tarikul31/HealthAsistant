package shihab.diu.com.healthassistantnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PsychologyDoctors extends AppCompatActivity {

    ListView listView;

    int[] IMAGES = {R.drawable.psychology, R.drawable.psychology, R.drawable.psychology, R.drawable.psychology, R.drawable.psychology, R.drawable.psychology, R.drawable.psychology, R.drawable.psychology};

    String [] NAMES = {"Prof Dr. M S I Mullick", "Prof Dr.Md. Shah Alam", "Prof Dr. Anwara Begum", "Prof Dr. Md. Enayet Karim" , "Prof Dr. Mahmood Hasan","Prof Dr. Md. Ahsanul Habib","Prof Dr. Md. Golam Rabbani","Dr. Farzana Rabin"};
    String [] DESIGNATION = {"MBBS,Phd,FCPS(Psycology),MRC Psyc(London)", "MBBS,FCPS(Psychology)","MBBS, FCPS ,MRCP sych(London)", "MBBS, FCPS(Psychiatry)","MBBS,FCPS(PSY),FCP(PAK)","MBBS, FCPS(Psyhch)","MBBS, FCPS","MBBS, M.Phil(Psychiatry)"};
    String [] ACTIVITY = {"Professor & Chairman (BSMMU)", "Labaid Limited (Dhanmondi)","BIRDEM General Hospital and Ibrahim Medical College", "Hi Tech Modern Psychiatric Hospital","Pro & Head DMCH","Pro & Ex-Director Pabna Mental Hospital","National Institute of Mental Health","Holy Family Red Crescent Medical College"};
    String [] CONTACTINFO = {"Phone: +880-2-8610793-8, 9670210-3", "Phone: + 880-2-8610793-8, 9670210-3","Tel: +88-02-9661551-60, +880-02-9146357", "Phone : 02-9131958, 01730-351728","Phone : 8610420, 9666497","Phone: +880-2-8156914, 8156839","Phone: +880-2-8620353-6, 8624907-10","Phone : 02-9131958, 01712-544914"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Psychology Doctors");
        setContentView(R.layout.activity_psychology_doctors);


        listView=(ListView)findViewById(R.id.list_doctor_psychology);
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

