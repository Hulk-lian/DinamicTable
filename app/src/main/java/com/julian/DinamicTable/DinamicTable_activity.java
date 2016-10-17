package com.julian.DinamicTable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


/**
 * @author  Julián Troyano
 * @version 1.0
 *
 * Execise shows how to create component at runtime
 */
public class DinamicTable_activity extends AppCompatActivity {


    //variables
    private TableLayout tblHeader,tblBody;

    private TableRow.LayoutParams tbrLayoutId;
    private TableRow.LayoutParams tbrLayoutName;

    private TableRow tbrHeader;
    private TableRow tbrBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamictable_activity);

        tblBody=(TableLayout)findViewById(R.id.tblBody);
        tblHeader=(TableLayout)findViewById(R.id.tblHeader);

        //add the id and the name
        tbrLayoutId= new TableRow.LayoutParams(100,TableRow.LayoutParams.WRAP_CONTENT);
        tbrLayoutId.setMargins(0,10,0,10);
        tbrLayoutName= new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT);
        tbrLayoutName.setMargins(0,10,0,10);

        createHeader();
        createBody();

    }
//method for create the header with id and name
    private void createHeader() {

        tbrHeader = new TableRow(this);

        TextView txvId= new TextView(this);
        txvId.setText(R.string.txvId);
        txvId.setLayoutParams(tbrLayoutId);
        txvId.setBackgroundResource(R.drawable.shape_header);
        txvId.setGravity(Gravity.CENTER);

        TextView txvNombre= new TextView(this);
        txvNombre.setText(R.string.txvName);
        txvNombre.setLayoutParams(tbrLayoutName);
        txvNombre.setBackgroundResource(R.drawable.shape_header);
        txvId.setGravity(Gravity.CENTER);

        tbrHeader.addView(txvId);
        tbrHeader.addView(txvNombre);

        tblHeader.addView(tbrHeader);

    }

    //method for create the body
    private void createBody(){

        TextView txvId;
        TextView txvName;

        String[] listname= getResources().getStringArray(R.array.listName);

        for (int i=0; i <listname.length;i++){

            tbrBody= new TableRow(this);

            txvId= new TextView(this);
            txvId.setText(" "+(i+1)+" ");
            txvId.setLayoutParams(tbrLayoutId);
            txvId.setBackgroundResource(R.drawable.shape_body);

            txvName= new TextView(this);
            txvName.setText(listname[i]);
            txvName.setLayoutParams(tbrLayoutName);
            txvName.setBackgroundResource(R.drawable.shape_body);


            tbrBody.addView(txvId);
            tbrBody.addView(txvName);

            tblBody.addView(tbrBody);
        }

    }

}
