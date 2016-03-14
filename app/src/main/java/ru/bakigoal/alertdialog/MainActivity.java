package ru.bakigoal.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button dialogButton;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      dialogButton = (Button) findViewById(R.id.dialogButton);
      dialogButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            openDialog();
         }
      });
   }

   private void openDialog() {
      AlertDialog.Builder builder = new AlertDialog.Builder(this);
      builder.setMessage(R.string.main_activity_dialogMessage)
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                  finish();
               }
            })
            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                  Toast.makeText(MainActivity.this, "Good choice!", Toast.LENGTH_LONG).show();
               }
            });
      AlertDialog alertDialog = builder.create();
      alertDialog.show();
   }

}
