package com.example.user.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity2 extends AppCompatActivity {

    private TimePicker timePicker;
    private TextView Textview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        timePicker=(TimePicker) findViewById(R.id.timepickerid);
        timePicker.setIs24HourView(true);
        Textview=(TextView) findViewById(R.id.textviewid);
        button=(Button) findViewById(R.id.buttonid);

        button.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v) {
                                          String time=timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                                          Textview.setText(time);
                                      }
                                  }
        );

    }
}
