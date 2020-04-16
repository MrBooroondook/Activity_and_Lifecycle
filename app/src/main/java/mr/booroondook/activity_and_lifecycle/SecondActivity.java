package mr.booroondook.activity_and_lifecycle;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends LoggingActivity {
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.text_view_2);
        textView.setText(getIntent().getStringExtra(MESSAGE));
    }
}
