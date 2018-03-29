package example.docljn.com.menulesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class FrontPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        if ( menuItem.getItemId() == R.id.action_hello){
            Toast.makeText(FrontPageActivity.this, R.string.menu_toast_hello, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }




}
