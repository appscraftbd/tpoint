package com.appscraftbd.tangailmedicalpoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital_list extends AppCompatActivity {

    ListView listView;
    HashMap <String,String> hashMap = new HashMap<>();
    ArrayList <HashMap<String,String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);



        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","আল-শেফা ক্লিনিক এন্ড নার্সিং হোম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সেবা ক্লিনিক এন্ড হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","টাঙ্গাইল ক্লিনিক এন্ড হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সোনিয়া নার্সিং হোম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ঢাকা ক্লিনিক");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ডিজিল্যাব হসপিটাল টাঙ্গাইল লিমিটেড");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","বুরো হেলথ কেয়ার");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সেন্ট্রাল মুক্তা হাসপাতাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","মেডিনোভা মেডিকেল সার্ভিসেস লিমিটেড");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","গ্রীন ল্যাব হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ধলেশ্বরী হাসপাতাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ডক্টরস ক্লিনিক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","আয়শা খানম মেমোরিয়াল হাসপাতাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","আধুনিক ক্লিনিক এন্ড হসপিটাল");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","রাজধানী নার্সিং হোম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ল্যাব জোন");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","আমেনা ক্লিনিক");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","ক্যাপিটাল হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","জনতা ক্লিনিক এন্ড নার্সিং হোম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","জনসেবা হসপিটাল এন্ড ডায়াগনস্টিক সেন্টার");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","জয় ক্লিনিক এন্ড হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","দি সিটি হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","মেডিকো হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","নুরুল আমিন খান মাল্টিপারপাস মেডিকেল সেন্টার");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","পাইলট হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","এশিয়া হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সোনার বাংলা ক্লিনিক এন্ড হাসপাতাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সানরাইজ হাসপাতাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","সরকার হসপিটাল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","লাইফ কেয়ার");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hoslayout");
        hashMap.put("htitle","শাপলা নার্সিং হোম");
        arrayList.add(hashMap);


        listView = findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);






    }
    public class MyAdapter extends BaseAdapter{

        CardView hospitalbtn;


        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("MissingInflatedId")
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myview = layoutInflater.inflate(R.layout.hospital_layout,viewGroup,false);

            TextView textView = myview.findViewById(R.id.hospitalname);
            hospitalbtn = myview.findViewById(R.id.hospitalbtn);


            HashMap <String,String> hashMap = arrayList.get(position);
            textView.setText(hashMap.get("htitle"));
            hospitalbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                }
            });

            return myview;
        }
    }

}