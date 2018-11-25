package es.usj.task201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        String result = "";
        switch(id){
            case R.id.Option1:
                Toast.makeText(this,"Se seleccionó la primera opción",Toast.LENGTH_LONG).show();
                break;
            case R.id.Option2:
                Toast.makeText(this,"Se seleccionó la segunda opción",Toast.LENGTH_LONG).show();
                break;
            case R.id.Option3:
                Toast.makeText(this,"Se seleccionó la tercera opción",Toast.LENGTH_LONG).show();
                break;
            case R.id.Option4:
                Toast.makeText(this,"Se seleccionó la cuarta opción",Toast.LENGTH_LONG).show();
                break;
        }

    return true;
    }

}
