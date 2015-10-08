package com.example.bjol7457.therealaboutme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity
{
    private int clickCount;
    private Button changeSlideButton;
    private ImageView selfieImage;
    private ImageView soccerImage;
    private ImageView booksImage;
    private ImageView borderlandsImage;
    private ImageView woodshopImage;
    private ImageView schoolImage;
    private TextView aboutMeTitleText;
    private TextView soccerText;
    private TextView booksText;
    private TextView borderlandsText;
    private TextView woodshopText;
    private TextView schoolText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        clickCount = 0;
        changeSlideButton = (Button) findViewById(R.id.changeSlideButton);
        selfieImage = (ImageView) findViewById(R.id.selfieImage);
        soccerImage = (ImageView) findViewById(R.id.soccerImage);
        booksImage = (ImageView) findViewById(R.id.booksImage);
        borderlandsImage = (ImageView) findViewById(R.id.borderlandsImage);
        woodshopImage = (ImageView) findViewById(R.id.woodshopImage);
        schoolImage = (ImageView) findViewById(R.id.schoolImage);
        aboutMeTitleText = (TextView) findViewById(R.id.aboutMeTitleText);
        soccerText = (TextView) findViewById(R.id.soccerText);
        booksText = (TextView) findViewById(R.id.booksText);
        borderlandsText = (TextView) findViewById(R.id.borderlandsText);
        woodshopText = (TextView) findViewById(R.id.woodshopText);
        schoolText = (TextView) findViewById(R.id.schoolText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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

    public void changeVisibility()
    {
        clickCount = (clickCount + 1);

        if(clickCount == 0)
        {
            schoolImage.setVisibility(View.GONE);
            schoolText.setVisibility(View.GONE);
            selfieImage.setVisibility(View.VISIBLE);
            aboutMeTitleText.setVisibility(View.VISIBLE);
        }
        if(clickCount == 1)
        {
            selfieImage.setVisibility(View.GONE);
            aboutMeTitleText.setVisibility(View.GONE);
            soccerImage.setVisibility(View.VISIBLE);
            soccerText.setVisibility(View.VISIBLE);
        }
        if(clickCount == 2)
        {
            soccerImage.setVisibility(View.GONE);
            soccerText.setVisibility(View.GONE);
            booksImage.setVisibility(View.VISIBLE);
            booksText.setVisibility(View.VISIBLE);
        }
        if(clickCount == 3)
        {
            booksImage.setVisibility(View.GONE);
            booksText.setVisibility(View.GONE);
            borderlandsImage.setVisibility(View.VISIBLE);
            borderlandsText.setVisibility(View.VISIBLE);
        }
        if(clickCount == 4)
        {
            borderlandsImage.setVisibility(View.GONE);
            borderlandsText.setVisibility(View.GONE);
            woodshopImage.setVisibility(View.VISIBLE);
            woodshopText.setVisibility(View.VISIBLE);
        }
        if(clickCount == 5)
        {
            woodshopImage.setVisibility(View.GONE);
            woodshopText.setVisibility(View.GONE);
            schoolImage.setVisibility(View.VISIBLE);
            schoolText.setVisibility(View.VISIBLE);
            clickCount = 0;
        }







    }
    private void setupListeners()
    {
        changeSlideButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
            changeVisibility();
            }

        });

    }




}
