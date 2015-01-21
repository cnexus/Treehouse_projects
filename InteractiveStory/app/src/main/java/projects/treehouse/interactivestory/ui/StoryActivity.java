package projects.treehouse.interactivestory.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import projects.treehouse.interactivestory.R;


public class StoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        String name = getIntent().getStringExtra(getString(R.string.key_name));
        ((TextView) findViewById(R.id.textView)).setText("Hello " + name + "!");
    }
}
