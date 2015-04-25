package id.ac.unsyiah.elektro.mobile.calc1;

import android.preference.EditTextPreference;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up btn_terjemah, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onRadioButtonClicked(View view) {

        EditText txtangka1 = (EditText) findViewById(R.id.editText);
        String angka1Str = String.valueOf(txtangka1.getText());
        int angka1 = Integer.valueOf(angka1Str);

        EditText txtangka2 = (EditText) findViewById(R.id.editText2);
        String angka2Str = String.valueOf(txtangka2.getText());
        int angka2 = Integer.valueOf(angka2Str);

        // Is the button now checked?
        int hasil = 0;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_div:
                if (checked)
                    hasil = angka1 / angka2;
                break;
            case R.id.radio_mul:
                if (checked)
                    hasil = angka1 * angka2;
                break;
            case R.id.radio_plus:
                if (checked)
                    hasil = angka1 + angka2;
                break;
            case R.id.radio_min:
                if (checked)
                    hasil = angka1 - angka2;
                break;
        }
        TextView lblhasil = (TextView) findViewById(R.id.txt_hasil);
        lblhasil.setText(String.valueOf(hasil));
    }
}