package com.example.brett.guideapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class map_screen extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen);

        //-----------------------------------------------------------
        // BUTTONS

        Button myButton1 = (Button) findViewById(R.id.button_noco);
        myButton1.setX(120);
        myButton1.setY(30);

        Button myButton2 = (Button) findViewById(R.id.button_pupin);
        myButton2.setX(220);
        myButton2.setY(30);

        Button myButton3 = (Button) findViewById(R.id.button_gym);
        myButton3.setX(220);
        myButton3.setY(100);

        Button myButton4 = (Button) findViewById(R.id.button_schapiro);
        myButton4.setX(440);
        myButton4.setY(40);

        Button myButton5 = (Button) findViewById(R.id.button_mudd);
        myButton5.setX(650);
        myButton5.setY(30);

        Button myButton6 = (Button) findViewById(R.id.button_fairchild);
        myButton6.setX(680);
        myButton6.setY(120);

        Button myButton7 = (Button) findViewById(R.id.button_cs);
        myButton7.setX(850);
        myButton7.setY(120);

        Button myButton8 = (Button) findViewById(R.id.button_schermerhorn);
        myButton8.setX(700);
        myButton8.setY(320);

        Button myButton9 = (Button) findViewById(R.id.button_uris);
        myButton9.setX(420);
        myButton9.setY(220);

        Button myButton10 = (Button) findViewById(R.id.button_havemeyer);
        myButton10.setX(120);
        myButton10.setY(320);

        Button myButton11 = (Button) findViewById(R.id.button_chandler);
        myButton11.setX(120);
        myButton11.setY(220);

        Button myButton12 = (Button) findViewById(R.id.button_math);
        myButton12.setX(120);
        myButton12.setY(450);

        Button myButton13 = (Button) findViewById(R.id.button_avery);
        myButton13.setX(680);
        myButton13.setY(450);

        Button myButton14 = (Button) findViewById(R.id.button_fayer);
        myButton14.setX(850);
        myButton14.setY(450);

        Button myButton15 = (Button) findViewById(R.id.button_stpaul);
        myButton15.setX(730);
        myButton15.setY(600);

        Button myButton16 = (Button) findViewById(R.id.button_low);
        myButton16.setX(420);
        myButton16.setY(550);

        Button myButton17 = (Button) findViewById(R.id.button_earl);
        myButton17.setX(220);
        myButton17.setY(600);

        Button myButton18 = (Button) findViewById(R.id.button_lewi);
        myButton18.setX(120);
        myButton18.setY(700);

        Button myButton19 = (Button) findViewById(R.id.button_buell);
        myButton19.setX(680);
        myButton19.setY(700);

        Button myButton20 = (Button) findViewById(R.id.button_philo);
        myButton20.setX(850);
        myButton20.setY(700);

        Button myButton21 = (Button) findViewById(R.id.button_kent);
        myButton21.setX(690);
        myButton21.setY(850);

        Button myButton22 = (Button) findViewById(R.id.button_dodge);
        myButton22.setX(120);
        myButton22.setY(850);

        Button myButton23 = (Button) findViewById(R.id.button_journal);
        myButton23.setX(120);
        myButton23.setY(990);

        Button myButton24 = (Button) findViewById(R.id.button_hamilton);
        myButton24.setX(690);
        myButton24.setY(990);

        Button myButton25 = (Button) findViewById(R.id.button_hartley);
        myButton25.setX(850);
        myButton25.setY(1080);

        Button myButton26 = (Button) findViewById(R.id.button_furnald);
        myButton26.setX(120);
        myButton26.setY(1080);

        Button myButton27 = (Button) findViewById(R.id.button_lerner);
        myButton27.setX(120);
        myButton27.setY(1220);

        Button myButton28 = (Button) findViewById(R.id.button_carmen);
        myButton28.setX(160);
        myButton28.setY(1340);

        Button myButton29 = (Button) findViewById(R.id.button_butler);
        myButton29.setX(390);
        myButton29.setY(1260);

        Button myButton30 = (Button) findViewById(R.id.button_wallach);
        myButton30.setX(850);
        myButton30.setY(1230);

        Button myButton31 = (Button) findViewById(R.id.button_johnjay);
        myButton31.setX(700);
        myButton31.setY(1320);


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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.map_screen, menu);
        return true;
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
