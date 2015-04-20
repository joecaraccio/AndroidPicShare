package com.joec.picshare;


import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

/*
 * This is the parse object I created called activity
 * we reference it in a bunch of other java classes here
 */

@ParseClassName("Activity")
public class Activity extends ParseObject {
	
	public Activity() {
		// A default constructor is required.
	}
	
	public ParseUser getFromUser(){
		return getParseUser("fromUser");
	}
	
	public void setFromUser(ParseUser user){
		put("fromUser", user);
	}
	
	public ParseUser getToUser(){
		return getParseUser("toUser");
	}
	
	public void setToUser(ParseUser user){
		put("toUser", user);
	}
	
	public String getType(){
		return getString("type");
	}
	
	public void setType(String t){
		put("type", t);
	}
	
	public String getContent(){
		return getString("content");
	}
	
	public void setContent(String c){
		put("content", c);
	}
	
	public ParseFile getPhoto(){
		return getParseFile("photo");
	}
	
	
	//the photo file we use for each picture
	public void setPhoto(ParseFile pf){
		put("photo", pf);
	}
}

