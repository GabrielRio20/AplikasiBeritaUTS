package com.example.aplikasiberitauts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailDataActivity extends AppCompatActivity {
    EditText var_tanggal;
    Spinner spinner;
    Button lanjut;
    int usia;
    TextView usiaUser;
    public static final String MESSAGE_EXTRA = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);
        getSupportActionBar().hide();

        var_tanggal = findViewById(R.id.tanggal);
        spinner = findViewById(R.id.kategori);
        lanjut = findViewById(R.id.btn_berita);
        usiaUser = findViewById(R.id.txt_usia);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cariBerita(v);
            }
        });

        var_tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });

        var_tanggal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    showDatePicker();
                }
            }
        });

        //array spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        if(spinner != null){
            spinner.setAdapter(adapter);
        }
    }

    //method tanggal
    public void showDatePicker(){
        DialogFragment dateFragment = new com.example.aplikasiberitauts.DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), "date-picker");
    }

    public void processedDatePickerResult(int day, int month, int year){
        String day_string = Integer.toString(day);
        String month_string = Integer.toString(month);
        String year_string = Integer.toString(year);
        String dateMessage = day_string + "/" + month_string + "/" + year_string;
        var_tanggal.setText(dateMessage);

        usia = (2022 - year);
        String strUsia = Integer.toString(usia);
        usiaUser.setText(strUsia);
    }

    public void cariBerita(View v){
        Intent intent = new Intent(DetailDataActivity.this, MainActivity.class);
        String message = spinner.getSelectedItem().toString();
        int message2 = usia;
        intent.putExtra(MESSAGE_EXTRA, message);
        intent.putExtra("usiaUser", message2);
        startActivityForResult(intent, 1);
    }

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
}