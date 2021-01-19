/*
https://developer.android.com/docs
https://docs.oracle.com/javase/8/docs/api/overview-summary.html
 */

package pro.gr.ams.sigma;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // https://developer.android.com/guide/topics/ui/dialogs
        alertDialog();
    }

    private void alertDialog() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final LayoutInflater inflater = getLayoutInflater();

        final View viewDialog = inflater.inflate(R.layout.dialog_amount, null);
        builder.setView(viewDialog)
                // Add action buttons
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        try {
                            EditText main_amountDTTXT = (EditText)(viewDialog).findViewById(R.id.main_amountDTTXT);
                            Toast.makeText(TestActivity.this, ""+main_amountDTTXT.getText().toString(), Toast.LENGTH_SHORT).show();


                        } catch (Exception ex) {
                            Toast.makeText(TestActivity.this, ""+ex, Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        builder.create();
        builder.show();
    }

}
