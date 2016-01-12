package com.andela.omotoso.bukola.movementtracker.Activities;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.andela.omotoso.bukola.movementtracker.R;

public class SettingsActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    private TextView delayText;
    private NumberPicker numberPicker;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        delayText = (TextView) findViewById(R.id.delay_time);
        dialog = new Dialog(this);
        //dialog.setContentView(R.layout.activity_settings);
        numberPicker = (NumberPicker)dialog.findViewById(R.id.number_picker);
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

    }

    public void showNumberPickerDialog(View view) {
        dialog.setTitle("Set Delay Time");
        numberPicker.setMaxValue(60);
        numberPicker.setMinValue(0);
        dialog.show();
        numberPicker.setOnValueChangedListener(this);
        delayText.setText(String.valueOf(numberPicker.getValue() + " minutes"));
    }



}
