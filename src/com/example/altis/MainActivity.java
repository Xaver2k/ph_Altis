package com.example.altis;

import java.text.DecimalFormat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {
	static int buﬂgeldvalue=0;
	static DecimalFormat buﬂgeldvalue_dezimal=new DecimalFormat();
	static View rootView_main;
	static View rootView_info;
	static View rootView_regeln;
	static View rootView_bussgeld;
    static TextView textView_main;
	static TextView textView_info;
	static TextView textView_regeln;
    static TextView buﬂgeldtext;
    static CheckBox cb01;
	static CheckBox cb02;
	static CheckBox cb03;
	static CheckBox cb04;
	static CheckBox cb05;
	static CheckBox cb06;
	static CheckBox cb07;
	static CheckBox cb08;
	static CheckBox cb09;
	static CheckBox cb10;
	static CheckBox cb11;
	static CheckBox cb12;
	static CheckBox cb13;
	static CheckBox cb14;
	static CheckBox cb15;
	static CheckBox cb16;
	static CheckBox cb17;
	static CheckBox cb18;
	static CheckBox cb19;
	static CheckBox cb20;
	static CheckBox cb21;
	static CheckBox cb22;
	static CheckBox cb23;
	static CheckBox cb24;
	static CheckBox cb25;
	static CheckBox cb26;
	static CheckBox cb27;
	static CheckBox cb28;
	static CheckBox cb29;
	static CheckBox cb30;
	static CheckBox cb31;
	static CheckBox cb32;
	static CheckBox cb33;
	static CheckBox cb34;
	static CheckBox cb35;
    static CheckBox cb36;
    static CheckBox cb37;
    static CheckBox cb38;
    static CheckBox cb39;
    static CheckBox cb40;
    static CheckBox cb41;
    static CheckBox cb42;
    static CheckBox cb43;
    static CheckBox cb44;
    static CheckBox cb45;
    static CheckBox cb46;
    static CheckBox cb47;
    static CheckBox cb48;
    static CheckBox cb49;
    static CheckBox cb50;


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }
	
	// Get Section Header String
    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break; 
			default:
				break;
        }
    }

	// Set Header text according to selected Section 
    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle("Altis Force - "+mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
        	
            //getMenuInflater().inflate(R.menu.main, menu);     // Optionsmen¸
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {           
            
            //Screens Initialisieren
            switch (getArguments().getInt(ARG_SECTION_NUMBER)) 
            {            
            case 1:	// Home Screen
                rootView_main = inflater.inflate(R.layout.fragment_main, container, false);
                textView_main = (TextView) rootView_main.findViewById(R.id.section_label_main);
                final WebView wv = (WebView) rootView_main.findViewById(R.id.webView01);
				
				textView_main.setText(Html.fromHtml(getString(R.string.htmlstring_main)));
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.getSettings().setJavaScriptEnabled(true);
            	wv.setWebViewClient(new WebViewClient());
            	wv.loadUrl("http://www.youtube.com/embed/vXmmHfFoHwU");

            	return rootView_main;
            	//break;
				
            case 2:	// Info Screen 
                rootView_info = inflater.inflate(R.layout.fragment_info, container, false);
                textView_info = (TextView) rootView_info.findViewById(R.id.section_label_info);
				
				textView_info.setText(Html.fromHtml(getString(R.string.htmlstring_info)));
                Button button = (Button) rootView_info.findViewById(R.id.button_copy);
                    
            	return rootView_info;
				
            case 3: // Rules Screen
                rootView_regeln = inflater.inflate(R.layout.fragment_regeln, container, false);
                textView_regeln = (TextView) rootView_regeln.findViewById(R.id.section_label_regeln);
            	
				textView_regeln.setText(Html.fromHtml(getString(R.string.htmlstring_regeln)));
            	
				return rootView_regeln;
				
            case 4: // Bounty calculator Screen
            	rootView_bussgeld = inflater.inflate(R.layout.fragment_bussgeld, container, false);
                buﬂgeldtext = (TextView) rootView_bussgeld.findViewById(R.id.section_label2);
            	
				buﬂgeldvalue=0;
            	
				// Checkboxen initialisieren
            	cb01=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox01);
            	cb02=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox02);
            	cb03=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox03);
            	cb04=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox04);
            	cb05=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox05);
            	cb06=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox06);
            	cb07=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox07);
            	cb08=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox08);
            	cb09=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox09);
            	cb10=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox10);
            	cb11=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox11);
            	cb12=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox12);
            	cb13=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox13);
            	cb14=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox14);
            	cb15=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox15);
            	cb16=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox16);
            	cb17=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox17);
            	cb18=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox18);
            	cb19=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox19);
            	cb20=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox20);
            	cb21=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox21);
            	cb22=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox22);
            	cb23=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox23);
            	cb24=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox24);
            	cb25=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox25);
            	cb26=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox26);
            	cb27=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox27);
            	cb28=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox28);
            	cb29=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox29);
            	cb30=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox30);
            	cb31=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox31);
            	cb32=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox32);
            	cb33=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox33);
            	cb34=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox34);
            	cb35=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox35);
            	cb36=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox36);
            	cb37=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox37);
            	cb38=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox38);
            	cb39=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox39);
            	cb40=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox40);
            	cb41=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox41);
            	cb42=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox42);
            	cb43=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox43);
            	cb44=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox44);
            	//cb45=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox45);
            	//cb46=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox46);
            	//cb47=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox47);
            	//cb48=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox48);
            	//cb49=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox49);
            	//cb50=(CheckBox)rootView_bussgeld.findViewById(R.id.CheckBox50);
            	
              //Checkboxen darstellen
            	cb01.setVisibility(View.VISIBLE);
            	cb02.setVisibility(View.VISIBLE);
            	cb03.setVisibility(View.VISIBLE);
            	cb04.setVisibility(View.VISIBLE);
            	cb05.setVisibility(View.VISIBLE);
            	cb06.setVisibility(View.VISIBLE);
            	cb07.setVisibility(View.VISIBLE);
            	cb08.setVisibility(View.VISIBLE);
            	cb09.setVisibility(View.VISIBLE);
            	cb10.setVisibility(View.VISIBLE);
            	cb11.setVisibility(View.VISIBLE);
            	cb12.setVisibility(View.VISIBLE);
            	cb13.setVisibility(View.VISIBLE);
            	cb14.setVisibility(View.VISIBLE);
            	cb15.setVisibility(View.VISIBLE);
            	cb16.setVisibility(View.VISIBLE);
            	cb17.setVisibility(View.VISIBLE);
            	cb18.setVisibility(View.VISIBLE);
            	cb19.setVisibility(View.VISIBLE);
            	cb20.setVisibility(View.VISIBLE);
            	cb21.setVisibility(View.VISIBLE);
            	cb22.setVisibility(View.VISIBLE);
            	cb23.setVisibility(View.VISIBLE);
            	cb24.setVisibility(View.VISIBLE);
            	cb25.setVisibility(View.VISIBLE);
            	cb26.setVisibility(View.VISIBLE);
            	cb27.setVisibility(View.VISIBLE);
            	cb28.setVisibility(View.VISIBLE);
            	cb29.setVisibility(View.VISIBLE);
            	cb30.setVisibility(View.VISIBLE);
            	cb31.setVisibility(View.VISIBLE);
            	cb32.setVisibility(View.VISIBLE);
            	cb33.setVisibility(View.VISIBLE);
            	cb34.setVisibility(View.VISIBLE);
            	cb35.setVisibility(View.VISIBLE);
            	cb36.setVisibility(View.VISIBLE);
            	cb37.setVisibility(View.VISIBLE);
            	cb38.setVisibility(View.VISIBLE);
            	cb39.setVisibility(View.VISIBLE);
            	cb40.setVisibility(View.VISIBLE);
            	cb41.setVisibility(View.VISIBLE);
            	cb42.setVisibility(View.VISIBLE);
            	cb43.setVisibility(View.VISIBLE);
            	cb44.setVisibility(View.VISIBLE);
            	//cb45.setVisibility(View.VISIBLE);
            	//cb46.setVisibility(View.VISIBLE);
            	//cb47.setVisibility(View.VISIBLE);
            	//cb48.setVisibility(View.VISIBLE);
            	//cb49.setVisibility(View.VISIBLE);
            	//cb50.setVisibility(View.VISIBLE);
            	
            	buﬂgeldakt();
            	return rootView_bussgeld;
            }
            
            return rootView_main;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }

    	
    }
    
	// When Checkbox is clicked, check which one and add/subtract the bounty
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.CheckBox01:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;

                break;     
            
            case R.id.CheckBox02:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;    
                
            case R.id.CheckBox03:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;
                
            case R.id.CheckBox04:
                if (checked)
                	buﬂgeldvalue+=100000;
                else
                	buﬂgeldvalue-=100000;
                break; 
                
            case R.id.CheckBox05:
                if (checked)
                	buﬂgeldvalue+=100000;
                else
                	buﬂgeldvalue-=100000;
                break;    
                
            case R.id.CheckBox06:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;                    
            case R.id.CheckBox07:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox08:
                if (checked)
                	buﬂgeldvalue+=70000;
                else
                	buﬂgeldvalue-=70000;
                break;                    
            case R.id.CheckBox09:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;                    
            case R.id.CheckBox10:
                if (checked)
                	buﬂgeldvalue+=100000;
                else
                	buﬂgeldvalue-=100000;
                break;                    
            case R.id.CheckBox11:
                if (checked)
                	buﬂgeldvalue+=22000;
                else
                	buﬂgeldvalue-=22000;
                break;                    
            case R.id.CheckBox12:
                if (checked)
                	buﬂgeldvalue+=2500;
                else
                	buﬂgeldvalue-=2500;
                break;                    
            case R.id.CheckBox13:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;
                break;                    
            case R.id.CheckBox14:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;
                break;                    
            case R.id.CheckBox15:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;
                break;                    
            case R.id.CheckBox16:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox17:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox18:
                if (checked)
                	buﬂgeldvalue+=50000;
                else
                	buﬂgeldvalue-=50000;
                break;                    
            case R.id.CheckBox19:
                if (checked)
                	buﬂgeldvalue+=15000;
                else
                	buﬂgeldvalue-=15000;
                break;                    
            case R.id.CheckBox20:
                if (checked)
                	buﬂgeldvalue+=300000;
                else
                	buﬂgeldvalue-=300000;
                break;                    
            case R.id.CheckBox21:
                if (checked)
                	buﬂgeldvalue+=8000;
                else
                	buﬂgeldvalue-=8000;
                break;                    
            case R.id.CheckBox22:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox23:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;                    
            case R.id.CheckBox24:
                if (checked)
                	buﬂgeldvalue+=50000;
                else
                	buﬂgeldvalue-=50000;
                break;                    
            case R.id.CheckBox25:
                if (checked)
                	buﬂgeldvalue+=7000;
                else
                	buﬂgeldvalue-=7000;
                break;                    
            case R.id.CheckBox26:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;                    
            case R.id.CheckBox27:
                if (checked)
                	buﬂgeldvalue+=25000;
                else
                	buﬂgeldvalue-=25000;
                break;                    
            case R.id.CheckBox28:
                if (checked)
                	buﬂgeldvalue+=50000;
                else
                	buﬂgeldvalue-=50000;
                break;                    
            case R.id.CheckBox29:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox30:
                if (checked)
                	buﬂgeldvalue+=20000;
                else
                	buﬂgeldvalue-=20000;
                break;                    
            case R.id.CheckBox31:
                if (checked)
                	buﬂgeldvalue+=2500;
                else
                	buﬂgeldvalue-=2500;
                break;                    
            case R.id.CheckBox32:
                if (checked)
                	buﬂgeldvalue+=3000;
                else
                	buﬂgeldvalue-=3000;
                break;                    
            case R.id.CheckBox33:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;
                break;                    
            case R.id.CheckBox34:
                if (checked)
                	buﬂgeldvalue+=10000;
                else
                	buﬂgeldvalue-=10000;
                break;                    
            case R.id.CheckBox35:
                if (checked)
                	buﬂgeldvalue+=2000;
                else
                	buﬂgeldvalue-=2000;
                break;                    
            case R.id.CheckBox36:
                if (checked)
                	buﬂgeldvalue+=5500;
                else
                	buﬂgeldvalue-=5500;
                break;                    
            case R.id.CheckBox37:
                if (checked)
                	buﬂgeldvalue+=1500;
                else
                	buﬂgeldvalue-=1500;
                break;                    
            case R.id.CheckBox38:
                if (checked)
                	buﬂgeldvalue+=2000;
                else
                	buﬂgeldvalue-=2000;
                break;                    
            case R.id.CheckBox39:
                if (checked)
                	buﬂgeldvalue+=15000;
                else
                	buﬂgeldvalue-=15000;
                break;                    
            case R.id.CheckBox40:
                if (checked)
                	buﬂgeldvalue+=2500;
                else
                	buﬂgeldvalue-=2500;
                break;                    
            case R.id.CheckBox41:
                if (checked)
                	buﬂgeldvalue+=100000;
                else
                	buﬂgeldvalue-=100000;
                break;                    
            case R.id.CheckBox42:
                if (checked)
                	buﬂgeldvalue+=2500;
                else
                	buﬂgeldvalue-=2500;
                break;                    
            case R.id.CheckBox43:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;                    
            case R.id.CheckBox44:
                if (checked)
                	buﬂgeldvalue+=5000;
                else
                	buﬂgeldvalue-=5000;
                break;                    
            case R.id.CheckBox45:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;                    
            case R.id.CheckBox46:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;                    
            case R.id.CheckBox47:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;    
                
            case R.id.CheckBox48:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;    
                
            case R.id.CheckBox49:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;    
                
            case R.id.CheckBox50:
                if (checked)
                	buﬂgeldvalue+=1000;
                else
                	buﬂgeldvalue-=1000;
                break;    
    
        }
        buﬂgeldakt();
    }
    
	//  Update bounty text
    public static void buﬂgeldakt() {  
    	buﬂgeldtext.setText("Buﬂgeld = "+buﬂgeldvalue_dezimal.format(buﬂgeldvalue));
    }  
}    

