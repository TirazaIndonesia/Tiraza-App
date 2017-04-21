package tiraza.aplikasi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    try {

    }

    catch {
        Context failConn = getApplicationContext();
        Toast failToConnect = Toast.makeText(failConn, "Error contacting Server", Toast.LENGTH_LONG);
        failToConnect.show();
    }

}
