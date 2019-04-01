package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rdWill,rdDon,rdSparrow;
    private ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdWill = findViewById(R.id.rdWill);
        rdDon = findViewById(R.id.rdDon);
        rdSparrow = findViewById(R.id.rdSparrow);
        ivImage = findViewById(R.id.ivImage);

        rdWill.setOnClickListener(this);
        rdSparrow.setOnClickListener(this);
        rdDon.setOnClickListener(this);


    }
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.rdWill:
                ivImage.setImageResource(R.drawable.will);
            //    Toast toastWill=Toast.makeText(this,"This is Will Smith", Toast.LENGTH_LONG);
              //  toastWill.show();
                break;
                case R.id.rdDon:
                    ivImage.setImageResource(R.drawable.don);
//                    Toast toastDon=Toast.makeText(this,"This is Mr. Arnold", Toast.LENGTH_LONG);
  //                  toastDon.show();
                    break;
            case R.id.rdSparrow:
                ivImage.setImageResource(R.drawable.sparrow);
//                Toast toastSparrow=Toast.makeText(this,"This is Mr. Sparrow", Toast.LENGTH_LONG);
  //              toastSparrow.show();
                break;
        }
        }

    }



