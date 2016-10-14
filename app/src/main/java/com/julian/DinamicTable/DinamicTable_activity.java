package com.julian.DinamicTable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DinamicTable_activity extends AppCompatActivity {

    private TableLayout tblHeader,tblBody;

    private TableRow.LayoutParams tbrLayoutId;
    private TableRow.LayoutParams tbrLayoutName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamictable_activity);

        tblBody=(TableLayout)findViewById(R.id.tblBody);
        tblHeader=(TableLayout)findViewById(R.id.tblHeader);

        tbrLayoutId= new TableRow.LayoutParams(100,TableRow.LayoutParams.WRAP_CONTENT);
        tbrLayoutId.setMargins(0,10,0,10);
        tbrLayoutName= new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT);

        createHeader();
        createBody();

    }

    private void createHeader() {
        TableRow tbrHeader = new TableRow(this);

        TextView txvId= new TextView(this);
        txvId.setText(R.string.txvId);
        txvId.setLayoutParams(tbrLayoutId);
        tbrHeader.addView(txvId);

        TextView txvNombre= new TextView(this);
        txvNombre.setText(R.string.txvName);
        txvNombre.setLayoutParams(tbrLayoutName);
        tbrHeader.addView(tbrHeader);

        tblHeader.addView(tbrHeader);

    }

    private void createBody(){
        TableRow tbrBody;

        TextView txvId= new TextView(this);
        TextView txvName= new TextView(this);

        String[] listname= getResources().getStringArray(R.array.listName);

        for (int i=0; i <listname.length;i++){
            tbrBody= new TableRow(this);
        }

    }

}
