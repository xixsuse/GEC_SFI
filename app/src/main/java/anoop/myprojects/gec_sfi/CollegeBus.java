package anoop.myprojects.gec_sfi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CollegeBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_bus);
    }

    public void busOne(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
    public void busTwo(View view){
        Intent intent = new Intent(CollegeBus.this,Bus2.class);
        startActivity(intent);



    }
    public void busThree(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
    public void busFour(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
    public void busFive(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
    public void busSix(View view){

        Intent intent = new Intent(CollegeBus.this,Bus1.class);
        startActivity(intent);



    }
}
