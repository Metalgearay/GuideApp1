package com.example.brett.guideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class map_screen extends ActionBarActivity implements View.OnClickListener {

    static DensityInterface density = new DensityInterface();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen);

        //-----------------------------------------------------------
        // BUTTONS

        Button myButton1 = (Button) findViewById(R.id.button_noco);
        myButton1.setX(120);
        myButton1.setY(30);
        myButton1.setOnClickListener(this);

        Button myButton2 = (Button) findViewById(R.id.button_pupin);
        myButton2.setX(220);
        myButton2.setY(30);
        myButton2.setOnClickListener(this);

        Button myButton3 = (Button) findViewById(R.id.button_gym);
        myButton3.setX(220);
        myButton3.setY(100);
        myButton3.setOnClickListener(this);

        Button myButton4 = (Button) findViewById(R.id.button_schapiro);
        myButton4.setX(440);
        myButton4.setY(40);
        myButton4.setOnClickListener(this);

        Button myButton5 = (Button) findViewById(R.id.button_mudd);
        myButton5.setX(650);
        myButton5.setY(30);
        myButton5.setOnClickListener(this);

        Button myButton6 = (Button) findViewById(R.id.button_fairchild);
        myButton6.setX(680);
        myButton6.setY(120);
        myButton6.setOnClickListener(this);

        Button myButton7 = (Button) findViewById(R.id.button_cs);
        myButton7.setX(850);
        myButton7.setY(120);
        myButton7.setOnClickListener(this);

        Button myButton8 = (Button) findViewById(R.id.button_schermerhorn);
        myButton8.setX(700);
        myButton8.setY(320);
        myButton8.setOnClickListener(this);

        Button myButton9 = (Button) findViewById(R.id.button_uris);
        myButton9.setX(420);
        myButton9.setY(220);
        myButton9.setOnClickListener(this);

        Button myButton10 = (Button) findViewById(R.id.button_havemeyer);
        myButton10.setX(120);
        myButton10.setY(320);
        myButton10.setOnClickListener(this);

        Button myButton11 = (Button) findViewById(R.id.button_chandler);
        myButton11.setX(120);
        myButton11.setY(220);
        myButton11.setOnClickListener(this);

        Button myButton12 = (Button) findViewById(R.id.button_math);
        myButton12.setX(120);
        myButton12.setY(450);
        myButton12.setOnClickListener(this);

        Button myButton13 = (Button) findViewById(R.id.button_avery);
        myButton13.setX(680);
        myButton13.setY(450);
        myButton13.setOnClickListener(this);

        Button myButton14 = (Button) findViewById(R.id.button_fayer);
        myButton14.setX(850);
        myButton14.setY(450);
        myButton14.setOnClickListener(this);

        Button myButton15 = (Button) findViewById(R.id.button_stpaul);
        myButton15.setX(730);
        myButton15.setY(600);
        myButton15.setOnClickListener(this);

        Button myButton16 = (Button) findViewById(R.id.button_low);
        myButton16.setX(420);
        myButton16.setY(550);
        myButton16.setOnClickListener(this);

        Button myButton17 = (Button) findViewById(R.id.button_earl);
        myButton17.setX(220);
        myButton17.setY(600);
        myButton17.setOnClickListener(this);

        Button myButton18 = (Button) findViewById(R.id.button_lewi);
        myButton18.setX(120);
        myButton18.setY(700);
        myButton18.setOnClickListener(this);

        Button myButton19 = (Button) findViewById(R.id.button_buell);
        myButton19.setX(680);
        myButton19.setY(700);
        myButton19.setOnClickListener(this);

        Button myButton20 = (Button) findViewById(R.id.button_philo);
        myButton20.setX(850);
        myButton20.setY(700);
        myButton20.setOnClickListener(this);

        Button myButton21 = (Button) findViewById(R.id.button_kent);
        myButton21.setX(690);
        myButton21.setY(850);
        myButton21.setOnClickListener(this);

        Button myButton22 = (Button) findViewById(R.id.button_dodge);
        myButton22.setX(120);
        myButton22.setY(850);
        myButton22.setOnClickListener(this);

        Button myButton23 = (Button) findViewById(R.id.button_journal);
        myButton23.setX(120);
        myButton23.setY(990);
        myButton23.setOnClickListener(this);

        Button myButton24 = (Button) findViewById(R.id.button_hamilton);
        myButton24.setX(690);
        myButton24.setY(990);
        myButton24.setOnClickListener(this);

        Button myButton25 = (Button) findViewById(R.id.button_hartley);
        myButton25.setX(850);
        myButton25.setY(1080);
        myButton25.setOnClickListener(this);

        Button myButton26 = (Button) findViewById(R.id.button_furnald);
        myButton26.setX(120);
        myButton26.setY(1080);
        myButton26.setOnClickListener(this);

        Button myButton27 = (Button) findViewById(R.id.button_lerner);
        myButton27.setX(120);
        myButton27.setY(1220);
        myButton27.setOnClickListener(this);

        Button myButton28 = (Button) findViewById(R.id.button_carmen);
        myButton28.setX(160);
        myButton28.setY(1340);
        myButton28.setOnClickListener(this);

        Button myButton29 = (Button) findViewById(R.id.button_butler);
        myButton29.setX(390);
        myButton29.setY(1260);
        myButton29.setOnClickListener(this);

        Button myButton30 = (Button) findViewById(R.id.button_wallach);
        myButton30.setX(850);
        myButton30.setY(1230);
        myButton30.setOnClickListener(this);

        Button myButton31 = (Button) findViewById(R.id.button_johnjay);
        myButton31.setX(700);
        myButton31.setY(1320);
        myButton31.setOnClickListener(this);


        /*
        Button myButton = (Button) findViewById(R.id.button_);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

        Button myButton = (Button) findViewById(R.id.button_noco);
        myButton.setX(120);
        myButton.setY(20);

    */

    }
   public void onClick(View v){
       switch (v.getId()) {
           case R.id.button_noco:
               startActivity(new Intent(map_screen.this,noco.class));
               break;
           case  R.id.button_butler:
               startActivity(new Intent(map_screen.this,butler.class));
               break;
           case R.id.button_hamilton:
               startActivity(new Intent(map_screen.this,ham.class));
               break;
           case R.id.button_dodge:
               startActivity(new Intent(map_screen.this,gym.class));
               break;
           case R.id.button_johnjay:
               startActivity(new Intent(map_screen.this,johnjay.class));
               break;
           case R.id.button_havemeyer:
               startActivity(new Intent(map_screen.this,havemayer.class));
               break;
       }

   }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /** Called when the use clicks the Send button */


}
