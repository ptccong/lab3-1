package vn.edu.poly.lab3;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Browser;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnShowContact;
    private Button btnShowCallLogs;
    private Button btnShowMediaStore;
    private Button btnShowAppSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowContact = findViewById(R.id.btnShowContact);
        btnShowCallLogs = findViewById(R.id.btnShowCallLogs);
        btnShowMediaStore = findViewById(R.id.btnShowMediaStore);
        btnShowAppSettings = findViewById(R.id.btnShowAppSettings);


        btnShowContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,danhBa.class);
                startActivity(intent);
            }
        });
        btnShowAppSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accessBookmarks();
            }
        });


    }
    public void accessBookmarks()
    {
//        String []projection= new String[]{
//                Browser.BookmarkColumns.TITLE,
//                Browser.BookmarkColumns.URL,
//        };
//        Cursor c=getContentResolver()
//                .query(Browser., projection,
//                        null, null, null);
//        c.moveToFirst();
//        String s="";
//        int titleIndex=c.getColumnIndex
//                (Browser.BookmarkColumns.TITLE);
//        int urlIndex=c.getColumnIndex
//                (Browser.BookmarkColumns.URL);
//        while(!c.isAfterLast())
//        {
//            s+=c.getString(titleIndex)+" - "+
//                    c.getString(urlIndex);
//            c.moveToNext();
//        }
//        c.close();
//        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }




}
