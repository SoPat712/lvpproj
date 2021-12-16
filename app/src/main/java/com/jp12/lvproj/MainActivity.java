package com.jp12.lvproj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textViewer;
    TextView textViewer2;
    TextView textViewer3;
    int orientation;
    int curPos;
    ArrayList<String> stockSymbols;
    ArrayList<String> stockNames;
    ArrayList<String> stockDescriptions;
    ArrayList<Double> stockPrices;
    ArrayList<Drawable> stockImages;
    final static String KEYEK = "abcd123";
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEYEK,curPos);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d("TAG", "onRestoreInstanceState: asdfasdgasg");
        orientation = getResources().getConfiguration().orientation;
        super.onRestoreInstanceState(savedInstanceState);
        curPos = savedInstanceState.getInt(KEYEK,0);
        textViewer.setText("Name: "+stockNames.get(curPos));
        textViewer2.setText("Price: "+stockPrices.get(curPos));
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textViewer3.setText("Description: "+stockDescriptions.get(curPos));
        } else {
            // In portrait
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateStockSymbols();
        populateStockNames();
        populateStockPrices();
        populateStockDescripts();
        populateStockImages();
        orientation = getResources().getConfiguration().orientation;
        listView = findViewById(R.id.id_list_view);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.adapter_custom, stockSymbols);
        listView.setAdapter(customAdapter);
        textViewer = findViewById(R.id.textView);
        textViewer2 = findViewById(R.id.textView2);
        textViewer3 = findViewById(R.id.textView3);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                curPos = i;
                textViewer.setText("Name: "+stockNames.get(i));
                textViewer2.setText("Price: "+stockPrices.get(i));
                if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    textViewer3.setText("Description: "+stockDescriptions.get(i));
                } else {
                    // In portrait
                }

            }
        });
    }

    private void populateStockDescripts() {
        stockDescriptions = new ArrayList<>();
        stockDescriptions.add("The afasfdasasigiuhdsgasoiugsgiuhasdg");
        stockDescriptions.add("The ahahah");
        stockDescriptions.add("The zxccbvzxvb");
        stockDescriptions.add("The weryw");
        stockDescriptions.add("The bhghjfdyjfjg");
        stockDescriptions.add("The wetyu");
        stockDescriptions.add("The cbxcxvb");
        stockDescriptions.add("The ndnbvcnvbcn");
        stockDescriptions.add("The dfhfdhfdshgfdgh");
        stockDescriptions.add("The cvbn");
        stockDescriptions.add("The kjkhjk");
        stockDescriptions.add("The tyitiemernewr");
        stockDescriptions.add("The asdhahnebn");
        stockDescriptions.add("The nnern");
        stockDescriptions.add("The qagf");
        stockDescriptions.add("The aidwsvihgf");
        stockDescriptions.add("The qeribggv");
        stockDescriptions.add("The qwfdfdoqfe");
        stockDescriptions.add("The qerwgounqwrotqwoijtqoijwer");
        stockDescriptions.add("The etwnqewnqrenqenr");
    }

    private void populateStockImages() {
        stockImages = new ArrayList<>();
        stockImages.add(getDrawable(R.drawable.irbt));
        stockImages.add(getDrawable(R.drawable.upwork));
        stockImages.add(getDrawable(R.drawable.fiverrr));
        stockImages.add(getDrawable(R.drawable.rdfn));
        stockImages.add(getDrawable(R.drawable.bydnmt));
        stockImages.add(getDrawable(R.drawable.etsy));
        stockImages.add(getDrawable(R.drawable.teladoc));
        stockImages.add(getDrawable(R.drawable.zg));
        stockImages.add(getDrawable(R.drawable.pinterest));
        stockImages.add(getDrawable(R.drawable.roku));
        stockImages.add(getDrawable(R.drawable.altria));
        stockImages.add(getDrawable(R.drawable.mercado));
        stockImages.add(getDrawable(R.drawable.intuit));
        stockImages.add(getDrawable(R.drawable.square));
        stockImages.add(getDrawable(R.drawable.sea));
        stockImages.add(getDrawable(R.drawable.philmorr));
        stockImages.add(getDrawable(R.drawable.salesforce));
        stockImages.add(getDrawable(R.drawable.disney));
        stockImages.add(getDrawable(R.drawable.brk));
        stockImages.add(getDrawable(R.drawable.amazon));
    }

    private void populateStockPrices() {
        stockPrices = new ArrayList<>();
        stockPrices.add(67.96);
        stockPrices.add(34.06);
        stockPrices.add(125.61);
        stockPrices.add(40.25);
        stockPrices.add(64.14);
        stockPrices.add(224.26);
        stockPrices.add(94.22);
        stockPrices.add(59.55);
        stockPrices.add(37.08);
        stockPrices.add(228.49);
        stockPrices.add(45.21);
        stockPrices.add(1146.50);
        stockPrices.add(344.46);
        stockPrices.add(180.55);
        stockPrices.add(238.86);
        stockPrices.add(90.03);
        stockPrices.add(265.21);
        stockPrices.add(152.46);
        stockPrices.add(287.53);
        stockPrices.add(3419.35);
    }

    private void populateStockNames() {
        stockNames = new ArrayList<>();
        stockNames.add("iRobot");
        stockNames.add("Upwork");
        stockNames.add("Fiverr");
        stockNames.add("Redfin");
        stockNames.add("Beyond Meat");
        stockNames.add("Etsy");
        stockNames.add("Teladoc Health");
        stockNames.add("Zillow Group");
        stockNames.add("Pinterest");
        stockNames.add("Roku");
        stockNames.add("Altria Group");
        stockNames.add("MercadoLibre");
        stockNames.add("Intuitive Surgical");
        stockNames.add("Square");
        stockNames.add("Sea Limited");
        stockNames.add("Philip Morris International");
        stockNames.add("salesforce.com");
        stockNames.add("Walt Disney");
        stockNames.add("Berkshire Hathaway B");
        stockNames.add("Amazon");
    }

    private void populateStockSymbols() {
        stockSymbols = new ArrayList<>();
        stockSymbols.add("IRBT");
        stockSymbols.add("UPWK");
        stockSymbols.add("FVRR");
        stockSymbols.add("RDFN");
        stockSymbols.add("BYND");
        stockSymbols.add("ETSY");
        stockSymbols.add("TDOC");
        stockSymbols.add("ZG");
        stockSymbols.add("PINS");
        stockSymbols.add("ROKU");
        stockSymbols.add("MO");
        stockSymbols.add("MELI");
        stockSymbols.add("ISRG");
        stockSymbols.add("SQ");
        stockSymbols.add("SE");
        stockSymbols.add("PM");
        stockSymbols.add("CRM");
        stockSymbols.add("DIS");
        stockSymbols.add("BRK.B");
        stockSymbols.add("AMZN");
    }

    public class CustomAdapter extends ArrayAdapter<String> {
        Context mainActivityContext;
        public CustomAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
            super(context, resource, objects);
            mainActivityContext = context;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            ImageView imageView;
            TextView textView;

            LayoutInflater layoutInflater = (LayoutInflater) mainActivityContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View v = layoutInflater.inflate(R.layout.adapter_custom, null);
            textView = v.findViewById(R.id.id_adapter_textView);
            textView.setText(stockSymbols.get(position));
            imageView = v.findViewById(R.id.imageView);
            imageView.setImageDrawable(stockImages.get(position));
            return v;
        }
    }
}