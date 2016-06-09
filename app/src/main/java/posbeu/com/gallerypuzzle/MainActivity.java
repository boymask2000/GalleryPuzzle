package posbeu.com.gallerypuzzle;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends Activity {

    private SurfacePanel surface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Heap.setMainActivity(this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        surface = new SurfacePanel(getBaseContext(), null);
        setContentView(surface);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
            setActionBar(myToolbar);
        }
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
