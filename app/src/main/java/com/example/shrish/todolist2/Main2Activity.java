package com.example.shrish.todolist2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    private LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1 =(Button) findViewById(R.id.but1);
        Button b2  =(Button) findViewById(R.id.but2);
        Button b3 = (Button)findViewById(R.id.but3);
        ll = (LinearLayout)findViewById(R.id.lll);




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View rowView = inflater.inflate(R.layout.layout,null);
                ll.addView(rowView,ll.getChildCount()-1);
                rowView.requestFocus();


            }
        });


    }
    public void onDelete(View v)
    {
        ll.removeView((View) v.getParent());

    }

}
