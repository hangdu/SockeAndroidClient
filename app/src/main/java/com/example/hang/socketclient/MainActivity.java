package com.example.hang.socketclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView response;
    EditText editTextAddress, editTextPort;
    Button buttonFinger1, buttonFinger2, buttonClear, buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAddress = (EditText) findViewById(R.id.addressEditText);
        editTextPort = (EditText) findViewById(R.id.portEditText);
        buttonFinger1 = (Button) findViewById(R.id.finger1Button);
        buttonFinger2 = (Button) findViewById(R.id.finger2Button);
        buttonClear = (Button) findViewById(R.id.clearButton);
        buttonSend = (Button) findViewById(R.id.sendButton);
        response = (TextView) findViewById(R.id.responseTextView);

        buttonFinger1.setOnClickListener(new View.OnClickListener() {
            //it is for sending fingerprinting
            @Override
            public void onClick(View arg0) {
                String position = "bedroom";
                List<Integer> list = new ArrayList<>();
                list.add(33);
                list.add(35);
                list.add(34);
                FingerPrint fingerPrint = new FingerPrint(position, list);
                Client myClient = new Client(fingerPrint, editTextAddress.getText()
                        .toString(), Integer.parseInt(editTextPort
                        .getText().toString()), response);
                myClient.execute();
            }
        });


        buttonFinger2.setOnClickListener(new View.OnClickListener() {
            //it is for sending fingerprinting
            @Override
            public void onClick(View arg0) {
                String position = "bathroom";
                List<Integer> list = new ArrayList<>();
                list.add(44);
                list.add(45);
                list.add(50);
                FingerPrint fingerPrint = new FingerPrint(position, list);
                Client myClient = new Client(fingerPrint, editTextAddress.getText()
                        .toString(), Integer.parseInt(editTextPort
                        .getText().toString()), response);
                myClient.execute();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                response.setText("");
            }
        });

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
    }
}
