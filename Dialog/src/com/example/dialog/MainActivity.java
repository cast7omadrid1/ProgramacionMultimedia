package com.example.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	CharSequence[] items = { "Google", "Apple", "Microsoft" };
	boolean[] itemsChecked = new boolean [items.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    //metodo onClik dnd llamamos al metodo "showDialog" 
    //esta referenciado en el activity_main.xml en el "button"
    
    public void onClick(View view)
    {
    	showDialog(0);
    }
    
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
    	case 0:
    	return new AlertDialog.Builder(this)
    	.setIcon(R.drawable.ic_launcher)
    	.setTitle("This is a dialog with some simple text...")
    	.setPositiveButton("OK",
    			new DialogInterface.OnClickListener() {
    					public void onClick(DialogInterface dialog, int whichButton)
    					{
    						Toast.makeText(getBaseContext(),
    								"OK clicked!", Toast.LENGTH_SHORT).show();
    					}
    			}
    	)
    	.setNegativeButton("Cancel",
    			new DialogInterface.OnClickListener() {
    				public void onClick(DialogInterface dialog, int whichButton)
    				{
    					Toast.makeText(getBaseContext(),
    							"Cancel clicked!", Toast.LENGTH_SHORT).show();
    				}
    		}
    	)
    	.setMultiChoiceItems(items, itemsChecked,
    			new DialogInterface.OnMultiChoiceClickListener() {
    				public void onClick(DialogInterface dialog,
    						int which, boolean isChecked) {
    							Toast.makeText(getBaseContext(),
    									items[which] + (isChecked ? " checked!":" unchecked!"),
    									Toast.LENGTH_SHORT).show();
    	
    					}
    				}
    			).create();
    		}
    	return null;
    	}
    
}
