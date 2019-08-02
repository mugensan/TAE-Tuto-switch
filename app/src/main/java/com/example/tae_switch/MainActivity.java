package com.example.tae_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch onOffSwitch;
    private TextView sw_result;
    private ImageView img_sw_on;
    private ImageView img_sw_off;
    private Button btn_sw_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sw_off = findViewById(R.id.btn_sw_off);

        sw_result = findViewById(R.id.sw_result);

        img_sw_on = findViewById(R.id.img_sw_on);
//        img_sw_off = findViewById(R.id.img_sw_off);

        onOffSwitch = findViewById(R.id.onOffSwitch);
        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.v("Switch State= ", ""+isChecked);
                if(isChecked){
                    sw_result.setText("OFF");
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
//                    img_sw_off.setImageResource(R.drawable.ic_launcher_background);
                    btn_sw_off.setVisibility(View.INVISIBLE);

                }else{
                    sw_result.setText("ON");
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
                    btn_sw_off.setVisibility(View.VISIBLE);
//                    img_sw_on.setImageResource(R.drawable.ic_launcher_foreground);

                }
            }
        });



    }
}
