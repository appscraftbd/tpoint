package com.appscraftbd.tangailmedicalpoint;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class Fragment1 extends Fragment {


    RecyclerView recyclerView;
    HashMap <String,String > hashMap;
    ArrayList <HashMap<String,String>> arrayList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View f1 = inflater.inflate(R.layout.fragment_1, container, false);


        recyclerView = f1.findViewById(R.id.recyclerview);


        hashMap = new HashMap<>();
        hashMap.put("itemtype","searchlay");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","banner");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemtype","hospital");
        arrayList.add(hashMap);

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
        hashMap.put("itemtype","more");
        arrayList.add(hashMap);







        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(f1.getContext(),LinearLayoutManager.VERTICAL,false));







        return f1 ;
    }
    public class MyAdapter extends RecyclerView.Adapter{

        int search = 1;
        int banner = 2;
        int hospital = 3;
        int hoslayout = 4;
        int morebtn = 5;

        //////////////////////////////////////////////
        public class Seracholder extends RecyclerView.ViewHolder{
            public Seracholder(@NonNull View itemView) {
                super(itemView);
            }
        }

        public class Bannerholder extends RecyclerView.ViewHolder{
            public Bannerholder(@NonNull View itemView) {
                super(itemView);
            }
        }

        public class Hospitalholder extends RecyclerView.ViewHolder{
            public Hospitalholder(@NonNull View itemView) {
                super(itemView);
            }
        }

        public class Hospitallayoutholder extends RecyclerView.ViewHolder{
            TextView hostitle;
            public Hospitallayoutholder(@NonNull View itemView) {
                super(itemView);

                hostitle = itemView.findViewById(R.id.hospitalname);


            }
        }

        public class Moreholder extends RecyclerView.ViewHolder{
            TextView morebtn;
            public Moreholder(@NonNull View itemView) {
                super(itemView);
                morebtn = itemView.findViewById(R.id.morebtn);

            }
        }


        /////////////////////////////////////

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();

            if (viewType==search){
                View sview = layoutInflater.inflate(R.layout.search_layout,parent,false);
                return new Seracholder(sview);

            } else if (viewType==banner) {
                View sview = layoutInflater.inflate(R.layout.activity_banner_layout,parent,false);
                return new Bannerholder(sview);
            } else if (viewType==hospital) {
            View sview = layoutInflater.inflate(R.layout.hospital,parent,false);
            return new Hospitalholder(sview);
        }
            else if(viewType==hoslayout) {
                View sview = layoutInflater.inflate(R.layout.hospital_layout,parent,false);
                return new Hospitallayoutholder(sview);
            }
            else {
                View sview = layoutInflater.inflate(R.layout.more_item,parent,false);
                return new Moreholder(sview);
            }

        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if(getItemViewType(position)==hoslayout){
                Hospitallayoutholder myholder = (Hospitallayoutholder) holder;


                hashMap = arrayList.get(position);
                myholder.hostitle.setText(hashMap.get("htitle"));


            } else if (getItemViewType(position)==morebtn) {

                Moreholder moreholder = (Moreholder) holder;
                moreholder.morebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getActivity().getApplication(),Hospital_list.class);
                        startActivity(intent);


                    }
                });

            }

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


        @Override
        public int getItemViewType(int position) {


            hashMap = arrayList.get(position);
            String sitemtype = hashMap.get("itemtype");



            if (sitemtype.contains("searchlay"))
                return search;
            else if (sitemtype.contains("banner"))
                return banner;

            else if (sitemtype.contains("hospital"))
                return hospital;

            else if(sitemtype.contains("hoslayout"))
                return hoslayout;
            else return morebtn;




        }


        //////////////////////////////////////////////////////////////




    }


}