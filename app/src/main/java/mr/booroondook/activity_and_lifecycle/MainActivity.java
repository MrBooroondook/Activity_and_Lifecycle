package mr.booroondook.activity_and_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(@SuppressWarnings("unused") View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.MESSAGE,
                String.format("%s\n%s\n%s\n%s\n%s\n%s",
                        Build.BRAND, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT,
                        Build.DEVICE, Build.TAGS));
        startActivity(intent);
    }
}
