package com.example.newintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void process(View view) {

        Intent intent = null;
        Intent chooser = null;

        if (view.getId() == R.id.LaunchMap)
        {
            intent = new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData((Uri.parse("geo:19.076,72.8777")));
            chooser=Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);

        }
        if (view.getId() == R.id.LaunchPlaystore )
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=dolphin.developers.com"));
            chooser=Intent.createChooser(intent,"Launch Market");
            startActivity(chooser);

        }
        if (view.getId() == R.id.LaunchGmail)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("Bad Guy"));
            String[] to={"u.etimbuk333@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi, this was send from my app");
            intent.putExtra(Intent.EXTRA_TEXT, "Hey whats up, this is my first gmail messages");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent, "Send Email");
            startActivity(chooser);

        }


    }
}
