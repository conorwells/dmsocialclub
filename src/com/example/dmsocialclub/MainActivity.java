package com.example.dmsocialclub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
	
	public void sendMessage (View view) {
		Intent intent = new Intent(this, CategoryDropdown.class);
		startActivity(intent);
	}
	
	public void sendMessageContact (View view) {
		Intent intent = new Intent(this, Contact.class);
		startActivity(intent);
	}
	
	public void sendMessageDateDropDown (View view) {
		Intent intent = new Intent(this, DateDropdown.class);
		startActivity(intent);
	}
	
	public void sendMessageEvent (View view) {
		Intent intent = new Intent(this, Event.class);
		startActivity(intent);
	}
	
	public void sendMessageFinishedFilter (View view) {
		Intent intent = new Intent(this, FinishedFilter.class);
		startActivity(intent);
	}
	
	public void sendMessageHomeAgain (View view) {
		Intent intent = new Intent(this, HomeAgain.class);
		startActivity(intent);
	}
	
	public void sendMessagePriceDropDown (View view) {
		Intent intent = new Intent(this, PriceDropdown.class);
		startActivity(intent);
	}
	
	public void sendMessageRecommenedEvent (View view) {
		Intent intent = new Intent(this, RecommendedEvents.class);
		startActivity(intent);
	}
	
	public void sendMessageSearchResult (View view) {
		Intent intent = new Intent(this, SearchResults.class);
		startActivity(intent);
	}
	
	public void sendMessageSearch (View view) {
		Intent intent = new Intent(this, Search.class);
		startActivity(intent);
	}
}
