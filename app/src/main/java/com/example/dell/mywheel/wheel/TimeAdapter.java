package com.example.dell.mywheel.wheel;

import android.graphics.Color;
import android.view.LayoutInflater;

import com.example.dell.mywheel.R;

import java.util.List;


/**
 * Created by yinwei on 2018/4/10.
 */

public class TimeAdapter<T> extends WheelView.WheelAdapter<TimeViewHolder> {
    private List<T> timelist;
    private String str;
    public TimeAdapter(List<T> timelist, String str){
        this.timelist = timelist;
        this.str = str;
    }

    private int pos;

    @Override
    public int getItemCount() {
        return (timelist!=null&&timelist.size()>0)?timelist.size():0;
    }

    @Override
    public TimeViewHolder onCreateViewHolder(LayoutInflater inflater, int viewType) {
        return new TimeViewHolder(inflater.inflate(R.layout.timeview_item, null, false));
    }

    @Override
    public void onBindViewHolder(TimeViewHolder holder, int position) {
        if (str!=null){
            holder.tv.setText(timelist.get(position)+"");
            if (position==pos){
                holder.tv.setTextColor(Color.parseColor("#000000"));
            }else{
                holder.tv.setTextColor(Color.GRAY);
            }
            holder.tv.setText(timelist.get(position)+str);
        }else{
            if (position==pos){
                holder.tv.setTextColor(Color.parseColor("#000000"));
            }else{
                holder.tv.setTextColor(Color.GRAY);
            }
        }
    }

    @Override
    public void getSelect(int pos) {
        this.pos = pos;
        notifyDataSetChanged();
    }

}
