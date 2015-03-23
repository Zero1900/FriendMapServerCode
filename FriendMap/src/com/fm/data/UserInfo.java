package com.fm.data;

import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class UserInfo {
	public String userid;//用户id
	public String username;//用户名
	public String password;//密码
	public String nickname;//昵称
	public UserInfo(String username,String password,String nickname){
		this.username=username;
		this.password=password;
		this.nickname=nickname;
	}
	public UserInfo(DBObject dbObject){
		parseDBObject(dbObject);
	}
	public void parseDBObject(DBObject dbObject){
		userid=(String)dbObject.get("_id");
		username=(String)dbObject.get("username");
		password=(String)dbObject.get("password");
		nickname=(String)dbObject.get("nickname");
	}
	public DBObject createDbObject(){
		DBObject dbObject=new BasicDBObject();
		dbObject.put("_id", userid);
		dbObject.put("username", username);
		dbObject.put("password", password);
		dbObject.put("nickname", nickname);
		return dbObject;
	}
	/**
	 * 创建包含完整数据的jsonObject
	 * @return
	 * @throws JSONException
	 */
	public JSONObject createJson() throws JSONException{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("userid", userid);
		jsonObject.put("username", username);
		jsonObject.put("password", password);
		jsonObject.put("nickname", nickname);
		return jsonObject;
	}
	/**
	 * 创建用来展示的jsonObject
	 * @return
	 * @throws JSONException
	 */
	public JSONObject createJsonForShow() throws JSONException{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("userid", userid);
		jsonObject.put("username", username);
		jsonObject.put("nickname", nickname);
		return jsonObject;
	}
}
