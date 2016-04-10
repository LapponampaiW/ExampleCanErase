package com.su.lapponampai_w.test_canerease;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText1, editText2;
    private TextView resultTextView;
    private Button resultButton;
    private TextView displayListView1, displayListView2;
    private Double aDouble1, aDouble2, sumDouble;
    private String str1, str2;
    private int x1, x2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bindWidget
        bindWidget();
        //ลองเอาค่าจาก EditText ไปใส่ใน ListView

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //ทำให้ EditText กลายเป็น String
                str1 = editText1.getText().toString().trim();
                str2 = editText2.getText().toString().trim();

                //เช็คว่ามีค่าว่าหรือไม่
                if (str1.equals("") || str2.equals("")) {
                    MyAlert("มีค่าว่าง");
                } else {
                    process();

                }
            }
        });

    }

    private void process() {
        //ลองนำข้อความไปใส่ในอีกทีหนึ่ง
        displayListView1.setText(str1);
        displayListView2.setText(str2);

        //เปลี่ยนจาก String เป็น Double
        aDouble1 = Double.parseDouble(str1);
        aDouble2 = Double.parseDouble(str2);
        //เอามาบวกกัน
        sumDouble = aDouble1 + aDouble2;

        //เปลี่ยนจาก Double เป็น String
        String sumstr = Double.toString(sumDouble);

        //เป็น sumstr ไปแสดงผลที่ช่อง resultTextView
        resultTextView.setText(sumstr);

    }




}

    private void MyAlert(String str4) {
        Toast.makeText(getBaseContext(), str4, Toast.LENGTH_LONG).show();
    }

    private void bindWidget() {
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);
        resultTextView = (TextView) findViewById(R.id.text3);
        resultButton = (Button) findViewById(R.id.button);
        displayListView1 = (TextView) findViewById(R.id.textView);
        displayListView2 = (TextView) findViewById(R.id.textView2);



    }


}
