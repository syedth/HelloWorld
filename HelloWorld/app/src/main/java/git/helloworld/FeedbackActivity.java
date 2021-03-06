package git.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    EditText editxt;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        setTitle("Feedback");

        editxt = (EditText) findViewById(R.id.edit_text_note) ;
        editxt.getSelectionStart();

        btnsend = (Button) findViewById(R.id.btnsend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeedbackActivity.this, NavigationDrawer.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(), "your feedback has been saved successfully", Toast.LENGTH_LONG).show();
            }
        });

    }

}
