package movil.unicauca.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import movil.unicauca.adapter.Models.Planeta;
import movil.unicauca.adapter.databinding.ActivityAddBinding;
import movil.unicauca.adapter.util.Data;

public class AddActivity extends AppCompatActivity {

    ActivityAddBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    public void guardar(){

        String n = binding.nombre.getText().toString();
        String g = binding.gravedad.getText().toString();
        Planeta p = new Planeta(n, Float.parseFloat(g));
        Data.planetas.add(p);
        finish();
    }
}
