package com.example.mymemoapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class main_daily extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.activity_main_daily, container, false);
                // 빈 데이터 리스트 생성.
        final ArrayList<String> list_daily = new ArrayList<String>();
        list_daily.add("앞머리를 잘랐다");
        list_daily.add("나는아무래도 평생 못기를것 같다");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        list_daily.add(" 메모장은 언제 안성될까");
        // ArrayAdapter 생성. 아이템 View를 선택(single choice)가능하도록 만듦.

        // listview 생성 및 adapter 지정.
        final ListView listview = (ListView) layout.findViewById(R.id.listview1) ;

        final CustomAdapter adapter = new CustomAdapter(
                getActivity(),
                0,
                list_daily
        );

        listview.setAdapter(adapter) ;
//
//        Button addButton = (Button)layout.findViewById(R.id.add) ;
//        addButton.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                int count;
//                count = adapter.getCount();
//                // 아이템 추가.
//                list_daily.add("LIST" + Integer.toString(count + 1));
//
//                // listview 갱신
//                adapter.notifyDataSetChanged();
//            }
//        }) ;
//
//        // delete button에 대한 이벤트 처리.
//        Button deleteButton = (Button)layout.findViewById(R.id.delete) ;
//        deleteButton.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                int count, checked ;
//                count = adapter.getCount() ;
//
//                if (count > 0) {
//                    // 현재 선택된 아이템의 position 획득.
//                    checked = listview.getCheckedItemPosition();
//
//                    if (checked > -1 && checked < count) {
//                        // 아이템 삭제
//                        list_daily.remove(checked) ;
//
//                        // listview 선택 초기화.
//                        listview.clearChoices();
//
//                        // listview 갱신.
//                        adapter.notifyDataSetChanged();
//                    }
//                }
//            }
//        }) ;



        // Inflate the layout for this fragment

        return layout;

    }
    private class CustomAdapter extends ArrayAdapter<String> {
        private ArrayList<String> items;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = LayoutInflater.from(getContext());
                v = vi.inflate(R.layout.dailyitem, null);
            }


            TextView textView = (TextView)v.findViewById(R.id.txt_content);
            textView.setText(items.get(position));

            return v;
        }
    }

}

