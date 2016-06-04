package posbeu.com.gallerypuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private SurfacePanel surface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Heap.setMainActivity(this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        surface = new SurfacePanel(getBaseContext(), null);
        setContentView(surface);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.view:



                Intent gameIntent = new Intent(this, ShowImageActivity.class);
                startActivity(gameIntent);




                return true;
/*            case R.id.solve:

                surface.goSolve();

                return true;*/
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
