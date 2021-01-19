package pro.gr.ams.sigma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent i = new Intent(getApplicationContext(), AppActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception ex) {
                    Toast.makeText(SplashActivity.this, ""+ex, Toast.LENGTH_SHORT).show();
                }
            }
        };
        thread.start();
    }
}
