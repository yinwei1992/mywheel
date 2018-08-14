package com.example.dell.mywheel.wheel;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.dell.mywheel.R;


/**
 * Created by yinwie on 2018/4/10.
 */

public class TimeViewHolder extends RecyclerView.ViewHolder {
    public final TextView tv;

    public TimeViewHolder(View itemView){
        super(itemView);
      tv = (TextView) itemView.findViewById(R.id.tv);
    }
}
