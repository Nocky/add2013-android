package org.gdgankara.app.activities;

import org.gdgankara.app.R;
import org.gdgankara.app.utils.Util;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener{

	private Button tweetWallButton,programButton,haritaButton,oturumButton,sponsorButton,favoriButton,konusmaciButton;
	private ImageView araButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Util.prepareStaticLists(this);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		setUpButtons();
		buttonsActive();
		
	}
	private void setUpButtons(){
		tweetWallButton = (Button) findViewById(R.id.tweetWall);
		favoriButton = (Button) findViewById(R.id.favori_button);
		haritaButton=(Button) findViewById(R.id.harita_button);
		sponsorButton=(Button) findViewById(R.id.sponsor_button);
		oturumButton=(Button) findViewById(R.id.oturum_button);
		programButton=(Button) findViewById(R.id.program_button);
		araButton = (ImageView)findViewById(R.id.search_button);
		konusmaciButton=(Button)findViewById(R.id.speakers_button);
	}
	
	private void buttonsActive(){
		tweetWallButton.setOnClickListener(this);
		favoriButton.setOnClickListener(this);
		haritaButton.setOnClickListener(this);
		sponsorButton.setOnClickListener(this);
		oturumButton.setOnClickListener(this);
		programButton.setOnClickListener(this);
		konusmaciButton.setOnClickListener(this);
		araButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		Intent i=null;
		
		switch(arg0.getId()){
		
		case R.id.tweetWall:
			i = new Intent(MainActivity.this , TweetWallActivity.class);
			startActivity(i);
			break;
			
		case R.id.program_button:
			break;
			
		case R.id.harita_button:
			break;
			
		case R.id.sponsor_button:
			break;
			
		case R.id.oturum_button:
			i = new Intent(MainActivity.this ,TagListActivity.class);
			startActivity(i);
			break;
			
		case R.id.favori_button:
			break;
			
		case R.id.speakers_button:
			i = new Intent(MainActivity.this ,SpeakerListActivity.class);
			startActivity(i);
			break;
		case R.id.search_button:
			i = new Intent(MainActivity.this , SearchActivity.class);
			startActivity(i);
			break;
		
		}
		
		
//		startActivity(i);
		
	}

}
