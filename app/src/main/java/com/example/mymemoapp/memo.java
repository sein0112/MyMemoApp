package com.example.mymemoapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class memo extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.activity_memo, container, false);
        // Inflate the layout for this fragment
        final ArrayList<String> list_memo = new ArrayList<String>();
        list_memo.add("곧 시험기간입니다 \n홍아아아앙아아아앙");
        list_memo.add("언제 완성핳ㄹ 수 있을까 \n\n\n끼야아아\n\n아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");
        list_memo.add("살려주세요오오아 \n끼야아아아아아 \n꾸엥게ㅔ게레레");

        final GridView gridView = (GridView) layout.findViewById(R.id.gridview1);

        final GridAdapter gridAdapter = new GridAdapter(
                getActivity(),
                0,
                list_memo);

        gridView.setAdapter(gridAdapter);
        return layout;


    }


    class GridAdapter extends ArrayAdapter<String> {
        private ArrayList<String> items;

        public GridAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = LayoutInflater.from(getContext());
                v = vi.inflate(R.layout.memo_item, null);
            }


            TextView textView = (TextView)v.findViewById(R.id.txt_content2);
            textView.setText(items.get(position));

            return v;
        }
    }


}



//class GridAdapter extends BaseAdapter{
//    Context context;
//
//    final Integer[] porsterID ={
//            1,2,3,4,5
//    };
//
//    public GridAdapter(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public int getCount() {
//        return porsterID.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        TextView textView = new TextView(context);
//        textView.setText(porsterID[position]);
//
//        return textView;
//    }
//}