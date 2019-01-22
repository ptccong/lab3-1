package vn.edu.poly.lab3;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.content.CursorLoader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class danhBa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_ba);
        showAllContacts1();
    }
    public void showAllContacts1()
    {
        Uri uri=Uri.parse("content://contacts/people");
        ArrayList<String> list=new ArrayList<String>();
        CursorLoader loader=new
                CursorLoader(this, uri, null, null, null, null);
        Cursor c1=loader.loadInBackground();
        c1.moveToFirst();
        while(c1.isAfterLast()==false){
            String s="";
            String idColumnName=ContactsContract.Contacts._ID;
            int idIndex=c1.getColumnIndex(idColumnName);
            s=c1.getString(idIndex)+" - ";
            String nameColumnName= ContactsContract.Contacts.DISPLAY_NAME;
            int nameIndex=c1.getColumnIndex(nameColumnName);
            s+=c1.getString(nameIndex);
            c1.moveToNext();
            list.add(s);
        }
        c1.close();
        ListView lv=(ListView) findViewById(R.id.lvDb);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
